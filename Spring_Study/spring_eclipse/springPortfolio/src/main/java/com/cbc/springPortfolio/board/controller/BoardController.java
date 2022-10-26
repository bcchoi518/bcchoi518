package com.cbc.springPortfolio.board.controller;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cbc.springPortfolio.board.model.dto.BoardDTO;
import com.cbc.springPortfolio.board.service.BoardService;
import com.cbc.springPortfolio.common.Util;
import com.cbc.springPortfolio.guestBook.model.dto.GuestBookDTO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Inject
	BoardService boardService;
	@Inject
	Util util;
	
	String folderName = "board";
	
	@RequestMapping("/list")
	public String list(Model model, @ModelAttribute BoardDTO arguDto, BindingResult bindingResult) {
		String searchGubun = util.getDecodedUrl(arguDto.getSearchGubun());
		String searchData = util.getDecodedUrl(arguDto.getSearchData());
		arguDto.setSearchGubun(searchGubun);
		arguDto.setSearchData(searchData);
		
		int pageNumber = arguDto.getPageNumber();
		int pageSize = 1;
		int blockSize = 10;
		int totalRecord = boardService.getTotalRecord(arguDto);
		
		Map<String, Integer> pagerMap = util.getPagerMap(pageNumber, pageSize, blockSize, totalRecord);
		pagerMap.put("blockSize", blockSize);
		
		arguDto.setStartRecord(pagerMap.get("startRecord"));
		arguDto.setLastRecord(pagerMap.get("lastRecord"));
		
		List<BoardDTO> list = boardService.getSelectAll(arguDto);
		
		model.addAttribute("list", list);
		model.addAttribute("pagerMap", pagerMap);
		model.addAttribute("pageNumber", pageNumber);
		model.addAttribute("totalRecord", totalRecord);
		model.addAttribute("searchGubun", searchGubun);
		model.addAttribute("searchData", searchData);
		model.addAttribute("folderName", folderName);
		model.addAttribute("fileName", "list");
		return "main/main";
	}//list
	
	@RequestMapping("/view")
	public String view(Model model, @ModelAttribute BoardDTO arguDto) {
		if (arguDto.getNo() <= 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		String viewPasswd = util.getCheckString(arguDto.getViewPasswd());
		boardService.setUpdateHit(arguDto);
		BoardDTO returnDto = boardService.getSelectOne(arguDto);
		
		if (returnDto.getNo() <= 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		model.addAttribute("dto", returnDto);
		model.addAttribute("viewPasswd", viewPasswd);
		model.addAttribute("folderName", folderName);
		model.addAttribute("fileName", "view");
		return "main/main";
	}//view
	
	@RequestMapping("/chuga")
	public String chuga(Model model, @ModelAttribute BoardDTO arguDto, BindingResult bindingResult) {
		if (arguDto.getNo() > 0) {
			BoardDTO returnDto = boardService.getSelectOne(arguDto);
			
			if (returnDto.getNo() <= 0) {
				System.out.println("wrong no");
				return "redirect:/"+ folderName +"/list";
			}//if
			
			model.addAttribute("dto", returnDto);
		}//if
		
		model.addAttribute("pageNumber", arguDto.getPageNumber());
		model.addAttribute("folderName", folderName);
		model.addAttribute("fileName", "chuga");
		return "main/main";
	}//chuga
	
	@RequestMapping("/chugaProc")
	public String chugaProc(Model model, @ModelAttribute BoardDTO arguDto, BindingResult bindingResult, HttpServletRequest request) throws UnknownHostException {
		String writer = util.getNullBlankCheck(arguDto.getWriter());
		String passwd = util.getNullBlankCheck(arguDto.getPasswd());
		String email1 = util.getNullBlankCheck(arguDto.getEmail1());
		String email2 = util.getNullBlankCheck(arguDto.getEmail2());
		String secretGubun = util.getNullBlankCheck(arguDto.getSecretGubun());
		String noticeGubun = util.getNullBlankCheck(arguDto.getNoticeGubun());
		String subject = util.getNullBlankCheck(arguDto.getSubject());
		String content = util.getNullBlankCheck(arguDto.getContent());
		
		int failCounter = 0;
		if (writer.equals("")) {
			System.out.println("writer error");
			failCounter++;
		} else if (passwd.equals("")) {
			System.out.println("passwd error");
			failCounter++;
		} else if (email1.equals("")) {
			System.out.println("email1 error");
			failCounter++;
		} else if (email2.equals("")) {
			System.out.println("email2 error");
			failCounter++;
		} else if (secretGubun.equals("") || !(secretGubun.equals("T") || secretGubun.equals("F"))) {
			System.out.println("secretGubun error");
			failCounter++;
		} else if (noticeGubun.equals("") || !(secretGubun.equals("T") || secretGubun.equals("F"))) {
			System.out.println("noticeGubun error");
			failCounter++;
		} else if (noticeGubun.equals("T") && secretGubun.equals("T")) {
			System.out.println("T && T error");
			failCounter++;
		} else if (subject.equals("")) {
			System.out.println("subject error");
			failCounter++;
		} else if (content.equals("")) {
			System.out.println("content error");
			failCounter++;
		}//if
		
		writer = util.getCheckString(writer);
		passwd = util.getCheckString(passwd);
		email1 = util.getCheckString(email1);
		email2 = util.getCheckString(email2);
		secretGubun = util.getCheckString(secretGubun);
		noticeGubun = util.getCheckString(noticeGubun);
		subject = util.getCheckString(subject);
		content = util.getCheckString(content);
		
		String[] serverInfos = util.getServerInfo(request);
		
		int num = boardService.getMaxValue("num") + 1;
		String tbl = arguDto.getTbl();
		String email = email1 +"@"+ email2;
		int refNo = 0;
		int stepNo = 0;
		int levelNo = 0;
		int parentNo = 0;
		int hit = 0;
		String ip = serverInfos[4];
		int memberNo = 0;
		int noticeNo = 0;
		String attachInfo = "-"; 
		
		BoardDTO returnDto = boardService.getSelectOne(arguDto);
		
		if (arguDto.getNo() == 0) {//새글일때..
			refNo = boardService.getMaxValue("refNo") + 1;
			stepNo = 1;
			levelNo = 1;
		} else if (returnDto.getNo() > 0) {//답글일때..
			refNo = returnDto.getRefNo();
			stepNo = returnDto.getStepNo() + 1;
			boardService.setUpdateReLevel(returnDto);
			levelNo = returnDto.getLevelNo() + 1;
			parentNo = returnDto.getNo();
		} else {
			System.out.println("새글 답글 error");
			failCounter++;
		}//if

		if (noticeGubun.equals("T")) {//공지글일때..
			noticeNo = boardService.getMaxValue("noticeNo") + 1;
		}//if
		
		if (failCounter > 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		arguDto.setNum(num);
		arguDto.setTbl(tbl);
		arguDto.setWriter(writer);
		arguDto.setSubject(subject);
		arguDto.setContent(content);
		arguDto.setEmail(email);
		arguDto.setPasswd(passwd);
		arguDto.setRefNo(refNo);
		arguDto.setStepNo(stepNo);
		arguDto.setLevelNo(levelNo);
		arguDto.setParentNo(parentNo);
		arguDto.setHit(hit);
		arguDto.setIp(ip);
		arguDto.setMemberNo(memberNo);
		arguDto.setNoticeNo(noticeNo);
		arguDto.setSecretGubun(secretGubun);
		arguDto.setAttachInfo(attachInfo);
		
		return "redirect:/board/list";
	}//chugaProc
	
	@RequestMapping("/sujung")
	public String sujung(Model model, @ModelAttribute BoardDTO arguDto, BindingResult bindingResult) {
		if (arguDto.getNo() <= 0) {
			System.out.println("wrong no");
			return "redirect:/"+ folderName +"/list";
		}//if

		BoardDTO returnDto = boardService.getSelectOne(arguDto);
			
		if (returnDto.getNo() <= 0) {
			System.out.println("wrong no");
			return "redirect:/"+ folderName +"/list";
		}//if
		
		model.addAttribute("dto", returnDto);
		model.addAttribute("folderName", folderName);
		model.addAttribute("fileName", "sujung");
		return "main/main";
	}//sujung
	
	@RequestMapping("/sujungProc")
	public String sujungProc(Model model, @ModelAttribute BoardDTO arguDto, BindingResult bindingResult, HttpServletRequest request) {
		
		return "redirect:/board/list";
	}//sujungProc
	
	@RequestMapping("/sakje")
	public String sakje(Model model, @ModelAttribute BoardDTO arguDto, BindingResult bindingResult) {
		if (arguDto.getNo() <= 0) {
			System.out.println("wrong no");
			return "redirect:/"+ folderName +"/list";
		}//if

		BoardDTO returnDto = boardService.getSelectOne(arguDto);
			
		if (returnDto.getNo() <= 0) {
			System.out.println("wrong no");
			return "redirect:/"+ folderName +"/list";
		}//if
		
		model.addAttribute("dto", returnDto);
		model.addAttribute("folderName", folderName);
		model.addAttribute("fileName", "sakje");
		return "main/main";
	}//sakje
	
	@RequestMapping("/sakjeProc")
	public String sakjeProc(Model model, @ModelAttribute BoardDTO arguDto, BindingResult bindingResult) {
		
		return "redirect:/board/list";
	}//sakjeProc
	
	@RequestMapping("/search")
	public String search(Model model, @ModelAttribute GuestBookDTO arguDto, BindingResult bindingResult) {
		String searchGubun = arguDto.getSearchGubun();
		String searchData = arguDto.getSearchData();
		
		if (searchGubun.trim().equals("")) {
			searchGubun = "";
			searchData = "";
		}//if
		
		String searchQuery = util.getSearchQuery(searchGubun, searchData);
		
		return "redirect:/"+ folderName +"/list?pageNumber="+ arguDto.getPageNumber() +"&"+ searchQuery;
	}//search
}//BoardController

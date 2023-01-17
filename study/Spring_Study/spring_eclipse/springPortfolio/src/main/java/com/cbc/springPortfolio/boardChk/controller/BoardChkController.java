package com.cbc.springPortfolio.boardChk.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cbc.springPortfolio.boardChk.model.dto.BoardChkDTO;
import com.cbc.springPortfolio.boardChk.service.BoardChkService;
import com.cbc.springPortfolio.common.Util;

@Controller
@RequestMapping("/boardChk")
public class BoardChkController {
	
	@Inject
	private BoardChkService boardChkService;
	@Autowired
	private Util util;
	
	private final String folderName = "boardChk";
	
	@RequestMapping("/list")
	public String list(Model model, @ModelAttribute BoardChkDTO arguDto, BindingResult bindingResult) {
		String searchGubun = util.getDecodedUrl(arguDto.getSearchGubun());
		String searchData = util.getDecodedUrl(arguDto.getSearchData());
		arguDto.setSearchGubun(searchGubun);
		arguDto.setSearchData(searchData);
		
		int pageNumber = arguDto.getPageNumber();
		int pageSize = 5;
		int blockSize = 10;
		int totalRecord = boardChkService.getTotalRecord(arguDto);
		
		Map<String, Integer> pagerMap = util.getPagerMap(pageNumber, pageSize, blockSize, totalRecord);
		pagerMap.put("blockSize", blockSize);
		
		arguDto.setStartRecord(pagerMap.get("startRecord"));
		arguDto.setLastRecord(pagerMap.get("lastRecord"));
		
		List<BoardChkDTO> list = boardChkService.getSelectAll(arguDto);
		
		model.addAttribute("pagerMap", pagerMap);
		model.addAttribute("pageNumber", pageNumber);
		model.addAttribute("totalRecord", totalRecord);
		model.addAttribute("searchGubun", searchGubun);
		model.addAttribute("searchData", searchData);
		model.addAttribute("list", list);
		model.addAttribute("folderName", folderName);
		model.addAttribute("fileName", "list");
		return "main/main";
	}//list
	
	@RequestMapping("/chugaProc")
	public String chugaProc(Model model, @ModelAttribute BoardChkDTO arguDto, BindingResult bindingResult) {
		String tbl = arguDto.getTbl();
		String tblName = arguDto.getTblName();
		
		tbl = util.getNullBlankCheck(tbl);
		tblName = util.getNullBlankCheck(tblName);
		
		tbl = util.getCheckString(tbl);
		tblName = util.getCheckString(tblName);
		
		int failCounter = 0;
		if (tbl.equals("")) {
			failCounter++;
		} else if (tblName.equals("")) {
			failCounter++;
		}//if
		
		if (failCounter > 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		arguDto.setTbl(tbl);
		arguDto.setTblName(tblName);
		
		int result = boardChkService.setInsert(arguDto);
		
		return "redirect:/"+ folderName +"/list";
	}//chugaProc
	
	@RequestMapping("/sujungProc")
	public String sujungProc(Model model, @ModelAttribute BoardChkDTO arguDto) {
		int boardChkNo = arguDto.getBoardChkNo();
		if (boardChkNo <= 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		String tbl = arguDto.getTbl();
		String tblName = arguDto.getTblName();
		
		tbl = util.getNullBlankCheck(tbl);
		tblName = util.getNullBlankCheck(tblName);
		
		tbl = util.getCheckString(tbl);
		tblName = util.getCheckString(tblName);
		
		int failCounter = 0;
		if (tbl.equals("")) {
			failCounter++;
		} else if (tblName.equals("")) {
			failCounter++;
		}//if
		
		if (failCounter > 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		arguDto.setTbl(tbl);
		arguDto.setTblName(tblName);
		
		int result = boardChkService.setUpdate(arguDto);
		
		return "redirect:/"+ folderName +"/list";
	}//sujungProc
	
	@RequestMapping("/sakjeProc")
	public String sakjeProc(Model model, @ModelAttribute BoardChkDTO arguDto) {
		int boardChkNo = arguDto.getBoardChkNo();
		if (boardChkNo <= 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		int result = boardChkService.setDelete(arguDto);
		
		return "redirect:/"+ folderName +"/list";
	}//sakjeProc
	
	@RequestMapping("/search")
	public String search(Model model, @ModelAttribute BoardChkDTO arguDto, BindingResult bindingResult) {
		String searchGubun = arguDto.getSearchGubun();
		String searchData = arguDto.getSearchData();
		
		if (searchGubun.trim().equals("")) {
			searchGubun = "";
			searchData = "";
		}//if

		String searchQuery = util.getSearchQuery(searchGubun, searchData);
		
		return "redirect:/"+ folderName +"/list?pageNumber="+ arguDto.getPageNumber() +"&"+ searchQuery;
	}//search
}//BoardChkController

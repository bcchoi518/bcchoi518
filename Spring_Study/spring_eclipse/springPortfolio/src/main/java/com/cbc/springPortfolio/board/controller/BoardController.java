package com.cbc.springPortfolio.board.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cbc.springPortfolio.board.model.dto.BoardDTO;
import com.cbc.springPortfolio.board.service.BoardService;
import com.cbc.springPortfolio.common.Util;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Inject
	private BoardService boardService;
	@Inject
	private Util util;
	
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
	public String view(Model model) {
		
		model.addAttribute("folderName", folderName);
		model.addAttribute("fileName", "view");
		return "main/main";
	}//view
	
	@RequestMapping("/chuga")
	public String chuga(Model model) {
		
		model.addAttribute("folderName", folderName);
		model.addAttribute("fileName", "chuga");
		return "main/main";
	}//chuga
	
	@RequestMapping("/chugaProc")
	public String chugaProc(Model model) {
		
		return "redirect:/board/list";
	}//chugaProc
	
	@RequestMapping("/sujung")
	public String sujung(Model model) {
		
		model.addAttribute("folderName", folderName);
		model.addAttribute("fileName", "sujung");
		return "main/main";
	}//sujung
	
	@RequestMapping("/sujungProc")
	public String sujungProc(Model model) {
		
		return "redirect:/board/list";
	}//sujungProc
	
	@RequestMapping("/sakje")
	public String sakje(Model model) {
		
		model.addAttribute("folderName", folderName);
		model.addAttribute("fileName", "sakje");
		return "main/main";
	}//sakje
	
	@RequestMapping("/sakjeProc")
	public String sakjeProc(Model model) {
		
		return "redirect:/board/list";
	}//sakjeProc
}//BoardController

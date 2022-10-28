package com.cbc.springPortfolio.shopProduct.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cbc.springPortfolio.common.Util;
import com.cbc.springPortfolio.shopProduct.model.dto.ShopProductDTO;
import com.cbc.springPortfolio.shopProduct.service.ShopProductService;

@Controller
@RequestMapping("/shopProduct")
public class ShopProductController {
	
	@Inject
	private ShopProductService shopProductService;
	@Inject
	Util util;
	
	private final String folderName = "shopProduct";
	
	@RequestMapping("/list")
	public String list(Model model, @ModelAttribute ShopProductDTO arguDto) {
		int pageNumber = arguDto.getPageNumber();
		int pageSize = 5;
		int blockSize = 10;
		int totalRecord = shopProductService.getTotalRecord(arguDto);
		
		String searchGubun = util.getDecodedUrl(arguDto.getSearchGubun());
		String searchData = util.getDecodedUrl(arguDto.getSearchData());
		
		Util util = new Util();
		Map<String, Integer> pagerMap = util.getPagerMap(pageNumber, pageSize, blockSize, totalRecord);
		pagerMap.put("blockSize", blockSize);
		
		arguDto.setStartRecord(pagerMap.get("startRecord"));
		arguDto.setLastRecord(pagerMap.get("lastRecord"));
		
		List<ShopProductDTO> list = shopProductService.getSelectAll(arguDto);
		
		model.addAttribute("pageNumber", pageNumber);
		model.addAttribute("totalRecord", totalRecord);
		model.addAttribute("pagerMap", pagerMap);
		model.addAttribute("list", list);
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
		
		return "redirect:/shopProduct/list";
	}//chugaProc
	
	@RequestMapping("/sujung")
	public String sujung(Model model) {
		
		model.addAttribute("folderName", folderName);
		model.addAttribute("fileName", "sujung");
		return "main/main";
	}//sujung
	
	@RequestMapping("/sujungProc")
	public String sujungProc(Model model) {
		
		return "redirect:/shopProduct/list";
	}//sujungProc
	
	@RequestMapping("/sakje")
	public String sakje(Model model) {
		
		model.addAttribute("folderName", folderName);
		model.addAttribute("fileName", "sakje");
		return "main/main";
	}//sakje
	
	@RequestMapping("/sakjeProc")
	public String sakjeProc(Model model) {
		
		return "redirect:/shopProduct/list";
	}//sakjeProc
}//ProductController

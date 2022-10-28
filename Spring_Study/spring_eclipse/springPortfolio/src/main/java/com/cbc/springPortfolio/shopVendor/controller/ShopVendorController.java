package com.cbc.springPortfolio.shopVendor.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cbc.springPortfolio.common.Util;
import com.cbc.springPortfolio.shopVendor.model.dto.ShopVendorDTO;
import com.cbc.springPortfolio.shopVendor.service.ShopVendorService;

@Controller
@RequestMapping("/shopVendor")
public class ShopVendorController {
	
	@Inject
	private ShopVendorService shopVendorService;
	@Autowired
	private Util util;
	
	private final String folderName = "shopVendor";
	
	@RequestMapping("/list")
	public String list(Model model, @ModelAttribute ShopVendorDTO arguDto, BindingResult bindingResult) {
		String searchGubun = util.getDecodedUrl(arguDto.getSearchGubun());
		String searchData = util.getDecodedUrl(arguDto.getSearchData());
		arguDto.setSearchGubun(searchGubun);
		arguDto.setSearchData(searchData);
		
		int pageNumber = arguDto.getPageNumber();
		int pageSize = 5;
		int blockSize = 10;
		int totalRecord = shopVendorService.getTotalRecord(arguDto);
		
		Map<String, Integer> pagerMap = util.getPagerMap(pageNumber, pageSize, blockSize, totalRecord);
		pagerMap.put("blockSize", blockSize);
		
		arguDto.setStartRecord(pagerMap.get("startRecord"));
		arguDto.setLastRecord(pagerMap.get("lastRecord"));
		
		List<ShopVendorDTO> list = shopVendorService.getSelectAll(arguDto);
		
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
	public String chugaProc(Model model, @ModelAttribute ShopVendorDTO arguDto, BindingResult bindingResult) {
		String vendorName = arguDto.getVendorName();
		
		vendorName = util.getNullBlankCheck(vendorName);
		
		vendorName = util.getCheckString(vendorName);
		
		int failCounter = 0;
		if (vendorName.equals("")) {
			failCounter++;
		}//if
		
		if (failCounter > 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		arguDto.setVendorName(vendorName);
		
		int result = shopVendorService.setInsert(arguDto);
		
		return "redirect:/"+ folderName +"/list";
	}//chugaProc
	
	@RequestMapping("/sujungProc")
	public String sujungProc(Model model, @ModelAttribute ShopVendorDTO arguDto) {
		int vendorCode = arguDto.getVendorCode();
		if (vendorCode <= 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		String vendorName = arguDto.getVendorName();
		
		vendorName = util.getNullBlankCheck(vendorName);
		
		vendorName = util.getCheckString(vendorName);
		
		int failCounter = 0;
		if (vendorName.equals("")) {
			failCounter++;
		}//if
		
		if (failCounter > 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		arguDto.setVendorName(vendorName);
		
		int result = shopVendorService.setUpdate(arguDto);
		
		return "redirect:/"+ folderName +"/list";
	}//sujungProc
	
	@RequestMapping("/sakjeProc")
	public String sakjeProc(Model model, @ModelAttribute ShopVendorDTO arguDto) {
		int vendorCode = arguDto.getVendorCode();
		if (vendorCode <= 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		int result = shopVendorService.setDelete(arguDto);
		
		return "redirect:/"+ folderName +"/list";
	}//sakjeProc
	
	@RequestMapping("/search")
	public String search(Model model, @ModelAttribute ShopVendorDTO arguDto, BindingResult bindingResult) {
		String searchGubun = arguDto.getSearchGubun();
		String searchData = arguDto.getSearchData();
		
		if (searchGubun.trim().equals("")) {
			searchGubun = "";
			searchData = "";
		}//if

		String searchQuery = util.getSearchQuery(searchGubun, searchData);
		
		return "redirect:/"+ folderName +"/list?pageNumber="+ arguDto.getPageNumber() +"&"+ searchQuery;
	}//search
}//VendorController

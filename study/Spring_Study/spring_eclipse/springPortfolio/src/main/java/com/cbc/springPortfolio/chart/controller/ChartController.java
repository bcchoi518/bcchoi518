package com.cbc.springPortfolio.chart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chart")
public class ChartController {
	
	String folderName = "chart";
	
	@RequestMapping("/list")
	public String list(Model model) {
		
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
		
		return "redirect:/chart/list";
	}//chugaProc
	
	@RequestMapping("/sujung")
	public String sujung(Model model) {
		
		model.addAttribute("folderName", folderName);
		model.addAttribute("fileName", "sujung");
		return "main/main";
	}//sujung
	
	@RequestMapping("/sujungProc")
	public String sujungProc(Model model) {
		
		return "redirect:/chart/list";
	}//sujungProc
	
	@RequestMapping("/sakje")
	public String sakje(Model model) {
		
		model.addAttribute("folderName", folderName);
		model.addAttribute("fileName", "sakje");
		return "main/main";
	}//sakje
	
	@RequestMapping("/sakjeProc")
	public String sakjeProc(Model model) {
		
		return "redirect:/chart/list";
	}//sakjeProc
}//ChartController

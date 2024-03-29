package com.cbc.springPortfolio._home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index(Model model) {
		
		return "_home/index";
	}//index
	
	@RequestMapping("/portfolioDetails")
	public String portfolioDetails(Model model) {
		
		return "_home/portfolioDetails";
	}//portfolioDetails
}//IndexController
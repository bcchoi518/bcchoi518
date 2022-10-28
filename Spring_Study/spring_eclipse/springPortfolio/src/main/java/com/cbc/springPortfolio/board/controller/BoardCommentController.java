package com.cbc.springPortfolio.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cbc.springPortfolio.board.model.dto.BoardCommentDTO;
import com.cbc.springPortfolio.board.service.BoardCommentService;

@Controller
@RequestMapping("/boardComment")
public class BoardCommentController {
	
	@Inject
	private BoardCommentService boardCommentService;
	
	private final String folderName = "board";
	
	@RequestMapping("/list")
	public String list(Model model, @ModelAttribute BoardCommentDTO arguDto, BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors("no") || arguDto.getNo() <= 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		arguDto.setBoardNo(arguDto.getNo());
		
		List<BoardCommentDTO> list = boardCommentService.getSelectAll(arguDto);
		
		model.addAttribute("list", list);
		model.addAttribute("no", arguDto.getNo());
		model.addAttribute("tbl", arguDto.getTbl());
		
		return folderName + "/commentList";
	}//list
}//BoardCommentController

package com.cbc.springPortfolio.board.controller;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbc.springPortfolio.board.model.dto.BoardCommentDTO;
import com.cbc.springPortfolio.board.service.BoardCommentService;
import com.cbc.springPortfolio.common.Util;

@RestController
@RequestMapping("/boardCommentRest")
public class BoardCommentRestController {
	
	@Inject
	private BoardCommentService boardCommentService;
	@Inject
	private Util util;
	
	private final String folderName = "board";
	
	@PostMapping("/chuga")
	public String chuga(Model model, @ModelAttribute BoardCommentDTO arguDto, BindingResult bindingResult, HttpServletRequest request, HttpSession session) throws UnknownHostException {
		if (bindingResult.hasFieldErrors("no") || arguDto.getNo() <= 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		String writer = util.getNullBlankCheck(arguDto.getWriter());
		String passwd = util.getNullBlankCheck(arguDto.getPasswd());
		String content = util.getNullBlankCheck(arguDto.getContent());
		
		int failCounter = 0;
		if (writer.equals("")) {
			System.out.println("writer error");
			failCounter++;
		} else if (passwd.equals("")) {
			System.out.println("passwd error");
			failCounter++;
		} else if (content.equals("")) {
			System.out.println("content error");
			failCounter++;
		}//if
		
		if (failCounter > 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		writer = util.getCheckString(writer);
		passwd = util.getCheckString(passwd);
		content = util.getCheckString(content);
		
		String[] serverInfos = util.getServerInfo(request);
		String ip = serverInfos[4];
		
		Optional<Object> sessionNo = Optional.ofNullable(session.getAttribute("sessionNo"));
		int memberNo = (int) sessionNo.orElse(0);
		
		arguDto.setBoardNo(arguDto.getNo());
		arguDto.setWriter(writer);
		arguDto.setContent(content);
		arguDto.setPasswd(passwd);
		arguDto.setMemberNo(memberNo);
		arguDto.setIp(ip);
		
		int result = boardCommentService.setInsert(arguDto);
		
		return "" + result;
	}//chuga
	
	@PostMapping("/sujung")
	public String sujung(Model model, @ModelAttribute BoardCommentDTO arguDto, BindingResult bindingResult, HttpServletRequest request) throws UnknownHostException {
		if (bindingResult.hasFieldErrors("commentNo") || arguDto.getCommentNo() <= 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		String writer = util.getNullBlankCheck(arguDto.getWriter());
		String passwd = util.getNullBlankCheck(arguDto.getPasswd());
		String content = util.getNullBlankCheck(arguDto.getContent());
		
		int failCounter = 0;
		if (writer.equals("")) {
			System.out.println("writer error");
			failCounter++;
		} else if (passwd.equals("")) {
			System.out.println("passwd error");
			failCounter++;
		} else if (content.equals("")) {
			System.out.println("content error");
			failCounter++;
		}//if
		
		if (failCounter > 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		writer = util.getCheckString(writer);
		passwd = util.getCheckString(passwd);
		content = util.getCheckString(content);
		
		String[] serverInfos = util.getServerInfo(request);
		String ip = serverInfos[4];
		
		arguDto.setBoardNo(arguDto.getNo());
		arguDto.setWriter(writer);
		arguDto.setContent(content);
		arguDto.setPasswd(passwd);
		arguDto.setIp(ip);
		
		int result = boardCommentService.setUpdate(arguDto);
		
		return "" + result;
	}//sujung
	
	@PostMapping("/sakje")
	public String sakje(Model model, @ModelAttribute BoardCommentDTO arguDto, BindingResult bindingResult) {
		if (bindingResult.hasFieldErrors("commentNo") || arguDto.getCommentNo() <= 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		String passwd = util.getNullBlankCheck(arguDto.getPasswd());
		
		int failCounter = 0;
		if (passwd.equals("")) {
			System.out.println("passwd error");
			failCounter++;
		}//if
		
		if (failCounter > 0) {
			return "redirect:/"+ folderName +"/list";
		}//if
		
		passwd = util.getCheckString(passwd);
		
		arguDto.setBoardNo(arguDto.getNo());
		arguDto.setPasswd(passwd);
		
		int result = boardCommentService.setDelete(arguDto);
		
		return "" + result;
	}//sakje
}//BoardCommentRestController

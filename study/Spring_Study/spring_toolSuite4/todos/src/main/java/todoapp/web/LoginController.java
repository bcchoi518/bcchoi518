package todoapp.web;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import todoapp.core.user.application.UserPasswordVerifier;
import todoapp.core.user.application.UserRegistration;
import todoapp.core.user.domain.User;
import todoapp.core.user.domain.UserEntityNotFoundException;
import todoapp.core.user.domain.UserPasswordNotMatchedException;
import todoapp.security.UserSession;
import todoapp.security.UserSessionRepository;
import todoapp.web.model.SiteProperties;

@Controller
public class LoginController {
	
	private final UserPasswordVerifier userPasswordVerifier;
	private final UserRegistration userRegistration;
	private final UserSessionRepository userSessionRepository;
	private final SiteProperties siteProperties;
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	public LoginController(
			UserPasswordVerifier userPasswordVerifier, 
			UserRegistration userRegistration, 
			UserSessionRepository userSessionRepository,
			SiteProperties siteProperties
			) {
		this.userPasswordVerifier = userPasswordVerifier;
		this.userRegistration = userRegistration;
		this.userSessionRepository = userSessionRepository;
		this.siteProperties = siteProperties;
	}

//	@ModelAttribute("site")
//	public SiteProperties siteProperties() {
//		return siteProperties;
//	}
	
	@GetMapping("/login")
	public String loginForm() {
		if (Objects.nonNull(userSessionRepository.get())) {
			return "redirect:/todos";
		}//if
		return "login";
	}//login
	
	@PostMapping("/login")
	public String loginProcess(@Valid LoginCommand command, BindingResult bindingResult, Model model) {
		logger.debug("login command: {}", command);
		
		// 0. 입력 값 검증에 실패한 경우: 로그인 페이지로 돌려보내기
		if (bindingResult.hasErrors()) {
			model.addAttribute("bindingResult", bindingResult);
			model.addAttribute("message", "입력 값이 없거나 올바르지 않아요.");
			return "login";
		}//if
		
		User user;
		try {
			// 1. 사용자 저장소에 사용자가 있을 경우: 비밀번호 확인 후 로그인 처리
			user = userPasswordVerifier.verify(command.getUsername(), command.getPassword());
		} catch (UserEntityNotFoundException error) {
			// 2. 사용자가 없는 경우: 회원가입 처리 후 로그인 처리
			user = userRegistration.join(command.getUsername(), command.getPassword());
		}
		userSessionRepository.set(new UserSession(user));
		
		return "redirect:/todos";
	}//loginProcess
	
	@ExceptionHandler(BindException.class)
	public String handleBindException(BindException error, Model model) {
		model.addAttribute("bindingResult", error.getBindingResult());
		model.addAttribute("message", "입력 값이 없거나 올바르지 않아요.");
		return "login";
	}//handleBindException
	
	@ExceptionHandler(UserPasswordNotMatchedException.class)
	public String handleUserPasswordNotMatchedException(UserPasswordNotMatchedException error, Model model) {
		model.addAttribute("message", error.getMessage());
		return "login";
	}//handleUserPasswordNotMatchedException
	
	@RequestMapping("/logout")
	public View logout() {
		userSessionRepository.clear();
		return new RedirectView("/todos");
	}//logout
	
	static class LoginCommand {
		
		@Size(min = 4, max = 20)
		String username;
		String password;
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		@Override
		public String toString() {
			return "[username=" + username + ", password=" + password + "]";
		}
	}//LoginCommand
}//LoginController

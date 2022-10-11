package dev.springrunner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.JstlView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello(@RequestParam("name") String name) {
		// Model
		HelloModel model = new HelloModel(name);
		
		// view 생성
		View view = new JstlView("/WEB-INF/templates/HelloView.jsp");
		
		// ModelAndView 생성 및 초기화
		ModelAndView mav = new ModelAndView();
		mav.addObject("hello", model);
		mav.setView(view);
		
		return mav;
	}//hello
}//HelloController

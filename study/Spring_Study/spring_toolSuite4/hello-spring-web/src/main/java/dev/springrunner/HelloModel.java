package dev.springrunner;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;

public class HelloModel {

	private String name;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date currentDatetime;
	
	public HelloModel(String name) {
		if (StringUtils.hasText(name)) {
			this.name = name;
		} else {
			this.name = "스프링 웹 애플리케이션";
		}//if
		this.currentDatetime = new Date();
	}//HelloModel

	public String getName() {
		return name;
	}

	public Date getCurrentDatetime() {
		return currentDatetime;
	}
}//HelloModel

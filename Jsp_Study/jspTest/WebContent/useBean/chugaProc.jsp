<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");

	String boss_1 = request.getParameter("boss_1");
	String boss_2 = request.getParameter("boss_2");
	String boss_3 = request.getParameter("boss_3");
	
	out.println("boss_1: " + boss_1 + "<br>");
	out.println("boss_2: " + boss_2 + "<br>");
	out.println("boss_3: " + boss_3 + "<br>");
%>
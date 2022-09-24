<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
   	String dartResult = "1D2S#10S";
   	int result = 0;
   	int[] scores = new int[3];
   	int[] options = new int[3];
   	int num = 0;
   	int idx = 0;
   	int optionCounter = 0;
   	
   	//parsing
   	dartResult = dartResult.replace("10", "a");
   	
   	for (int i = 0; i < dartResult.length(); i++) {	
    	String tmp = dartResult.substring(i, i + 1);
   		
    	if (tmp.equals("S")) {
    		num = Integer.parseInt(dartResult.substring(i - 1, i).replace("a", "10"));
    		scores[idx++] = num;
		} else if (tmp.equals("D")) {
			num = Integer.parseInt(dartResult.substring(i - 1, i).replace("a", "10"));
			scores[idx++] = num * num;
		} else if (tmp.equals("T")) {
			num = Integer.parseInt(dartResult.substring(i - 1, i).replace("a", "10"));
			scores[idx++] = num * num * num;
		} else if (tmp.equals("*")) {
			options[optionCounter] = 2;
		} else if (tmp.equals("#")) {
			options[optionCounter] = -1;
    	}//if
    	if (i != 0 && i % 3 == 0) {
    		if (options[optionCounter] == 0) {
    			options[optionCounter++] = 1;
    		}//if
    	}//if
	}//for
	System.out.println(Arrays.toString(scores));
	System.out.println(Arrays.toString(options));
%>
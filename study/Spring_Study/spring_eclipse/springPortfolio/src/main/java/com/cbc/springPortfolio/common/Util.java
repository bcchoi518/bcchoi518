package com.cbc.springPortfolio.common;

import java.io.UnsupportedEncodingException;
import java.net.Inet4Address;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Util {
	public String[] getServerInfo(HttpServletRequest request) throws UnknownHostException {
		String referer = request.getHeader("REFERER");
		if (referer == null || referer.trim().equals("")) {
			referer = "";
		}//if
		
		String path = request.getContextPath();
		String url = request.getRequestURL().toString();
		String uri = request.getRequestURI().toString();
		String ip = Inet4Address.getLocalHost().getHostAddress();
		
		String ip6 = request.getHeader("X-Forwarded-For");  
        if (ip6 == null || ip6.length() == 0 || "unknown".equalsIgnoreCase(ip6)) {  
        	ip6 = request.getHeader("Proxy-Client-IP");  
        }//if
        if (ip6 == null || ip6.length() == 0 || "unknown".equalsIgnoreCase(ip6)) {  
        	ip6 = request.getHeader("WL-Proxy-Client-IP");  
        }//if
        if (ip6 == null || ip6.length() == 0 || "unknown".equalsIgnoreCase(ip6)) {  
        	ip6 = request.getHeader("HTTP_CLIENT_IP");  
        }//if
        if (ip6 == null || ip6.length() == 0 || "unknown".equalsIgnoreCase(ip6)) {  
        	ip6 = request.getHeader("HTTP_X_FORWARDED_FOR");  
        }//if
        if (ip6 == null || ip6.length() == 0 || "unknown".equalsIgnoreCase(ip6)) {  
        	ip6 = request.getRemoteAddr();  
        }//if
		
        // JSP Model2에서 사용되는 부분
//		String[] imsiUriArray = uri.split("/");
//		String folderName = imsiUriArray[imsiUriArray.length - 2];
//		String fileName = imsiUriArray[imsiUriArray.length - 1];
		
		String[] array = new String[8];
		array[0] = referer;
		array[1] = path;
		array[2] = url;
		array[3] = uri;
		array[4] = ip;
		array[5] = ip6;
//		array[6] = folderName;
//		array[7] = fileName;
		
		return array;
	}//getServerInfo
	
	public String[] getSessionCheck(HttpServletRequest request) {
		int sessionNo = 0;
		String sessionId = "";
		String sessionName = "";
		
		HttpSession session = request.getSession();
		
		if (session.getAttribute("sessionNo") != null) {
			sessionNo = (Integer) session.getAttribute("sessionNo");
		}//if
		if (session.getAttribute("sessionId") != null) {
			sessionId = (String) session.getAttribute("sessionId");
		}//if
		if (session.getAttribute("sessionName") != null) {
			sessionName = (String) session.getAttribute("sessionName");
		}//if
		
		String[] result = new String[3];
		result[0] = sessionNo + "";
		result[1] = sessionId;
		result[2] = sessionName;
		return result;
	}//getSessionCheck
	
	public String getCheckString(String str) {
		String result = "";
		result = str;
		result = result.replace("&", "&amp;");
		result = result.replace(">", "&gt;");
		result = result.replace("<", "&lt;");
		result = result.replace("\"", "&quot;");
		result = result.replace("'", "&apos;");
		return result;
	}//getCheckString
	
	public int getNumberCheck(String str, int defaultNum) {
		int result = 0;
		
		String tmp = str;
		if (tmp == null || tmp.trim().equals("")) {
			tmp = "-";
		}//if
		
		for (int i = 0; i < 10; i++) {
			tmp = tmp.replace(i + "", "");
		}//if
		
		if (tmp.equals("")) {
			result = Integer.parseInt(str);
		} else {
			result = defaultNum;
		}//if
		
		return result;
	}//getNumberCheck
	
	public String getNullBlankCheck(String str) {
		String result = str;
		
		if (result == null || result.trim().equals("")) {
			result = "";
		}//if
		
		return result;
	}//getNullBlankCheck
	
	public int[] getCalendar() {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
//		System.out.println("현재 시각은 " + year + "년도 " + month + "월 " + day + "일 " + hour + "시 " + minute + "분 " + second + "초입니다.");
		
		int[] result = new int[6];
		result[0] = year;
		result[1] = month;
		result[2] = day;
		result[3] = hour;
		result[4] = minute;
		result[5] = second;
		
		return result;
	}//getDateTime
	
	public String getDateTime() {
		int[] intResult = getCalendar();
		String result = "";
		
		for (int i = 0; i < intResult.length; i++) {
			if (intResult[i] < 10) {
				result += "0" + intResult[i];
			} else {
				result += intResult[i];
			}//if
		}//for
		
		return result;
	}//getDateTimeType
	
	public String createUuid() {
		return UUID.randomUUID().toString();
	}//create_uuid
	
	public Map<String, Integer> getPagerMap(int pageNumber, int pageSize, int blockSize, int totalRecord) {
		int cntDisplay = totalRecord - pageSize * (pageNumber - 1);
		int startRecord = pageSize * (pageNumber - 1) + 1;
		int lastRecord = pageSize * pageNumber;
		if (lastRecord > totalRecord) {
			lastRecord = totalRecord;
		}//if
		
		int totalPage = 0;
		int startPage = 1;
		int lastPage = 1;
		if (totalRecord > 0) {
			totalPage = totalRecord / pageSize + (totalRecord % pageSize == 0 ? 0 : 1);
			startPage = (pageNumber / blockSize - (pageNumber % blockSize != 0 ? 0 : 1)) * blockSize + 1;
			lastPage = startPage + blockSize - 1;
			if (lastPage > totalPage) {
				lastPage = totalPage;
			}//if
		}//if
		
		Map<String, Integer> map = new HashMap<>();
		map.put("cntDisplay", cntDisplay);
		map.put("startRecord", startRecord);
		map.put("lastRecord", lastRecord);
		map.put("totalPage", totalPage);
		map.put("startPage", startPage);
		map.put("lastPage", lastPage);
		
		return map;
	}//getPagerMap
	
	public String getSearchQuery(String searchGubun, String searchData) {
		try {
			searchGubun = URLEncoder.encode(searchGubun, "UTF-8");
			searchData = URLEncoder.encode(searchData, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}//try-catch
		
		return "searchGubun="+ searchGubun +"&searchData="+ searchData;
	}//getSearchQuery
	
	public String getDecodedUrl(String url) {
		try {
			url = URLDecoder.decode(url, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}//try-catch
		
		return url;
	}//getDecodedUrl
	
	
}//Util

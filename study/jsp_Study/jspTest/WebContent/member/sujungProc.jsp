<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %> 

<%@ include file = "../include/inc_dbInfo.jsp" %>

<%
	request.setCharacterEncoding("UTF-8");
	
	String arg1 = request.getParameter("arg1");
	if (arg1 == null || arg1.trim().equals("")) {
		out.println("<script>");
		out.println("alert('정상적인 접속이 아닙니다.');");
		out.println("location.href='list.jsp';");
		out.println("</script>");
		return;
	}//end if

	String passwd = request.getParameter("passwd");
	String phone = request.getParameter("phone");
	String email = request.getParameter("email");
	String address = request.getParameter("address");
	
	if (passwd == null || passwd.trim().equals("")) {
		out.print("비밀번호 비정상..");
		return;
	}//end if
	if (phone == null || phone.trim().equals("")) {
		out.print("전화번호 비정상..");
		return;
	}//end if
	if (email == null || email.trim().equals("")) {
		out.print("이메일 비정상..");
		return;
	}//end if
	if (address == null || address.trim().equals("")) {
		out.print("주소 비정상..");
		return;
	}//end if
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	int result = 0;
	try {
		Class.forName(dbDriver);
		conn = DriverManager.getConnection(dbUrl, dbId, dbPw);
		System.out.println("오라클 접속 성공..");
		//-------------------------------------------------------
		String sql = "UPDATE member SET phone = ?, email = ?, address = ? WHERE id = ? AND passwd = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, phone);
		pstmt.setString(2, email);
		pstmt.setString(3, address);
		pstmt.setString(4, arg1);
		pstmt.setString(5, passwd);
		result = pstmt.executeUpdate();
		//-------------------------------------------------------
	} catch (Exception e) {
	//	e.printStackTrace();
		System.out.println("오라클 접속 실패..");
	} finally {
		if (pstmt != null) { pstmt.close(); }
		if (conn != null) { conn.close(); }
		System.out.println("오라클 접속 해제..");
	}//end try-catch-finally
	
	if (result > 0) {
		out.println("<script>");
// 		out.println("alert('정상적으로 수정되었습니다.');");
		out.println("location.href='view.jsp?arg1=" + arg1 + "';");
		out.println("</script>");
	} else {
		out.println("<script>");
		out.println("alert('수정 처리 중 오류가 발생했습니다.');");
		out.println("location.href='sujung.jsp?arg1=" + arg1 + "';");
		out.println("</script>");
	}//end if
%>
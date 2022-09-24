<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="DBPKG.Util"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String empno = request.getParameter("empno");
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		conn = Util.getConnection();
		String sql = "SELECT * FROM tbl_resv_202108 WHERE empno = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, empno);
		rs = pstmt.executeQuery();
		if (rs.next()) {
%>
			<jsp:forward page="success.jsp"></jsp:forward>
<%
		} else {
%>
			<jsp:forward page="fail.jsp"></jsp:forward>
<%	
		}//end if
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if (rs != null) { rs.close(); }
		if (pstmt != null) { pstmt.close(); }
		if (conn != null) { conn.close(); }
	}//end try-catch-finally
%>
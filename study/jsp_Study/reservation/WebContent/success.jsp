<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DBPKG.Util"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>success</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<section style="position:fixed; top:70px; left:0px; width:100%; height:100%; background-color:lightgray;">
<%
	request.setCharacterEncoding("UTF-8");
	String empno = request.getParameter("empno");
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
%>
		<h2 style="text-align:center;">사원번호: <%=empno %>님의 좌석예약조회</h2>
		<form style="display:flex; align-items:center; justify-content:center; text-align:center">
			<table border="1">
				<tr>
					<td>사원번호</td>
					<td>이름</td>
					<td>근무일자</td>
					<td>좌석번호</td>
					<td>좌석위치</td>
					<td>내선번호</td>
				</tr>
<%
				try {
					conn = Util.getConnection();
					String sql = "SELECT em.empno, em.empname, re.resvdate, se.seatno, se.office, se.callno "
							   + "FROM tbl_emp_202108 em, tbl_seat_202108 se, tbl_resv_202108 re "
							   + "WHERE em.empno = re.empno AND se.seatno = re.seatno AND re.empno = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, empno);
					rs = pstmt.executeQuery();
					while (rs.next()) {
						String resvdate = rs.getString(3);
						String date = resvdate.substring(0, 4) + "년" + resvdate.substring(4, 6) + "월" + resvdate.substring(6, 8) + "일"; 
%>
					<tr>
						<td><%=rs.getString(1) %></td>
						<td><%=rs.getString(2) %></td>
						<td><%=date %></td>
						<td><%=rs.getString(4) %></td>
						<td><%=rs.getString(5) %></td>
						<td><%=rs.getString(6) %></td>
					</tr>
<%
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (rs != null) { rs.close(); }
					if (pstmt != null) { pstmt.close(); }
					if (conn != null) { conn.close(); }
				}//end try-catch-finally
%>
			</table>
		</form>
		<p style="text-align:center">
			<input type="button" value="돌아가기" onClick="location.href='list.jsp'" />
		</p>
	</section>
	
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
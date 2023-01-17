package dev.springrunner;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet
{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청 데이터로부터 이름정보를 꺼내는 것
		String requestName = request.getParameter("name");
		// 2. 실행하는 서블릿의 이름정보를 찾는 것
		String servletName = getServletConfig().getServletName();
		// 3. 두 이름정보를 바탕으로 html 을 작성하는 것
		StringBuilder html = new StringBuilder();
		html.append("<html>");
		html.append("	<head>");
		html.append("		<title>초 간단 서블릿 개발하기</title>");
		html.append("	</head>");
		html.append("	<body>");
		html.append("	<h1>"+ requestName +"님 안녕하세요.</h1>");
		html.append("	<h1>저는 "+ servletName +"입니다.</h1>");
		html.append("	</body>");
		html.append("</html>");
		
		// 4. HTTP 응답을 작성하는 것 (상태코드, 헤더, 응답 콘텐트)
		response.setStatus(200);
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().write(html.toString());
		
	}//service
}//HelloServlet

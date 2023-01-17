package dev.springrunner;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/improved-hello"})
public class ImprovedHelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestName = request.getParameter("name");
		String servletName = getServletConfig().getServletName();
		
		request.setAttribute("requestName", requestName);
		request.setAttribute("servletName", servletName);
		
		request.getRequestDispatcher("/improved-hello.jsp")
			   .forward(request, response);
	}//doGet
}//ImprovedHelloServlet

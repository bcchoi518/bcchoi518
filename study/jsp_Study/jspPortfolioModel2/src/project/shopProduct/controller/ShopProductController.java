package project.shopProduct.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.common.Util;

@WebServlet("/shopProduct_servlet/*")
public class ShopProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}//doPost

	protected void doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		Util util = new Util();
		
		String[] serverInfo = util.getServerInfo(request);
		String referer = serverInfo[0];
		String path = serverInfo[1];
		String url = serverInfo[2];
		String uri = serverInfo[3];
		String ip = serverInfo[4];
		String ip6 = serverInfo[5];
		String folderName = serverInfo[6];
		String fileName = serverInfo[7];
		
		request.setAttribute("referer", referer);
		request.setAttribute("path", path);
		request.setAttribute("ip", ip);
		request.setAttribute("folderName", folderName);
		request.setAttribute("fileName", fileName);
		
		String forwardPage = "/WEB-INF/project/main/main.jsp";
		if (fileName.equals("list")) {
			RequestDispatcher rd = request.getRequestDispatcher(forwardPage);
			rd.forward(request, response);
			
		} else if (fileName.equals("view")) {
			RequestDispatcher rd = request.getRequestDispatcher(forwardPage);
			rd.forward(request, response);
			
		} else if (fileName.equals("chuga")) {
			RequestDispatcher rd = request.getRequestDispatcher(forwardPage);
			rd.forward(request, response);
			
		} else if (fileName.equals("sujung")) {
			RequestDispatcher rd = request.getRequestDispatcher(forwardPage);
			rd.forward(request, response);
			
		} else if (fileName.equals("sakje")) {
			RequestDispatcher rd = request.getRequestDispatcher(forwardPage);
			rd.forward(request, response);
			
		} else if (fileName.equals("chugaProc")) {
			
		} else if (fileName.equals("sujungProc")) {
			
		} else if (fileName.equals("sakjeProc")) {
			
		}//if
	}//doProc
}//ShopProductController

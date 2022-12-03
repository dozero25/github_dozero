package com.study.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test1
 */
@WebServlet("/test/1")
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	public void init() throws ServletException {
		System.out.println("Test1 클래스 init() 호출!!!");
		
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Test1 클래스 service() 호출!!!");
		request.setCharacterEncoding("UTF-8");
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("phone"));
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>테스트1</title></head><body>");
		out.print("<h1>테스트1 서블릿 호출</h1>");
		out.print("</body></html>");
	}
	@Override
	public void destroy() {
		System.out.println("Test1 클래스 destroy() 호출!!!");
	}

}

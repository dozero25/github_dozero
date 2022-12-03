package com.study.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ctrl + shift + o

@WebServlet("/req/1")
public class RequestPrams1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getContentType());
		System.out.println(request.getLocalPort());
		System.out.println(request.getMethod());
		System.out.println(request.getRequestURI());
		System.out.println(request.getQueryString());
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain; charset=utf8");
		
		// get 에서만 사용, 주소창에서 하는 것은 전부 get 요청
		String test = request.getParameter("test");
		String name = request.getParameter("name");
		
		response.getWriter().print("test : "+ test);
		response.getWriter().print("name : "+ name);
		
		
		
		
	}

}

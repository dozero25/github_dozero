package com.study.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test/page1")
public class Test1Page extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/test1.html").forward(request, response);
		// 해당 페이지로 응답을 한다.
		// forward가 앞에 getRequestDispatcher()를 해석한다.
		// getRequestDispatcher을 통해 서버에 접근 가능
	}


}

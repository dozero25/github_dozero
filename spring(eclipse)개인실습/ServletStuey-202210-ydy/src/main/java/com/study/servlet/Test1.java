package com.study.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test/1")
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public Test1() {
        // TODO Auto-generated constructor stub
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>테스트1</title></head><body>");
		out.print("<h1>테스트1 서블릿 호출</h1>");
		out.print("<h1>4번째 다운로드 이젠 눈 감고 한다.</h1>");
		out.print("</body><html>");
	}

}

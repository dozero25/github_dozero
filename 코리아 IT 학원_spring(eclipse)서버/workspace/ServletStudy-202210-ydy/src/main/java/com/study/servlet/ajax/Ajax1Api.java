package com.study.servlet.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.util.DTO;

/**
 * Servlet implementation class Ajax1Api
 */
@WebServlet("/api/ajax1")
public class Ajax1Api extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(DTO.getParams(request));
		
		System.out.println("Ajax로 get 요청 옴!!");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(DTO.getParams(request));
		
		System.out.println("Ajax로 post 요청 옴!!");
		
		response.setContentType("text/plain; charest=utf8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.print("응답 데이터전송");
		
		
	}

}

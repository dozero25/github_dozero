package com.study.servlet.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/session2")
public class Session2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		session.setAttribute("user_name", request.getAttribute("name"));
		session.setAttribute("user_phone", request.getAttribute("phone"));
		session.setAttribute("user_email", request.getAttribute("email"));
		session.setAttribute("user_address", request.getAttribute("address"));
		session.setAttribute("user_pw", request.getAttribute("pw"));
		
		request.getRequestDispatcher("/WEB-INF/form1.html").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

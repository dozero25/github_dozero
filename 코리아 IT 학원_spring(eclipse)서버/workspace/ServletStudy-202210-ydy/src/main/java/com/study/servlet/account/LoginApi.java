package com.study.servlet.account;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.study.domain.User;
import com.study.service.AccountService;
import com.study.util.DTO;


@WebServlet("/auth/login")
public class LoginApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> loginUser = DTO.getParams(request);
		AccountService accountService = AccountService.getInstance();
		
		User user = accountService.loadUserByUsername(loginUser.get("username"));
		
		if(user == null) {
			System.out.println("아이디 틀림!");
			request.getRequestDispatcher("/WEB-INF/account/error_login.html").forward(request, response);
			return;
		}
		
		if(!accountService.checkPassword(user, loginUser.get("password"))){ // 비밀번호가 틀렸을 때
			System.out.println("비밀번호 틀림!");
			request.getRequestDispatcher("/WEB-INF/account/error_login.html").forward(request, response);
			return;
		} // 동일하게 보내줘야 해커가 아이디나 비번을 맞췄는지 알 수 없게 한다.
		
		
		System.out.println("로그인 성공"+user);
		
		// 로그인 성공! 해서 홈페이지나 다른 페이지 이동 -> 로그인 성공 했을 때 session으로 정보를 넣어야한다.
		HttpSession session = request.getSession();
		session.setAttribute("principal", user);
		
		response.sendRedirect("/mypage");
		
	}

}

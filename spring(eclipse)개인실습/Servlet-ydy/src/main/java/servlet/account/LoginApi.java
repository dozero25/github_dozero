package servlet.account;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import service.AccountService;
import util.DTO;

/**
 * Servlet implementation class LoginApi
 */
@WebServlet("/auth/login")
public class LoginApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> loginUser = DTO.getParams(request);
		AccountService accountService = AccountService.getInstance();
		
		User user = accountService.loadUserByUsername(loginUser.get("username"));
		
		if(user == null) {
			System.out.println("아이디 틀림!");
			// error_login.html -> script에서 실행 : 사용자 정보를 확인해 주세요. history.back(); 뒤로가기 해서 다시 로그인 창으로 이동
			return;
		}
		
		if(!accountService.checkPassword(user, loginUser.get("password"))){ // 비밀번호가 틀렸을 때
			System.out.println("비밀번호 틀림!");
			// error_login.html -> script에서 실행 : 사용자 정보를 확인해 주세요. history.back(); 뒤로가기 해서 다시 로그인 창으로 이동
			return;
		} // 동일하게 보내줘야 해커가 아이디나 비번을 맞췄는지 알 수 없게 한다.
		
		
		// 로그인 성공! 해서 홈페이지나 다른 페이지 이동 -> 로그인 성공 했을 때 session으로 정보를 넣어야한다.
	}

}

package servlet.cookie;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/1")
public class cookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie = new Cookie("data1", "쿠키저장!!");
		cookie.setMaxAge(650 * 60);
		
		Cookie cookie2 = new Cookie("data2", URLEncoder.encode("데이터하나더 추가!", StandardCharsets.UTF_8));
		cookie2.setMaxAge(60 * 60);
	}

	
	
}

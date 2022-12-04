package servlet.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookie/2")
public class cookie2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
//		List<Cookies> cookiesList = Array.asList(cookies);
		if(cookies != null) {
			for(Cookie c : cookies) {
				System.out.println("key : "+c.getName());
				System.out.println("value : "+c.getValue());
			}
			
		}
	}

	

}

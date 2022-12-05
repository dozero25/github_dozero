package com.study.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.study.domain.User;

/**
 * Servlet Filter implementation class SecurityFilter
 */
@WebFilter("/*")
public class SecurityFilter extends HttpFilter implements Filter {
	
	
	private static final long serialVersionUID = 1L;


	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		String requestURI = req.getRequestURI();
		String antMatchers1 = "/mypage, /mypage/password";
		String antMatchers2 = "/login, /register";
		String logoutURI = "/logout";
		String adminPage = "/admin";
		
		
		if(antMatchers1.contains(requestURI) && !authorization(req.getSession())) { // 앞은 참인데, 뒤는 인증이 되지 않으면 (뒤에 ! 을 붙여서 부정으로 만든다.)
			resp.sendRedirect("/login");
			return;
		} // filter 에서 걸러버린다.
		
		if(antMatchers2.contains(requestURI) && authorization(req.getSession())) { // 둘다 로그인 되어 있다면
			resp.sendRedirect("/mypage");
			return;
		}
		
		if(logoutURI.equalsIgnoreCase(requestURI)) {
			req.getSession().invalidate(); // invalidate : session을 강제로 종료
			resp.sendRedirect("/login"); 
			return;
		}
		
		if(requestURI.contains(adminPage) && !hasRole(req.getSession(), "ADMIN")) { // admin 들어가 있는 요청 주소가 있다면
			resp.sendError(403, "Forbidden");
			return;
		}
			
		
		chain.doFilter(request, response);
	}
	// 로그인이 되어있는지 아닌지
	private boolean authorization(HttpSession session) { 
		User principalUser = (User) session.getAttribute("principal"); //  principal에 user값이 있으면
		return principalUser != null;
	}
	
	private boolean hasRole(HttpSession session, String role) {
		AtomicBoolean result = new AtomicBoolean(false); // 객체로 만들어서 람다로 접근이 가능하다.
		
		if(authorization(session)) {
			User principalUser = (User) session.getAttribute("principal");
			
			String[] roleArray = principalUser.getRoles().replaceAll(" ", "").split(",");
			
			List<String> roleList = Arrays.asList(roleArray);
			
			roleList.forEach(r-> {
				if(r.startsWith("ROLE_") && r.contains(role)) { // 둘다 해당하면 권한을 준다.
					result.set(true);
				}
			});
		}
		
		return result.get();
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}

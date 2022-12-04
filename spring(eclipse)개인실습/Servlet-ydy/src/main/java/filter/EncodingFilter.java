package filter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/*")
public class EncodingFilter extends HttpFilter implements Filter {
       
	private static final long serialVersionUID = 1L;

	
	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest hsr = (HttpServletRequest) request; // 다운캐스팅

		System.out.println(hsr.getMethod());
		
		if(hsr.getMethod().equalsIgnoreCase("POST")) {
			request.setCharacterEncoding(StandardCharsets.UTF_8.name());
		}
		
		// 전처리
		chain.doFilter(request, response);
		// 후처리
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}

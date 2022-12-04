package servlet.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormApi
 */
@WebServlet("/api/form/1")
public class FormApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get요첨옴!!!");
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("phone"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("address"));
		System.out.println(request.getParameter("pw"));
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post요청옴!!!");
		request.setCharacterEncoding("UTF-8");
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("phone"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("address"));
		System.out.println(request.getParameter("pw"));
		
		response.setContentType("text/plain; charset=utf8");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("name : "+request.getParameter("name"));
		out.println("phone : "+request.getParameter("phone"));
		out.println("email : "+request.getParameter("email"));
		out.println("address : "+request.getParameter("address"));
		out.println("password : "+request.getParameter("pw"));
	}

}

package com.study.servlet.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.study.util.DTO;

/**
 * Servlet implementation class Ajax3Api
 */
@WebServlet("/api/ajax3")
public class Ajax3Api extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonData = request.getParameter("data");
		
		Map<String, Object> dataMap = gson.fromJson(jsonData, Map.class);
//		List<String> phoneNumbers = new ArrayList<>(); 리스트 활용
//		
//		dataMap.forEach((key, value) -> {
//			if(value.getClass() == String.class) { // get.class가 String이면 값을 넣어라
//			phoneNumbers.add((String)value);
//			}
//		});
		
		
		response.setContentType("application/json; charest=utf8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		StringBuilder stringBuilder = new StringBuilder(); // StringBuilder : 문자열을 만들어 준다.
		
		dataMap.forEach((key, value) -> {
			stringBuilder.append(value); // 
			stringBuilder.append("-");
		});
		// '010-9974-4562-' 이런식으로 나오게 되면 아래 식으로 뒤에 '-'을 삭제한다.
		stringBuilder.delete(stringBuilder.length() -1, stringBuilder.length()); 
		
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("responseData", stringBuilder.toString());
		
		
		out.print(jsonObject.toString()); // toString 해야 String으로 강조
		
	}

}

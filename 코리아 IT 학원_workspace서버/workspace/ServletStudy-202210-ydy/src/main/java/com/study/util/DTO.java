package com.study.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import lombok.*;

public class DTO {
	
	private DTO() {} // data tramsform object : 데이터를 변환해주는 오브젝트
	
	public static Map<String, String> getParams(HttpServletRequest request){
		Map<String, String> dataMap = new HashMap<>();
		
		Set<String> keySet = request.getParameterMap().keySet();
		keySet.forEach(key -> {
			dataMap.put(key, request.getParameter(key));
		});
		
		return dataMap;
		
		}
	// 모든 요청의 parameter를 받을 수 있다.
	
	
		
		
		
	
}

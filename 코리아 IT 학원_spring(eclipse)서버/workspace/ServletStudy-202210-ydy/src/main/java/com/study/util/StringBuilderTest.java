package com.study.util;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str= "문자열1";
		str +="문자열2";
		
		str = str.replaceAll("문자열2", "문자열3"); //메모리를 각각 만들게 된다.
		
		System.out.println(str);
		
		StringBuilder builder = new StringBuilder(16); 
		// int capacity : 공간 생성, 아무것도 입력 안하면 16 공간 => 32byte 공간이 생김
		// 메모리의 주소가 변하지 않는다. 메모리 낭비를 하지 않는다.
		// 비동기: 동기화를 하지 않는다.
		// thread를 사용하지 않을 때 builder 사용
		
		StringBuffer buffer = new StringBuffer();
		// 동기 
		// 메모리의 낭비를 줄이기 위해서 사용
		// thread 를 사용할때 buffer 사용
	}

}

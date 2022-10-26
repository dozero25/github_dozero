package day31;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		//문자열 생성
		String str= "kim : 010-1324-1234";
		String delim=":";
		StringTokenizer st= new StringTokenizer(str, delim);
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens());
				
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.countTokens());
		System.out.println(st.hasMoreTokens());

	}

}

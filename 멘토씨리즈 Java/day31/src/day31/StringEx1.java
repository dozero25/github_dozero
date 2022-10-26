package day31;

public class StringEx1 {

	public static void main(String[] args) {
		int i=3;
		String str="hello";
		//concat
		System.out.println(str.concat("world"));
		System.out.println(str);
		//substring(시작위치, 끝위치) : 사작위치~끝위치점까지 가져온다
		System.out.println(str.substring(2, 4));
		System.out.println(str.substring(3));
		
		//length
		System.out.println(str.length());
		//toUpperCas,toLowerCase
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		
		
		
		
	}
	

}

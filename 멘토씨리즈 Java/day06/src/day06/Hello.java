package day06;

public class Hello {

	public static void main(String[] args) {
		String s="Hello";
		int i=3;
		float f =3.14f;
		double d=3.14;
		char c='a';
		
		System.out.println(s instanceof String);
		System.out.println(Integer.valueOf(i) instanceof Integer); //integer에 있는 객체타입 만들기
		System.out.println(Float.valueOf(f) instanceof Float); //float에 있는 객체타입 만들기
		System.out.println(Double.valueOf(d) instanceof Double); //double에 있는 객체타입 만들기
		System.out.println(Character.valueOf(c) instanceof Character); //character에 있는 객체타입 만들기
		
		//해당 클래스의 값으로 만들어 줄 수 있습니다
		
		
		
		
	}

}

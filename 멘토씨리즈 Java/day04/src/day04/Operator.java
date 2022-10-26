package day04;

public class Operator {

	public static void main(String[] args) {
			int a=10; //a 변수에 10값 저장
			int b=3; //b 변수에 3값 저장
			double doubleB=3; //자동형변환
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);

			System.out.println(a/doubleB); // 정수/실수 = 실수
			System.out.println(a%doubleB); // 정수 % 실수 = 실수
			System.out.println(doubleB%b); // 실수 % 정수 = 실수
			
	}

}

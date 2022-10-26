package day32;

public class WrapperEx1 {

	public static void main(String[] args) {
		int i = 30;
		Integer ii = new Integer(i); // 기본 자료형의 i를 Integer의 객체 ii로 저장
		System.out.println(ii); //ii는 객체
		
		double d=3.14;
		Double dd=new Double(d); // 일반 기본 자료형을 객체로 사용하기 위해서
		System.out.println(dd);
		

	}

}

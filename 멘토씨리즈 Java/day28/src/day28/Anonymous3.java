package day28;

public class Anonymous3 {

	public static void main(String[] args) {
//		Inter it1=new Inte1(); //Interface는 객체를 생성할 수 없다
		Inter1 it = new Inter1() { //익명클래스 사용

			@Override
			public void f1() {//오버라이딩 사용
					System.out.println("inter1 imple f1()");
				
				
			}}; 
			it.f1();

	}

}
interface Inter1{
	void f1();
}
//일반 클래스
class Inter1Impl implements Inter1{ //inter1을 구현할 인터페이스
	@Override
	public void f1() {
		
	}
	
}

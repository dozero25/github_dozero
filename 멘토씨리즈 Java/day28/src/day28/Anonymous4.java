package day28;

public class Anonymous4 { // 추상클래스 구현
	public static void main(String[] args) {
	//	Abstract ab = Abstract(); 생성 불가
		Abstract ab = new Abstract() {

			@Override
			void f2() {
				System.out.println("Abstract extends f2()"); //추상 클래스는 extends
				
			}
			
		}; 
		ab.f2();
		
}
}
abstract class Abstract{
	abstract void f2();
	
}
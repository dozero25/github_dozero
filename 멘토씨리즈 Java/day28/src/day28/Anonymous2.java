package day28;

public class Anonymous2 {

	public static void main(String[] args) {
		OuterClass1 o = new OuterClass1() {
			void a() {
				System.out.println("새롭게 정의된 익명클래스 메서드입니다.");
			}
			
		};
		o.a();
		OuterClass1 ok= new OuterClass1();
		ok.a(); //익명 클래스는 1회성, 객체를 다시 생성하고 호출하면  OuterClass1에 저으이된 메서드가 호출

	}

}
class OuterClass1{
	void a() {System.out.println("method a");}
	void b() {}
}


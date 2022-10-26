package day27;

public class Interface1 {

	public static void main(String[] args) {
//		Ainter.x=30; 값을 바꿀 수 없는 상수가 된다
		B b= new B();
//		b.methodA();
//		b.methodB();
//		b.x=30;

	}

}

interface Ainter{
	final int x=10;;
	int y=20; //final 생략가능
	abstract void mothodA();
	void mothodB(); //abstract 생략가능
}
class B implements Ainter{

	@Override
	public void mothodA() {
	System.out.println("mothodA()");
	}

	@Override
	public void mothodB() {
		System.out.println("methodB()");	
	}}

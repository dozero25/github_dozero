package day25;

public class Polymorphism1 {

	public static void main(String[] args) {
		
		A obj = new B();
//		obj.methodA();
//		obj.methodB();

	}

}
class A{
	void mothodA() {
		System.out.println("methodA");
	}
	
}
class B extends A{
	void mothodB() {
		System.out.println("methodB");
	}
}
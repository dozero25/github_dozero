package day17;

public class Method1 {

	public static void main(String[] args) {
		open();
		f1(100);
	}
	static void open() {}
	static void f1(int x) {//함수 호출 시 100을 전달받아서, 전달받은 100을 출력하자!
		System.out.println("x :"+x);
	}
	

	
}

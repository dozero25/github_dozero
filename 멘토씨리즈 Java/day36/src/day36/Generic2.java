package day36;

public class Generic2 {

	public static void main(String[] args) {
		A<Integer> a1 = new A<Integer>();
		a1.x=10;
		a1.y=20;
		System.out.println(a1.x+a1.y);
		
		A<String>a2 = new A<>();
		a2.x="hello ";
		a2.y="world!";
		System.out.println(a2.x+a2.y);
	}

}
class A<T>{
	T x;
	T y;
}

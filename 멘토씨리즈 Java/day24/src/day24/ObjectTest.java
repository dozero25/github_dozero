package day24;

public class ObjectTest {

	public static void main(String[] args) {
		Aclass a1 = new Aclass();
		Aclass a2 = new Aclass();
		
		System.out.println(a1.toString()); //toString : 객체정보를 문자열 출력, 생략가능
		System.out.println(a1.equals(a2)); //equals() : 두 객체가 동일한가를 비교
		System.out.println(a1.getClass()); //getClass() : 객체의 클래스정보를 가져온다

	}

}
class Aclass{}

package day23;

public class Constructor3 {

	public static void main(String[] args) {
		Bclass b1 = new Bclass("가길동");
		Bclass b2 = new Bclass(); //오류난다
		
		System.out.println(b1.name);
		Bclass b = new Bclass(); // 디폴드 생성자를 만드는 순간 기본 생성자는 사라지게 된다. 자동으로 생성되지 않는다
		System.out.println(b);

	}

}
class Bclass{
	
	String name; //매개변수 생성자
	Bclass(){} // 생성자 오버로딩 : 여러개 생성자 중복정의
	Bclass(String name){
		System.out.println("Bclass의 매개변수 생성자()");
		this.name=name; //현재 객체를 지칭하기 위한 키워드 매개변수의 변수 명과 객체내 변수의 이름이 같을 경우  this를 사용해서 구분
						//현재 name이 같은 상황
	}
		
	
	
}

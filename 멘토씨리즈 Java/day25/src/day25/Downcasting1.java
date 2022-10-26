package day25;

public class Downcasting1 {

	public static void main(String[] args) {
		//업캐스팅
		Human h1=new Student("가길동", 20, "게임하기",3);
		//h1.study();
		//다운캐스팅
		Student s1=(Student)h1;//업캐스팅된 변수를 다시 다운 캐스팅 한다
		s1.study();  //업캐스팅으로 인해 사용하지 못했던 필드를 다운 캐스팅을 통해 다시 사용가능하도록 함
	}

}

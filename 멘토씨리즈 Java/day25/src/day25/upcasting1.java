package day25;

public class upcasting1 {

	public static void main(String[] args) {
		Student st1=new Student("가길동", 17 , "게임하기", 3);
		st1.info();
		st1.study();
		System.out.println(st1.grade);
		// 업캐스팅
		Human h1=new Student("나길동", 17, "롤하기",3);
		h1.info();
		//h1.study();
		
		

	}

}
class Human{
	String name;
	int age;
	String hobby;
	
	public Human(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby=hobby;
	}
	void info() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("hobby : "+hobby);
	}
}
class Student extends Human{//디폴드 생성값을 받는데 부모 클래스에서 디폴드 값은 없다. 그래서 오류
	int grade;
	public Student(String name, int age, String hobby, int grade) {
		super(name, age, hobby); // 위에 public Human 
		this.grade=grade;
	}
	void info() { // 오버라이딩
		super.info();
		System.out.println("grade : "+grade);
	}
	void study() {
		System.out.println("공부하기~");
		
	}
}

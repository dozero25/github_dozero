package day24;

public class Exam_42 {

	public static void main(String[] args) {
		SportsCar mycar = new SportsCar("red",300);
		System.out.println(mycar.color);
		System.out.println(mycar.speedLimit);

	}

}
class Car{
	int wheel;
	int speed;
	String color;
	Car(){} //부모클래스의 디폴트 생성자 만든다
	Car(String color){
		this.color=color;
	}
}
class SportsCar extends Car{
	int speedLimit;
	SportsCar(String color, int speedLimit){
	//	super(color); // 호출할 부모 생성자 지정하기
		this.color=color;
		this.speedLimit=speedLimit;
	}
}

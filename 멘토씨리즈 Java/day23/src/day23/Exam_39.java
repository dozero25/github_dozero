package day23;

public class Exam_39 {

	public static void main(String[] args) {
		Cellphone myphone = new Cellphone();

	}

}
class Cellphone{
	String model="Galaxy 8";
	String color="red";
	int capacity=64;
	
	Cellphone(){//default 값 설정  /void info, public Aclass
		System.out.println("model : "+model);
		System.out.println("color : "+color);
		System.out.println("capacity : "+capacity);
	}
	}

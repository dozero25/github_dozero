package day20;

public class Ewam31 {

	public static void main(String[] args) {

		Car mycar=new Car() ;
		System.out.println("시동 처음 초기화 : "+mycar.powerOn);
		System.out.println("생상 초기화 : "+mycar.color);
		System.out.println("바퀴의 수 초기화 : "+mycar.wheel);
		System.out.println("속력 초기화 : "+mycar.speed);
		System.out.println("와이퍼 작동 초기화 : "+mycar.wiperOn);
		
		mycar.power();
		System.out.println("시동 메서드 동작 : "+mycar.powerOn);
		
		mycar.power();
		System.out.println("시동 메서드 다시 동작 : "+mycar.powerOn);

		mycar.color="black";
		System.out.println("현재 차의 색상 : "+mycar.color);
	}
}	
	class Car{
		boolean powerOn;
		String color;
		int wheel;
		int speed;
		boolean wiperOn;
		
		void power() {powerOn=!powerOn;}//True -> false, false -> True
		void speedUp() {speed++;}
		void speedDown() {speed--;}
		void wiper() {wiperOn=!wiperOn;}
	

}

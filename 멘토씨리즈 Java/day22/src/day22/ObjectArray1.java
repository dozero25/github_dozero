package day22;

public class ObjectArray1 {

	public static void main(String[] args) {
		
		//클래스명 객체배열명[]=new 클래스명[크기];
		Aclass ar[]=new Aclass[3]; //객체 배열명의 생성ㄴ
		ar[0]=new Aclass(); // 객체를 생성 명령어 , 클래스명();을 통해 꼭 객체를 생성해야만 객체 내 필드 접근 가능
		ar[0].x=100;
		ar[0].f1();

	}

}

class Aclass {
	int x;
	void f1() {
		System.out.println("f1() : "+x);
	}
}
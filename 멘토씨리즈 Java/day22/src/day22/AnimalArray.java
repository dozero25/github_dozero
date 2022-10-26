package day22;

public class AnimalArray {

	public static void main(String[] args) {
		Animal animals[]= new Animal[3];
		for(int i=0;i<3;i++) {
		animals[i]=new Animal();
		}
		animals[0].kind="고양이";
		animals[0].name="나르";
		animals[0].age=1;
		
		animals[1].kind="강아지";
		animals[1].name="초코";
		animals[1].age=3;
		
		animals[2].kind="고양이";
		animals[2].name="니코";
		animals[2].age=1;
		
		for(int i=0;i<3;i++) {//반복문을 사용해서 각각의 객체의 info를 출력한다
			animals[i].info();
		}
	}

}
class Animal{
	String kind;
	String name;
	int age;
	
	void info() {
		System.out.println("kind : "+kind);
		System.out.println("name : "+name);
		System.out.println("age : "+age);
	}
}

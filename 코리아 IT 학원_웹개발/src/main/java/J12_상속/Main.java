package J12_상속;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("윤도영"); // Human 클래스는 Animal 클래스와 메모리의 공간이 붙어있다.
        Tiger tiger = new Tiger("호랑이");


        human.move();
        tiger.move();

        System.out.println("사람의 이름 : "+human.getName());
        System.out.println("호랑이의 이름 : "+tiger.getName());


    }
}

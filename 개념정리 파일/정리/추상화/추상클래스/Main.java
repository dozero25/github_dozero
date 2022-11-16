package 정리.추상화.추상클래스;

public class Main {
    /*
        추상 메소드(abstract method)
        : 자식클래스에서 반드시 오버라이딩해야 사용할 수 있는 메소드 의미
        : 주 목적은 추상 메소드가 포함된 클래스를 상속받는 자식 크래스가 반드시 추상 메소드를 구현하도록 하기 위함
        : 이러한 추상 메소드는 선언부만 조재하며, 구현부는 작성되어 있지 않다.
        : 바로 이 작서오디어 있지 않은 구현부를 자식 클래스에서 오버라이딩하여 사용하는 것이다.

        문법 : abstract 반환타입 메소드이름();

        추상 클래스(abstract class)
        : 추상 메소드를 포함하는 클래스르 가리켜 추상클래스라고 한다
        : 객체 지향 프로그래밍에서 중요한 특징인 다형성을 가지는 메소드의 집합을 정의할 수 있도록 해준다.
        : 반드시 사용되어야 하는 메소드를 추상 메소드로 선언해 놓으면,
        : 이 클래스를 상속받는 모든 클래스에서 반드시 재정의 해야한다.★★★

        문법
        abstract class 클래스 이름{

            abstract 반환타입 메소드이름();
        }

        : 이러한 추상 클래스는 동작이 정의되어 있지 않는 추상 메소드를 포함하고 있으므로, 인스턴스를 생성할 수 없다.
        : 먼저 상속을 통해 자식 클래스를 만들고,
        : 만든 자식 클래스에서 추상 클래스의 모든 추상 메소드를 오러바이딩하고 나서야 비로소 자식 클래스의 인스턴스를 생성할 수 있게 된다.

     */

    public static void main(String[] args) {

        Factory phoneFactory1 = new PhoneFactory("아이폰");

        Factory tabletFactory1 = new TabletFactory("아이패드");

        phoneFactory1.printInfo();
        tabletFactory1.printInfo();

        phoneFactory1.produce("아이폰 14");
        phoneFactory1.managment("아이폰 14");

        tabletFactory1.produce("아이패드 9세대");
        tabletFactory1.managment("아이패드 9세대");


    }


}

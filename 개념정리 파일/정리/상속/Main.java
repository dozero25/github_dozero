package 정리.상속;

public class Main {
    /*
        상속(객체지향 언어)
        : 자식클래스가 상속 받고 싶은 부모클래스를 선택해서 물려받는다.
        : 이때 상속 받는 클래스를 자식 클래스, 하위 클래스 서브 클래스라고 부르며 상속 해주는 클래스를 부모 클래스라고 부른다.

        대상
        : 자식클래스가 부모 클래스로부터 상속을 받게 되면 부모 클래스의 필드와 메서드를 물려받게 된다.
        : 단, 접근제어자가 private을 갖는 필드나 메소드는 상속이 불가능하고, 패키지가 다를 경우 접근 제어가 default인 경우 불가하다.

        장점
        : 중복된 코드를 줄일 수 있고, 유지 보수가 편리하며. 통일성이 있고 다형성을 구현할 수 있다.

        다형성
        : 객체의 기능이 다양한 형태를 가질 수 있음
        : 상속과 깊은 관계를 가진다.
        : 한 부모 밑에서 태어난 자식이 완전히 같을 수 없듯이
        : 부모 클래스로 부터 상속 받은 데이터와 기능을 자식 클래스에서 재정의하여 사용할 수 있다.

     */

    public static void main(String[] args) {

        Human human1 = new Human("윤도영");
        Human human2 = new Human("박준용");

        Dog dog1 = new Dog("곰이");
        Dog dog2 = new Dog("순돌이");

        System.out.println();

        human1.move();
        human2.move();

        System.out.println();

        human1.hello();
        human2.hello();

        System.out.println();

        dog1.move();
        dog2.move();

        System.out.println();

        dog1.eat();
        dog2.eat();



    }
}

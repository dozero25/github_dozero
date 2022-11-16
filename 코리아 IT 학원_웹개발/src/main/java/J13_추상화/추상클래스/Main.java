package J13_추상화.추상클래스;

public class Main {
    public static void main(String[] args) {

        PhoneFactory phoneFactory = new PhoneFactory("애플 스마트폰 공장");
        TabletFactory tabletFactory = new TabletFactory("애플 태블릿 공장");

        phoneFactory.produce("아이폰14");
        tabletFactory.produce("아이패드 프로5");

        phoneFactory.printInfo();
        tabletFactory.printInfo();

//        Factory factory = new Factory(); : 추상 클래스는 생성이 불가능 하다.
        // 상속은 양방향의 관계를 가져야한다.
        // interface로 만드는 것은 전원 버튼과 같은 것이다.
        // 기능적인 부분을 모듈화해서 추가시킨다.
        // 하나의 인터페이스에 여러개의 인터페이스를 연결할 수 있다.


    }
}

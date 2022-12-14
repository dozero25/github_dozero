package 정리.익명클래스;

/*
    익명클래스
    : 이름이 없는 객체, 무명클래스라고 불린다.

    사용하는 이유
    : 나중에 다시 불러질 이유가 없다는 뜻, 일회용
    : 프로그램에서 일시적으로 한번만 사용되고 버려지는 객체
    : 클래스 정의와 구현을 동시에 하기 때문에 코드의 길이를 줄일 수 있다.

    1. 프로그램 내에서 일시적으로 한번만 사용되어야 하는 객체일 경우
    -> UI 이벤트 처리, 스레드 객체 등(단발성 이벤트 처리)

    2. 재사용성이 없고, 확장성을 활용하는 것이 유지보수에서 더 불리할때
    -> 비즈니스 로직이 정말 재각각이며, 재사용성이 전혀 없어 매번 클래스를 생성해야하는 비용이 더 많을 때


 */

public class Main {
    public static void main(String[] args) {
        Interface1 interface1 = new Class1();
        Interface1 interface2 = new Class1();
        Interface1 interface3 = new Class1();
        Interface1 interface4 = new Class1();
        Interface1 interface5 = new Class1();

        interface1.methodName();
        interface2.methodName();
        interface3.methodName();
        interface4.methodName();
        interface5.methodName();

        Interface1 interface6 = new Interface1() {
            /*
                임시로 정의 생성 -> 주소만 들어있는 상태
                한번만 사용할 거면 익명 클래스로 만들고, 여러번 사용할거면 클래스로 만들고
             */
            @Override
            public void methodName() {

            }

            @Override
            public void methodName2() {

            }
        }; // 익명 클래스 뒤에는 ; 을 붙인다.
        interface6.methodName();
        interface6.methodName2();
    }
}

package 정리.참조자료형캐스팅;

public class Main {
    /*
        참조자료형
        : 기본형을 제외한 타입들이 모두 참조형이다.
        : java에서 최상위 java.lang.Object 클래스를 상속하는 모든 클래스를 말한다.
        : 클래스 타입으로 변수를 선언하는 자료형이다.
        : 값이 아닌 객체의 주소를 가지고 있는 자료형
        : 배열 타입(array type), 클래스 타입(class type), 인터페이스 타입(interface type), 열거 타입(enum type)이 있다.
        : 빈 객체를 의미하는 Null이 존재한다.
        : 문법상 에러가 없지만 실행시켰을 때 에러가 나는 런타입 에러가 발생한다.
        : ex) 객체나 배열이 null 값으로 받으면 NullPointException 발생하므로 변수 값을 넣어야한다.
        : new로 생성한 것들은 메모리 영역인 heap 영역에 생성하게 되고, Garbage Collector가 돌면서 메모리가 해제된다.
        : heap 메모리에 생성된 인스턴스는 접근하기 위해 stack 역영에 존재하는 참조값을 가지고 있어 이를 통해 핸들링한다.
     */
    public static void main(String[] args) {

        Computer computer1 = new Computer();
        Speaker speaker1 = new Speaker();
        LED led1 = new LED();

        CentralControl centralControl = new CentralControl(new Power[3]);
        centralControl.addDevice(computer1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(led1);

        computer1.on();
        computer1.gameOnOff();
        computer1.off();

        speaker1.on();
        speaker1.volumUpDown();
        speaker1.off();

        led1.on();
        led1.off();







    }





}

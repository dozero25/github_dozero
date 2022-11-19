package 정리.참조자료형캐스팅;

public class LED implements Power {
    @Override
    public void on() {
        System.out.println("LED의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("LED의 전원을 종료합니다.");
    }
}

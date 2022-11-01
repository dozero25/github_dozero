package J14_참조자료형캐스팅;

public class Main {

    public static void main(String[] args){

        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        Computer computer3 = new Computer();
        LED led = new LED();
        Speaker speaker = new Speaker();

        CentralControl centralControl1 = new CentralControl(computer1, computer2, computer3);
        // 묵시적으로 power가 생략이 되었다.
        // computer가 power를 implements를 했기 때문에 가능하다.
        // power를 implements한 객체면 어느 객체가 와도 사용 가능하다.
        CentralControl centralControl2 = new CentralControl(computer1, led, speaker);
        // 다른 객체지만 연결할 수 있게 해주는 것을 interface의 역할이라고 한다.
        centralControl1.powerOn();
        System.out.println("------------------");
        centralControl1.powerOff();
        System.out.println("------------------");
        centralControl2.powerOn();
        System.out.println("------------------");
        centralControl2.powerOff();
    }
}

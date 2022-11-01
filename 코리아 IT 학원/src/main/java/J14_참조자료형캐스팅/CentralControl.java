package J14_참조자료형캐스팅;

// 중앙제어
public class CentralControl {
    // power를 implements한 객체면 어느 객체가 와도 사용 가능하다.
    private Power device1;
    private Power device2;
    private Power device3;

    public CentralControl(Power device1, Power device2, Power device3) {
        this.device1 = device1;
        this.device2 = device2;
        this.device3 = device3;
    }

    public void powerOn(){
        device1.on();
        device2.on();
        device3.on();
    }

    public void powerOff(){
        device1.off();
        device2.off();
        device3.off();
    }
}

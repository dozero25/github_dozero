package HomeWork.참조자료형캐스팅;


public class CentralControl{

    private Power Computer;
    private Power LED;
    private Power Speaker;

    public CentralControl(Power Computer, Power LED, Power Speaker) {
        this.Computer = (Power) Computer;
        this.LED = (Power) LED;
        this.Speaker = (Power) Speaker;
    }

    public void powerOn() {
        Computer.on();
        LED.on();
        Speaker.on();
    }

    public void powerOff() {
        Computer.off();
        LED.off();
        Speaker.off();
    }
}

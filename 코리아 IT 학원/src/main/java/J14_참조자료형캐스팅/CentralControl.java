package J14_참조자료형캐스팅;

public class CentralControl { // 배열처리
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }
    public void addDevice(Power device){
        int emptyIndex = checkEmpty();
        if(emptyIndex == -1){
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            System.out.println();
            return;
        }
        deviceArray[emptyIndex] = device; // checkempty를 받은 emptyIndex에 device를 넣는다.
        System.out.println(device.getClass().getSimpleName() + "장치가 연결되었습니다.");
        System.out.println();
    }
    private int checkEmpty(){
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null){ // 빈공간 찾기
                return i;
            }
        }
        return -1; // 공간이 없을 경우 -1로 리턴
    }
    public void powerOn(){
        for(int i=0;i<deviceArray.length;i++){
            if(deviceArray[i] == null)continue; // 하나의 명령이면 중괄호 생략 가능
            deviceArray[i].on();
        }
    }
    public void powerOff(){
        for(int i=0;i<deviceArray.length;i++){
            if(deviceArray[i] == null)continue;// 하나의 명령이면 중괄호 생략 가능
            deviceArray[i].off();
        }
    }
}

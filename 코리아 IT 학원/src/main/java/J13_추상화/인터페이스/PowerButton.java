package J13_추상화.인터페이스;

public class PowerButton extends Button {

    private boolean status;

    @Override // Button
    public void onPressed() { // boolean에 아무것도 입력하지 않으면 false로 초기화
        if(status){
            status = false;
            System.out.println("전원을 끕니다.");
        }else{
            status = true;
            System.out.println("전원을 켭니다.");
        }
    }

}

package 정리.추상화.인터페이스;

public class VolumeDownButton extends Button {
    @Override
    public void onPressed() {
        System.out.println("음향을 내립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("음향을 계속 내립니다.");
    }
}

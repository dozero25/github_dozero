package 정리.추상화.인터페이스;

public class VolumeUpButton extends Button {
    @Override
    public void onPressed() {
        System.out.println("음향을 높입니다.");
    }

    @Override
    public void onUP() {
        System.out.println("음향을 계속 높입니다.");
    }
}

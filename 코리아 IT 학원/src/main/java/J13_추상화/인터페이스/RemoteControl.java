package J13_추상화.인터페이스;

public class RemoteControl { // 클래스 이름 바꾸는 단축키 : shift + f6

    private PowerButton powerButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public RemoteControl(PowerButton powerButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    public void onPressPowerButton(){powerButton.onPressed();}

    public void onPressVolumeUpButton(){volumeUpButton.onPressed();}

    public void onPressVolumeDownButton(){volumeDownButton.onPressed();}

    public void onDownVolumeUpButton(){volumeUpButton.onDown();}

    public void onDownVolumeDownButton(){volumeDownButton.onDown();}
}

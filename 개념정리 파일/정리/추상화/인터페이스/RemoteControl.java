package 정리.추상화.인터페이스;

public class RemoteControl {

    private PowerButton powerButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public RemoteControl(PowerButton powerButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    public void onPressPowerButton(){powerButton.onPressed();}

    public void onPressVolumeUpButton(){volumeUpButton.onPressed();}

    public void onDownVolumeDownButton(){volumeDownButton.onPressed();}
}

package J13_추상화.인터페이스;

public class Main {
    public static void main(String[] args) {
        // remoteControl를 각각의 주소를 받게 만들었다.
        RemoteControl remoteControl = new RemoteControl(new PowerButton(), new VolumeUpButton(), new VolumeDownButton());

        remoteControl.onPressPowerButton();
        remoteControl.onPressPowerButton();
        remoteControl.onPressPowerButton();
        remoteControl.onPressVolumeUpButton();
        remoteControl.onDownVolumeDownButton();
        remoteControl.onPressVolumeUpButton();
        remoteControl.onDownVolumeDownButton();




    }
}

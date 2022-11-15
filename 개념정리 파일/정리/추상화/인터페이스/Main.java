package 정리.추상화.인터페이스;

public class Main {
    /*
        인터페이스(interface)
        : 다중 상속을 지원하고 있다.
        : 다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서, 다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상클래스이다.
        : 추상 클래스는 추상 메소드뿐만 아니라 생성자, 필드, 일반 메소드도 파함할 수 있다.
        : 인터페이스는 오로지 추상 메소드와 상수만을 포함할 수 있다.
        : 생성자 정의가 불가하며, 일반 변수 선언이 불가능하다.
        : 일반 메소드를 정의하기 위해서는 default를 사용해야 한다.
        : 사물과 사물 사이 또는 사물과 인간 사이의 경계에서, 상호 간의 소통을 위해 만들어진 물리적 매개체나 프로토콜을 말한다.
        : class 앞에 abstract를 붙이고 뒤엔 implements를 붙인다.
     */

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl(new PowerButton(),new VolumeDownButton(), new VolumeUpButton());

        remoteControl.onPressPowerButton();

        remoteControl.onPressVolumeUpButton();
        remoteControl.onPressVolumeUpButton();

        remoteControl.onDownVolumeDownButton();
        remoteControl.onDownVolumeDownButton();

        remoteControl.onPressPowerButton();


    }
}

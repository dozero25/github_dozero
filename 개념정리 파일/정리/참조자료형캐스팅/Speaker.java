package 정리.참조자료형캐스팅;

public class Speaker implements Power {

    private String volum;

    @Override
    public void on() {
        System.out.println("스피커의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스피커의 전원을 종료합니다.");
    }

    public void volumUpDown() {
        System.out.println("볼륨 설정 ( + / - / x )");
        volum = scanner.next();
            while(volum.equals("+") || volum.equals("-") ||volum.equals("x") || volum.equals("X")){
                if(volum.equals("+")){
                    System.out.println("볼륨 업~!");
                    volum = scanner.next();
                    continue;
                }if (volum.equals("-")){
                    System.out.println("볼륨 다운~!");
                    volum = scanner.next();
                    continue;
                }if (volum.equals("x") || volum.equals("X")){
                    System.out.println("설정 정지");
                    break;
                }
            }
        }







}

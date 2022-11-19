package 정리.참조자료형캐스팅;


public class Computer implements Power {

    private String gameOnOff;

    @Override
    public void on() {
        System.out.println("컴퓨터의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터의 전원을 종료합니다.");
    }

    public void gameOnOff() {
        System.out.println("게임을 실행하시겠습니까? (y/n)");
        gameOnOff = scanner.next();
        if(gameOnOff.equals("y") || gameOnOff.equals("Y")){
            System.out.println("게임을 실행합니다.");
            while(gameOnOff.equals("y") || gameOnOff.equals("Y")){
                System.out.println("게임 실행 중입니다.");
                System.out.println("종료 하시겠습니까? (y/n)");
                String turnOnOff = scanner.next();
                if(turnOnOff.equals("y") || turnOnOff.equals("Y")){
                    break;
                } else if (turnOnOff.equals("n") || turnOnOff.equals("N")) {
                    System.out.println("게임을 계속 진행합니다.");
                }
            }
        } else if (gameOnOff.equals("n") || gameOnOff.equals("N")) {
            System.out.println("게임을 실행하지 않습니다.");
        }
    }


}

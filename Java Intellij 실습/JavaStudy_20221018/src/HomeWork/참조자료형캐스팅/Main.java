package HomeWork.참조자료형캐스팅;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CentralControl[] centralControls = new CentralControl[3];
        Power[] power = new Power[3];
        power[0] = new Computer();
        power[1] = new LED();
        power[2] = new Speaker();

        for (int i = 0; i< power.length; i++) {
            if(power[i] instanceof Computer) {
                ((Computer)power[i]).on();
            } else if (power[i] instanceof Speaker) {
                ((Speaker)power[i]).on();
            }
              else if (power[i] instanceof LED) {
                ((LED)power[i]).on();
            }
        }
        System.out.println("==========");
        for (int i = 0; i< power.length; i++) {
            if(power[i] instanceof Computer) {
                ((Computer)power[i]).off();
            } else if (power[i] instanceof Speaker) {
                ((Speaker)power[i]).off();
            }
            else if (power[i] instanceof LED) {
                ((LED)power[i]).off();
            }
        }





    }
}

package BackJun;

import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = 0;
        int minute = 0;

        System.out.print("Hour : ");
        hour = scanner.nextInt();
        System.out.print("Minute : ");
        minute = scanner.nextInt();
        
        if (hour < 0 || hour > 23 || minute < 0 || minute >59) {
            System.out.println("잘못입력하셨습니다.");
        }
        else {
            if (minute >= 45){
                minute = minute - 45;
                System.out.println(hour+"시 "+minute+"분");
            }
            else if(minute < 45){
                hour -= 1;
                minute = ((minute+60) -45);
                System.out.println(hour+"시 "+minute+"분");

            }

        }

        

    }
}

package ch11;

import java.util.Scanner;

public class BaekJoon06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int hour =0;
        int minute = 0;
        int time = 0;

        System.out.print("시간 입력 : ");
        hour = scanner.nextInt();
        System.out.print("분 입력 : ");
        minute = scanner.nextInt();
        System.out.print("타임 입력 : ");
        time = scanner.nextInt();

        if(hour < 0 || hour > 23 || minute < 0 || minute > 59 || time < 0 || time >1000){
            System.out.println("입력 오류");
        } else {
            if((minute+time) > 59){
               hour += (minute + time)/60;
               if(hour > 23){
                   hour -= 24;
               }
               minute = (minute + time)%60;

               System.out.println(time +"분 입력하였습니다.");
               System.out.println(hour+"시 "+minute+"분으로 설정하였습니다.");
            } else if (minute + time < 60) {
                minute = minute + time;
                System.out.println(time +"분 입력하였습니다.");
                System.out.println(hour+"시 "+minute+"분으로 설정하였습니다.");
            }

        }
	}

}

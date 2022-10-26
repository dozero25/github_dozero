package J06_조건;

import java.util.Scanner;

public class Condition4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score;

        System.out.print("점수를 입력하세요 : ");
        score = sc.nextInt();

        if(score < 0 || score > 100){
            System.out.println("계산불가");
        } else {
            switch (score / 10){ // 사이사이에 표시를 해두었다. switch는 선택한 것부터 실행시키는 코드
                case 10: //100 / 10 은 10이므로 case 10으로 갔지만 break가 없어서 case 9로 내려가게 된다.
                case 9:
                    System.out.println("A학점");
                    break;
                case 8:
                    System.out.println("B학점");
                    break;
                case 7:
                    System.out.println("C학점");
                    break;
                case 6:
                    System.out.println("D학점");
                    break;
                default: // 해당 케이스가 없으면 찾아가는 지점
                    System.out.println("F학점");

            }
        }








    }
}

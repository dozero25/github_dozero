package BackJun.IF;

import java.util.Scanner;

public class Test_score {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.print("성적을 입력해주세요 : ");
        score = sc.nextInt();

        if(score <0 || score > 100){
            System.out.println("범위에 들어있지 않습니다.");
        }else {
           if(score > 89){
               System.out.println("A");
            } else if (score > 79) {
               System.out.println("B");
           } else if (score > 69) {
               System.out.println("C");
           } else if (score >59) {
               System.out.println("D");
           } else {
               System.out.println("F");
           }


        }



    }
}

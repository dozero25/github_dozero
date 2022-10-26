package J06_조건;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score;      // 시험 점수
        String grade;   // 학점(등급)

        System.out.println("점수 입력 : ");
        score = sc.nextInt();

        if(score <= 0 || score >= 100 ) {
            grade = "X";
        } else if (score > 89) {
            grade = "A";
        } else if (score > 79) {
            grade = "B";
        } else if (score > 69) {
            grade = "C";
        } else if (score > 59) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("입력한 점수는 "+score+"이며 학점은 "+grade+"입니다.");

    }
}

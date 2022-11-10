package BackJun.배열;

import java.util.Scanner;

public class AverageOver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentNum = scanner.nextInt(); // 학생수 입력
        int [] array = new int[studentNum];
        int sum = 0, avg =0; // 합계와 평균
        int count = 0;
        double standard_avg = 0;


        for(int i = 0; i < studentNum; i++){
            array[i] = scanner.nextInt(); // 점수를 배열에 저장
            sum += array[i];    // 저장된 점수를 sum에 더함
            avg = (sum/studentNum); // 평균 구하기
        }
        System.out.println("학생 평균 점수 : "+avg+"점");

        for(int j = 0; j < array.length; j++){
            if(array[j] > avg){ 
                count++;    // 만약 array[i]가 avg보다 크면 카운트
            }
        }

        standard_avg = (double)count / studentNum * 100; //double로 형변환
        String num = String.format("%.3f", standard_avg);
        System.out.println("총 학생 평균 : "+num+"%");








    }
}

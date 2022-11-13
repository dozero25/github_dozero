package 정리;

import java.util.Scanner;

public class 배열 {

    /*
        배열

       : 동일한 자료형의 데이터를 연속된 공간에 저장하기 위한 자료구조이다.
       : 즉, 연관된 데이터를 그룹화하여 묶어준다라고 생각

       장점
       : 연관된 데이터를 저장하기 위한 변수의 선언을 줄여주며, 반복문 등을 이요하여 계산과 같은 과정을 쉽게 처리

       배열 선언 및 사용
       1.
       자료형[] 변수 = {데이터1, 데이터2, 데이터3, ...}
       : 데이터들의 값을 알고 있을 때 사용하면 편리
       : 인덱스 번호는 데이터를 저장한 순서대로 0부터 시작하여 1씩 증가되어 만들어진다.

       2.
       자료형[] 변수 = new 자료형[배열 크기];
       변수[0] = 데이터값;
       변수[1] = 데이터값;

       : 배열값을 모르지만 향후 값을 저장하기 위한 배열을 생성하고 싶을 경우 주로 사용
       : new라는 연산자로 배열을 생성시키는데, 메모리 영역(heap)에 값을 저장한다.

       3.
       for(자료형 변수 : 배열){    // 배열의 값이 있으면 자료형 변수로 값을 보내주고
            반복 실행할 문장;      // 문장이 실행
       }                        // 값이 없으면 종료

       : 작성하는 구간이 문법적으로 간결해졌다.
       : 종료조건과 초기값, 증감식을 숨기고 배열과 변수를 이용하며 문장을 반복시키는 방법이다.

    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("예제 1.");
        // 1-1
        String[] animals = {"Tiger", "Pig", "Dog", "Cat"};

        System.out.println(animals[0]);
        System.out.println(animals[1]);
        System.out.println(animals[2]);
        System.out.println(animals[3]);

        System.out.println();

        // 1-2
        int [] score = {95, 80, 100, 72, 89};
        int sum = 0;
        for(int i = 0; i < score.length; i++){
            sum += score[i];
        }
        double avg = (double)sum / score.length;
        System.out.println("점수 합계 : "+ sum);
        System.out.println("점수 평균 : "+ avg);

        System.out.println();

        System.out.println("예제 2.");

        // 2-1
        int [] num = new int[3];
        num[0] = 10;
        num[1] = 15;
        num[2] = 20;
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }

        System.out.println();

        // 2-2

        System.out.print("배열을 생성해주세요 : ");
        int [] num1 = new int[scanner.nextInt()];
        int max, min;
        for(int i = 0; i < num1.length; i++) {
            num1[i] = scanner.nextInt();
        }
        max = num1[0];
        min = num1[0];

        for(int i = 0; i < num1.length; i++) {
            if(max < num1[i]) {
                max = num1[i];
            }
            if(min > num1[i]) {
                min = num1[i];
            }
        }
        System.out.println("최댓값 : "+max);
        System.out.println("최소값 : "+min);


        System.out.println();

        // 3.
        System.out.println("예제3.");
        int [] studentAvg = {95, 100, 82, 77, 68, 93};
        int stuAllAvg = 0;

        for(int student : studentAvg){
            stuAllAvg += student;
        }
        System.out.println("전체 학생 평균 : "+stuAllAvg);







    }
}

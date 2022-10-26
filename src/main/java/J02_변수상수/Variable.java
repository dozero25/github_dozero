package J02_변수상수;

import java.sql.SQLOutput;

/*변수*/
public class Variable {
    public static void main(String[] args) {

        // 논리자료형 변수
        boolean checkFlag = false;
        //   선언          = 초기화
        System.out.println(checkFlag);
        checkFlag = true;
        System.out.println(checkFlag);

        // 문자자료형 변수
        char name1 = '윤';
        char name2 = '도';
        char name3 = '영';
        System.out.println(name1); // Ctrl+D = 라인 복사
        System.out.println(name2); // tab 자동완성
        System.out.println(name3);
        System.out.println(""+name1+name2+name3); // 문자열이 우선이라 문자열로 나오게 된다.
        System.out.println('가'+0);               // 문자열이 없을 경우 숫자로 나오게 된다.

        // 문자열자료형 변수
        String n1 = "윤도영";
        String n2 = "김준일";
        String n3 = n1+n2;
        System.out.println(n1);
        System.out.println(n3);

        // 정수자료형 변수
        int width = 100;
        int width2 = 200;

        String width3 = "300";
        String width4 = "400";

        int widthResult = width + width2;
        String widthResult2 = width3 + width4;

        System.out.println(widthResult);
        System.out.println(widthResult2);

        long time = System.currentTimeMillis(); // 현재 시간 표기
        System.out.println(time);

        long time2 = 1666178902358L;
        System.out.println(time2);

        // 실수자료형 변수
        double pi = 300000000.141592653599999999999;
        System.out.println(pi);
        
        // 상수 , 상수는 대문자로 적기로 약속, 상수이기로 표기
        final String FILE_PATH = "C:/Users/junil"; // 폴더 지정
//        FILE_PATH = "D:/Users/junil";
        System.out.println(FILE_PATH);


    }
}

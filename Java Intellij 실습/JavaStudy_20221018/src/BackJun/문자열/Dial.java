package BackJun.문자열;

import java.util.Scanner;

public class Dial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numStr = scanner.nextLine();

        int count = 0;
        int strArray = numStr.length(); // numStr의 문장길이 만큼 배열 생성

        for (int i = 0; i < strArray; i++) { // 문장 길이 만큼 반복
            switch(numStr.charAt(i)){ // numStr의 문자열을 하나씩 가져오기 위해 사용
                case 'A' : case 'B' : case 'C':
                    count +=3;
                    break;
                case 'D' : case 'E' : case 'F':
                    count +=4;
                    break;
                case 'G' : case 'H' : case 'I':
                    count +=5;
                    break;
                case 'J' : case 'K' : case 'L':
                    count +=6;
                    break;
                case 'M' : case 'N' : case 'O':
                    count +=7;
                    break;
                case 'P' : case 'Q' : case 'R': case 'S':
                    count +=8;
                    break;
                case 'T' : case 'U' : case 'V':
                    count +=9;
                    break;
                case 'W' : case 'X' : case 'Y': case 'Z':
                    count +=10;
                    break;
            }
        }
        System.out.println(count);


    }
}

package BackJun.문자열;

import java.util.Scanner;

public class StringRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt(); // 몇 번 반복할 건지 입력
        for(int i = 0; i < count; i++) {

            int repeat = scanner.nextInt(); // 해당 숫자의 반복 횟수 입력

            String str = scanner.next(); // 반복할 문자열 입력

            for(int j = 0; j < str.length(); j++) {
                for(int k = 0; k < repeat; k++) { // str의 배열길이에 repeat만큼 반복을 한다.
                    System.out.print(str.charAt(j)); // j의 길이만큼 한글자씩 반복한다.
                }
            }

            System.out.println();
            /*
            charAt : String 타입으로 받은 문자열을 char 타입으로 한 글자만 받는 함수이다.
             */
        }

    }
}

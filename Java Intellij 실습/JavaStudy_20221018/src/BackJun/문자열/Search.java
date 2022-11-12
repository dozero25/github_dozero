package BackJun.문자열;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        for(char c= 'a'; c <='z'; c++) {
            System.out.print(s.indexOf(c)+", ");
        }

        /*

            indexOf 활용해서 특정 문자 위치 찾기
            : 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며 만약 찾지 못했을 경우 -1 을 반환한다.

            사용법

            .indexOf("찾을 특정 문자", "시작할 위치")

            indexOf(String str)
            indexOf(int ch)
            indexOf(int ch, int fromIndex)
            indexOf(String str, int fromIndex)


            lastIndexOf
            : 특정 문자나 문자열이 뒤에서 부터 처음 발견되는 인덱스를 반환, 찾지 못할 경우 -1 반환

            사용법은 동일

            lastIndexOf(String str)
            lastIndexOf(int ch)
            lastIndexOf(int ch, int fromIndex)
            lastIndexOf(String str, int fromIndex)


         */


    }
}

package BackJun.문자열;

import java.util.Scanner;

public class WordStudy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().toUpperCase();
        // toUpperCase : 모든 문자열을 대문자로 변환
        // toLowerCase : 모든 문자열을 소문자로 변환

        int [] count = new int[26]; // 알파벳은 총 26개로 배열 지정

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 'A'; // 앞자리가 A인 경우 65-65해서 count 배열에 0번째 값 증가
            count[num]++;
        }
        int max = 0;
        char answer = '?';
        for(int i = 0; i < count.length; i++) { // 알파벳 길이만큼 실행
            if(max < count[i]){
                max = count[i];
                answer = (char)(i+'A'); // 해당 위치 알파벳을 알아내기 위해 사용
            } else if (max == count[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);

    }
}

package BackJun.문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        StringTokenizer sentence1 = new StringTokenizer(sentence, " ");
        /*
            StringTokenizer
            : 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스
            : import를 해줘야한다.
         */

        System.out.println(sentence1.countTokens());
        // countTokens : 남아있는 token의 개수를 반환한다. 전체 갯수가 아닌 현재 남아있는 token의 갯수이다.

    }
}

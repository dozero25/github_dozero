package BackJun.문자열;

import java.util.Scanner;

public class GroupWordCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < num; i++) {
            String str = scanner.next();
            boolean check[] = new boolean[26];
            boolean group = true; // 그룹일 경우 true

            for(int j = 0; j <str.length(); j++) { // str의 문자 길이만큼 반복
                int index = str.charAt(j)-'a'; // 알파벳의 아스키코드가 들어가있기 때문에 'a'를 빼야 원하는 계산이 된다.
                if(check[index]){ // check에 index가 있으면
                    if(str.charAt(j) != str.charAt(j-1)) { // 이전 문자와 연속되지 않는다면
                        group = false; // 그룹으로 된 단어가 아님, false
                        break;
                    }
                }
                else { // 이전에 사용한 문자가 아니라면
                    check[index] = true; // true
                }
            }
            if(group) count++; // true이면 count++
        }
        System.out.println(count);
    }
}

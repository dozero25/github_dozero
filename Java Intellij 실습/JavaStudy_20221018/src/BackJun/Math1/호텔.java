package BackJun.Math1;

import java.util.Scanner;

public class 호텔 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i <t; i++) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            int n = scanner.nextInt();

            if(n%h != 0) {
                System.out.println((n%h * 100)+(n/h)+1);
                // 4층의 호텔에서 10명이 묵는다고 하면 한 층수에 사람 한명씩 들어가니까
                // 층수에 사람을 나눈 나머지 값이 마지막 사람이 머무는 층이 되고
                // 나눈 몫은 사람이 묵는 마지막 호수가 된다. 여기서 0호실 이 없으므로 +1을 해준다.
            }
            else {
                System.out.println((h * 100)+(n%h));
                // 이 경우는 n % h 가 나눈 나머지가 0이 나올 경우 0층이 되므로,
                // 그 의미는 해당 층에서 머문다는 의미로 마지막 층을 그대로 사용하게 된다.
                // n과 h를 나눈 나머지 값이 해당 호실이 된다.
            }
        }







    }
}

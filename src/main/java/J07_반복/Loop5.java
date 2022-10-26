package J07_반복;

import java.util.*;

public class Loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isEmpty = true;
        while(isEmpty) {
            System.out.print("숫자를 입력하세요 : ");
            int num = sc.nextInt();
            // 0을 입력하면 계속 반복된다.
            if(num != 0){ // 0이 아닌 다른 것을 입력하면 isEmpty가 false가 되면서 정지된다.
                isEmpty = false;
            }
        }
    }
}

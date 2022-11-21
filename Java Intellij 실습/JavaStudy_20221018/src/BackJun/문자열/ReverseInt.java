package BackJun.문자열;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
        b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());

        if(a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}

package BackJun.배열;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int max = 0;
        double sum = 0;
        double avg = 0;

        int [] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
            if(array[i] > max) { // array가 max보다 크면 큰 값을 max에 담는다.
                max = array[i];
            }
        }
        for(int i = 0; i < array.length; i++) {
            sum += array[i]*100/max; // 자꾸 값이 이상하게 나왔는데 100을 앞으로 빼니까 정상적으로 나옴
        }
        System.out.println(max);
        System.out.println(sum);
        avg = sum/a;
        System.out.println(avg);





    }

}

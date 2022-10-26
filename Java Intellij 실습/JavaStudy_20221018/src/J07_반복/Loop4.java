package J07_반복;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {

        int dan = 2;
        for (int i = 1; i< 9; i++){
            dan = i+1;
            for(int j = 0; j< 9; j++){
                int num = j+1;
                System.out.println(dan + " x "+ num + " = "+(dan * num));
            }
        }


    }
}

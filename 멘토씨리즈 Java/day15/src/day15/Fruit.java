package day15;

import java.util.*;

public class Fruit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String fruits[]=new String[3];
		for(int i=0;i<3;i++) {
			System.out.print("주문한 과일 : ");
			fruits[i]=sc.next();
		}
		System.out.println("---주문받은 과일---");
		for(String eachFruit:fruits) {
			System.out.print(eachFruit+" ");
		}
		

	}

}

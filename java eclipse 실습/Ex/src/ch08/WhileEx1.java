package ch08;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "Y";
		String otherAn = "y";

		int count = 0;
		while (answer.equals("Y")) {
			System.out.println("음악을 재생하시겠습니까?(Y or y)");
			answer = sc.next();
			if (answer.equals("Y")) {
				System.out.printf("음악을 %d번 재생하였습니다. \n", ++count);
				continue;
			}
			while (otherAn.equals("y")) {
				System.out.println("음악을 재생하시겠습니까?(Y or y)");
				otherAn = sc.next();
				if (otherAn.equals("y")) {
					System.out.printf("음악을 %d번 재생하였습니다. \n", ++count);

				}

			}

		}
		System.out.println("재생종료");

	}

}

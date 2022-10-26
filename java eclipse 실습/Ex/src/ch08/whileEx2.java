package ch08;

import java.util.Scanner;

public class whileEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "Y";
		String answer1 = "y";
		String answer2 = "N";
		String answer3 = "n";

		int count = 0;
		while (answer.equals(answer)) {
			System.out.println("음악을 재생하시겠습니까? (Y or y), 종료하시겠습니까? (N or n)");
			answer = sc.next();
			if (answer.equals(answer2)) {
				System.out.println("재생종료");
				break;
			}
			if (answer.equals(answer3)) {
				System.out.println("재생종료");
				break;
			}
			if (answer.equals(answer)) {
				System.out.printf("음악을 %d번 재생하였습니다.", ++count);
			}

		}
		while (answer1.equals(answer1)) {
			System.out.println("음악을 재생하시겠습니까? (Y or y), 종료하시겠습니까? (N or n)");
			answer1 = sc.next();
			if (answer1.equals(answer2)) {
				System.out.println("재생종료");
				break;
			}
			if (answer1.equals(answer3)) {
				System.out.println("재생종료");
				break;
			}
			if (answer1.equals(answer1)) {
				System.out.printf("음악을 %d번 재생하였습니다.", ++count);
			}

		}

	}

}

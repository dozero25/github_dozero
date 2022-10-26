package ch07;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);

	private static int num;
	private String name;

	public Student(int num) {
		this.num = 1;

		System.out.print("학생 이름을 입력해주세요 : ");
		name = sc.next();

	}

	// 학생 수험번호를 출력합니다.
	public void printId() {
		System.out.println(name + "학생의 수험번호는 " + num + "입니다.");
		num++;
	}

}

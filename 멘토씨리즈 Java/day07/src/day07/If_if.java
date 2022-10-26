package day07;

import java.util.Scanner;

public class If_if {

	public static void main(String[] args) {
		String id, pw;
		Scanner input=new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 : ");
		id = input.nextLine(); //뛰어쓰기 까지 입력받기
		
		if (id.equals("java")) {
			System.out.println("아이디 일치합니다. ");
			System.out.print("비밀번호를 입력해주세요 : ");
			pw = input.nextLine();
			if(pw.equals("abc123")) {
				System.out.println("비밀번호 일치합니다.");
				System.out.println("로그인하셨습니다");
			} else { // 위에 아이디 틀릴시 부정
				System.out.println("비밀번호 맞지 않습니다.");
				}
		}
		else { //제일 위 아이디와 연결(부정)
			System.out.println("아이디 맞지 않습니다");
		}

	}

}

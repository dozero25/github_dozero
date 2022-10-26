package day11;

//사용자에게 숫자를 입력받아, 입력받은 숫자를 출력하는 프로그램 구현하기
//단, 0을 입력햇을 때는 반복을 종료하되, 음수를 입력했을 경우 숫자를 출력하지 않고 계속해서 반복 진행

import java.util.Scanner;

public class ContinueEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		while(true) {
			System.out.print("숫자입력 : ");
			i=sc.nextInt();
			//num==0종료
			if(i==0) {
				System.out.println("종료");
				break;
			}
			else if(i<0) {// num<0 다시 반복시작
				System.out.println("아래 명령을 무시하고 진행합니다!");
				continue;
			}
			System.out.println("i : "+i);
		}
	}
}

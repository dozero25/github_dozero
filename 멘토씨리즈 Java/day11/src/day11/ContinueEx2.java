package day11;

import java.util.Scanner;

public class ContinueEx2 {

	public static void main(String[] args) {
		int money=10000;
		System.out.println("현재가진돈은 10000원입니다.");
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("얼마를 사용하시겠습니까?");
		int i=sc.nextInt();
		if(!(0<=i&&i<money)) {//!(좌우가 참, 0보다 크고 money보다 작은 값 : 가 아닐때는
			System.out.println("다시 입력해주세요(사용범위가 틀렸습니다.)");
			continue;
		}
		System.out.printf("이제 %d원이 남았습니다. \n",money-i);
		if(money==0) {
			break;
		}
		}
		System.out.println("모든 돈을 사용합니다. 종료");
		
	}

}

package day11;

import java.util.Scanner;

public class BreakEx2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum=0;
		int i;
		while(true) {
			System.out.println("더할 숫자를 입력하세요 : (종료하려면 0입력)");
			i=sc.nextInt();
			if(i==0) {
				break;
			}
			sum+=i;
		}
		System.out.println("현재까지의 총 합="+sum);

	}

}

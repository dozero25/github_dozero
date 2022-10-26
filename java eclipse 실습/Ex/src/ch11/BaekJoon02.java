package ch11;

import java.util.Scanner;

public class BaekJoon02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int 국어 = 0;
		int 수학 = 0;
		int 영어 = 0;
		
		System.out.print("국어 성적을 입력해주세요 : ");
		국어 = sc.nextInt();
		System.out.print("수학 성적을 입력해주세요 : ");
		수학 = sc.nextInt();
		System.out.print("영어 성적을 입력해주세요 : ");
		영어 = sc.nextInt();
		
		int total = (국어 + 수학 + 영어)/3;
		
		
		if(total < 0 || total >100) {
			System.out.println("범위 밖의 점수입니다.");
			System.out.println("다시 입력해주세요!!!");
		} else {
			if(total > 89) {
				System.out.println("총 평균 : "+total);
				System.out.println("A");
			}
			else if(total > 79) {
				System.out.println("총 평균 : "+total);
				System.out.println("B");
			}
			else if(total > 69) {
				System.out.println("총 평균 : "+total);
				System.out.println("C");
			}
			else if(total > 59) {
				System.out.println("총 평균 : "+total);
				System.out.println("D");
			}
			else {
				System.out.println("총 평균 : "+total);
				System.out.println("F");
			}
		}

	}

}

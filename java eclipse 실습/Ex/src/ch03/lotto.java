package ch03;

import java.util.*;

public class lotto {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int lotto[]=new int[6]; //랜던 번호 생성
		int user[]=new int[6]; // 유저 번호 입력
		int bonus, bonusUser;
		int count=0;
		
		//사용자에게 1~45개의 6개의 숫자를 입력 받아 배열, 보너스 점수 입력
		System.out.print("1~45 중 숫자를 6개 선택해주세요 : ");
		for(int i=0;i<6;i++) {
			user[i]=sc.nextInt();
		}
		System.out.print("1~45 중 보너스 숫자 1개를 선택해주세요 : ");
		bonusUser=sc.nextInt();
		Arrays.sort(user);
		System.out.println("User : "+Arrays.toString(user)+", bonus : "+bonusUser);
		
		//6개의 랜덤의 숫자와 보너스  점수를 로또 배열에 저장
		for(int i=0;i<6;i++) {
			lotto[i]=random.nextInt(45)+1;
			}
			Arrays.sort(lotto);
		
			bonus=random.nextInt(45)+1;
			
				System.out.println("Lotto : "+Arrays.toString(lotto)+", bonus : "+bonus);
		//사용자가 입력한 값과 로또 배열에 있는 값을 비교하여 동일한 값의 개수를 count
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(user[i] == lotto[j]) {
					count++;}
			}
		}
		//로또 배열의 값과 사용자 배열의 값 중 같은 값이 몇 개 있는지 카운팅
		System.out.println("맞춘 숫자 갯수 : "+count+"개");
		if(count ==6) {
			System.out.println("축하합니다! 1등입니다!!");
		}
		else if(count ==5) {
			if(bonus==bonusUser) {
			System.out.println("보너스 당첨!");
			System.out.println("축하합니다! 2등입니다!!");}
			else {
				System.out.println("축하합니다! 3등입니다!!");}
		}
		else if(count == 4) {
			System.out.println("축하합니다! 4등입니다!!");
		}
		else if(count == 3) {
			System.out.println("축하합니다! 5등입니다!!");
		}
		else {
			System.out.println("다음에 다시 도전하세요~");
		}
		
	}
}
package day13;

import java.util.*; //java.util 패키지에 있는 모든 클래스 import


public class Lotto {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		
		int lottoAr[]=new int[6]; //랜덤 번호 생성
		int userAr[]=new int[6]; //유저 번호 입력
		int bonus, bonusUser;
		int count=0;
		
		
		
		//사용자에게 1~45의 6개의 숫자를 입력 받아 배열 저장하고 사용자에게 보너스 점수를 입력
		System.out.print("1부터 45 중 숫자를 6개 선택해주세요 : ");
		for(int i=0;i<6;i++) {
			userAr[i]=sc.nextInt();
		}
		System.out.print("1부터 45 중 보너스 숫자 1개 선택해주세요 : ");
		bonusUser=sc.nextInt();
		System.out.println("User : "+Arrays.toString(userAr)+" ,bonus : "+bonusUser);
		
		//6개의 랜덤의 숫자와 보너스 점수를 로또 배열에 저장
		for(int i=0;i<6;i++) {
			lottoAr[i]=random.nextInt(45)+1; //0~44 -> 1~45 lottoAr i에 랜덤값 6개를 입력
				}
			bonus=random.nextInt(45)+1; 
				
				System.out.println("Lotto : "+ Arrays.toString(lottoAr)+", bonus : "+bonus);
		
		//사용자가 입력한 값과 로또 배열에 있는 값을 비교하여 동일한 값의 개수를  count한다
		for (int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(userAr[i] == lottoAr[j]) {
					count++;}
				}
		}
		//몇 개의 숫자를 맞췄는지 다음과 같은 조건에 따라 등수르 출력한다.
		//로또배열의 값과 사용자 배열의 값 중 같은 값이 몇개 있는지 카운팅
		System.out.println("맞춘 숫자 갯수 : "+count+"개");
		if(count==6) {
			System.out.println("축하합니다! 1등입니다.");
		} //if - else if 만약 조건1이 참이라면~ 만약에 조건1이 거짓이고, 조건2가 참이라면
		
		else if(count==5) {
			if(bonus==bonusUser) {
				System.out.println("보너스 당첨!");
				System.out.println("축하합니다! 2등입니다.");}// if-else 만약 조건이 참이라면~ / 그렇지 안다면
			else {
				System.out.println("축하합니다! 3등입니다.");} //
			}
		else if(count==4) {
			System.out.println("축하합니다! 4등입니다.");}
		
		else if(count==3) {
			System.out.println("축하합니다! 5등입니다.");}
		
		else {
			System.out.println("다음에 다시 도전하세요~");}
		
	}
}

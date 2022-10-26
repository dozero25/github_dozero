package day10;

//랜덤으로 1~100까지의 숫자 하나가 지저오디며 사용자에게 숫자를 입력 받아 
//랜덤숫자 < 입력 값 : down 출력 후 반복
//랜덤숫자 > 입력 값 : up 출력 후 반복
//랜덤숫자 ==입력 값 : 정답 출력 후 반복 종료

//위 조건으로 실행되는 프로그램 구현하기

import java.util.*;//util 패키지에 있는 모든 클래스 가져와

public class UpdownGame {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random random=new Random();
		int user=-1;
		int rnum=random.nextInt(100)+1;
		while(rnum!=user) {//랜덤값과 사용자 입력값이 같이 않으면 계속 입력
			System.out.print("숫자입력 : ");
			user=sc.nextInt();
			if(rnum<user) { //만약 랜던 숫자가 사용자 입력 숫자보다 작으면  down
				System.out.println("Down!");
			}
			else if(rnum>user) {//만약 위에가 아닐 경우 없우 up
				System.out.println("Up");
			}
			else {
				System.out.println("정답!");
			}
		}
		
	}

}

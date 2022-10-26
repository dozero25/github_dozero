package ch02;
import java.io.IOException;
import java.util.*;

public class Ex2 {
	//업 다운 게임
	//랜덤으로 1~100 까지의 숫자 하나를 가져와 사용자에게 숫자를 입력 받아
	//랜덤 숫자 < 입력 값 : down 출력
	//랜덤 숫자 > 입력 값 : up 출력
	//랜덤 숫자 == 입력 값 : 정답 출력 후 반복 종료
	//기회는 7번
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		Random random = new Random();
		int[] user = new int[7];
		int a = 0;
		char b = 0;
		int rNum =random.nextInt(100)+1;
		while(true) {
			for(int i=0;i<user.length;i++) {
				System.out.print("숫자를 입력해주세요 : ");
				user[i]=sc.nextInt();
				if(user[i] == rNum) {
					System.out.println("정답입니다.");
					break;}
				else {
				if(user[i]>rNum) {
					System.out.println("틀렸습니다!!");
					System.out.println("down");} 
				else if(user[i]<rNum) {
					System.out.println("틀렸습니다!!");
					System.out.println("up");}
				a++;
				System.out.println("입력하신 횟수는 "+a+"번 입니다."+a);}
				}
			if(a==7) {
				System.out.println("게임이 끝났습니다.");
				System.out.printf("정답은 "+rNum+"였습니다. \n", rNum);
			}
			System.out.println("게임을 계속 하시겠습니까? (y or n)");
			b=(char)System.in.read();
			if(b=='n'||b=='N') {
				break;}
			else if(b=='y'||b=='Y') {
				System.out.println("게임을 재시작합니다.");
				break;
			}
		}
	}
}

							
			
				
					
				




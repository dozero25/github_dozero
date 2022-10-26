package day10;
//사용자에게 입력받은 값이 y 라면 음악 재생을 반복하고 아니라면 반복을 멈추는 코드를 구현
import java.util.Scanner;

public class Whie3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String answer="Y"; //answer값을 Y로 초기화해야 while 실행 가능, while문이 실행되도록 초기값을 조건이 심일 값을 넣어준다
		int count=0;
		while(answer.equals("Y")) {//answer가 동일하는가 y하고
			System.out.println("음악을 재생하시겠습니까?(Y)");
			answer=sc.nextLine();
			if(answer.equals("Y")){
				System.out.printf("음악을 %d번 재생하였습니다.\n",++count);
				
			}
		}
		System.out.println("재생종료");

	}

}

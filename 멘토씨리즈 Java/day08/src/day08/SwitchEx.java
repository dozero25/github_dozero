package day08;

//import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// 일년동안 읽은 책 수에 따라 멘트를 출력
	//	Scanner sc=new Scanner(System.in);
	//	System.out.println("당신이 읽으신 책의 갯수를 입력해주세요 : ");
	//	int book = sc.nextInt();
		int book=30;
		
		switch(book/10) {
		case 1:
			System.out.println("아직 부족해요!");
//			break; // break가 없을 경우 1 또는 2또는 3또는 으로 변한다. 모든 case 실행
		case 2:
			System.out.println("책을 좋아하시나봐요!");
//			break;
		case 3:
			System.out.println("훌륭한 독서인이신군요!");
//			break;
		default:
			System.out.println("당신은 독서왕입니다.");
			

			
		
		
		}

	}

}

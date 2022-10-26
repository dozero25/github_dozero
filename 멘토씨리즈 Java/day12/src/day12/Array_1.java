package day12;

public class Array_1 {

	//3명의 학생 점수를 저장하고 싶다
	public static void main(String[] args) {
//		int []student = new int[3];
//		System.out.println("현재 자동으로 초기화된 값 :"+student[0]);
//		
//		student[0]=30;
//		student[1]=20;
//		student[2]=10;
//		
//		System.out.println("현재 첫번째 요소의 값 = "+student[0]);
		
//		int score1 =100;
//		int score2 =80;
//		int score3 =70;
//		
//		System.out.println("1번째 학생의 점수 : "+score1+"점");
//		System.out.println("2번째 학생의 점수 : "+score2+"점");
//		System.out.println("3번째 학생의 점수 : "+score3+"점");
		
		int scores[] = new int[6];
		scores[0]=100;
		scores[1]=80;
		scores[2]=70;
		scores[3]=70;
		scores[4]=70;
		scores[5]=70;
		
		for(int i = 0; i<6; i++) {
			System.out.println(i+1+"번째 학생의 점수 : "+scores[i]+"점");
		}
		
		
		
//		System.out.println("1번째 학생의 점수 : "+scores[0]+"점");
//		System.out.println("2번째 학생의 점수 : "+scores[1]+"점");
//		System.out.println("3번째 학생의 점수 : "+scores[2]+"점");
				
	}

}

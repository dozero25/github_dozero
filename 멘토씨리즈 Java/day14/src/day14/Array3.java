package day14;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int scores[][]=new int[4][3]; //학생 4명, 과목: 국 영 수 3개
		String subject[]= {"국어","영어","수학"};
		//
//		for(int i=0;i<4;i++) {
//			System.out.println(i+1+"번 학생 점수----");
//			for(int j=0;j<3;j++){
//				System.out.print(subject[j]+":");
//				scores[i][j]=sc.nextInt();}
//		}
//		System.out.println("\t국어\t영어\t수학");
//		for(int i=0;i<4;i++) {
//			System.out.print(i+1+"번:\t");
//			for(int j=0;j<3;j++) {
//				System.out.print(scores[i][j]);
//				System.out.print("\t");		}
//			System.out.println();
//		}
		for(int j = 0; j <4; j++) {
			System.out.println((j+1) + "번 학생 점수----");
			for(int i=0;i<3;i++){
				System.out.print(subject[i] + ":");
				scores[j][i] = sc.nextInt();}
				}
		
		//2차원배열에 저장된 값을 출력
			for(int i =0; i<3; i++) {
				System.out.print("\t"+subject[i]);}
			
			System.out.println();
			
			for (int j = 0; j < 4; j++) {
				System.out.print(j+1+"번:\t");
				for (int i=0; i<3;i++) {
					System.out.print(scores[j][i]+"\t");
				}
				System.out.println();
			}
	
			

}

}

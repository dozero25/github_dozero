package ch03;

import java.util.Random;

public class Ex3 {
	//java로 중복 제거된 랜덤 구현하기
	public static void main(String[] args) {
		int a[]=new int[10];
		Random random= new Random();
		
		for(int i=0;i<10;i++) {
			a[i] = random.nextInt(10)+1;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					i--;
				}
			}
		}for(int b=0;b<10;b++) {
			System.out.println(a[b]);
		}
		
	}
	

}

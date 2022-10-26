package ch02;

import java.util.Scanner;

public class Ex1 {
	//id, pw 일치 불일치	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pw;
		boolean ad = true;
		System.out.print("아이디를 입력해주세요 : ");
		id=sc.next();
		
		while(ad) {
		if(id.equals("java")) {
			System.out.println("아이디가 일치합니다.");
			break;}
		else  {
			System.out.println("등록된 정보가 없습니다. 다시 입력해주세요 : ");
			id=sc.next();
			
			}}
			System.out.print("비밀번호를 입력해주세요 : ");
			pw=sc.next();
			
			while(ad) {
			if(pw.equals("1234")) {
				System.out.println("비밀번호가 일치합니다.");
				System.out.println("로그인 성공!");
				break;
			}
			else {
				System.out.println("비밀번호 불일치");
				System.out.print("다시 입력해주세요 : ");
				pw=sc.next();
				
			}
		}
		}
		}
	
	

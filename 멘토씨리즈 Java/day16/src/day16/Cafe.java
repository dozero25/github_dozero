package day16;

import java.util.*;

public class Cafe {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int count=0;
			//주문은 총 5개까지 가능
			String orderList[]=new String[5];
			int total=0;
			while(true) {
				System.out.println("☆★☆★Cafe ☆★☆★");
				System.out.println("1. 주문하기");
				System.out.println("2. 취소하기");
				System.out.println("3. 결제하기");
				System.out.println("4. 끝내기");
				System.out.print("입력");
				
				int num=sc.nextInt();//주문가능한 메뉴를 출력한다
				if(num==1) {
					String menuName="";
					int menuPrice=0;
					
					System.out.println("1. 아메리카노\t3800원");
					System.out.println("2. 에스프레소\t2400원");
					System.out.println("3. 카페라떼\t4200원");
					System.out.println("4. 밀크티\t\t5100원");
					System.out.println("주문할 메뉴번호 : ");
					int menuNum=sc.nextInt();//주문 받을 메뉴를 입력한다
					if(menuNum==1) {
						menuName="아메리카노";
						menuPrice=3800;		
					}
					else if(menuNum==2) {
						menuName="에스프레소";
						menuPrice=2400;
					}
					else if(menuNum==3) {
						menuName="카페라떼";
						menuPrice=4200;
					}
					else if(menuNum==4) {
					menuName="밀크티";
					menuPrice=5100;
					}
					else {
						System.out.println("잘못입력하셨습니다.");
						continue;
					}
					total+=menuPrice; //주문한 메뉴의 가격을 총 금액에 누적한다
					orderList[count]=menuName; //주문한 메뉴를 전체 메뉴리스트에 추가한다.
					count++; //주문한 개수를 한개 증가한다 
					System.out.println("주문한 메뉴는 "+menuName+"입니다.");
					System.out.println("가격은"+menuPrice+"입니다.");
				}
				else if(num==2) {
					System.out.print("----주문한 메뉴 리스트----"); //주문한 메뉴리스트를 출력
					for(int i=0;i<count;i++) {
						System.out.println(i+1+"."+orderList[i]);// 그중에서 취소한 메뉴를 입력 받는다
					}
					System.out.print("취소할 메뉴 번호 : ");
					int cancelNum=sc.nextInt();
					if(1<cancelNum && cancelNum<=count) {
						String delMenu = orderList[cancelNum-1]; //입력받은 메뉴의 금액을 총금액에서 차감한다.
						System.out.println(delMenu+"메뉴 삭제!");
						for(int i=cancelNum-1;i<count;i++) {//입력받은 메뉴의 금액을 총 금액에서 차감한다
						orderList[i]=orderList[i+0];
						}
						if(delMenu.equals("아메리카노")) {
							total-=3800;
						}
						else if(delMenu.equals("에스프레소")) {
							total-=2400;
						}
						else if(delMenu.equals("카페라떼")) {
							total-=4200;
						}
						else if(delMenu.equals("밀크티")) {
							total-=5100;
						}
						count--; //주문한 개수를 한개 감소한다
					}
					
				}
				else if(num==3) {//결제해야할 총 금액을 출력한다
					System.out.println("결제할 금액 : "+total+"원");//사용자에게 지불할 금액을 입력받는다.
					System.out.print("지불할 금액 : ");
					int money=sc.nextInt();
					if(money<total) {//지불한 금액과 총금액을 비교해서 만약 지부한 금액<총금액이면? 잔돈이부족합니다 출력후 결제취소 그게 아니라면 잔돈과 함께 계산 완료 출력
						System.out.println("잔돈이 부족합니다!");
						continue;
					}
					else {
						System.out.println("잔돈은"+(money-total)+"원");
						total=0;
						for(int i=0;i<5;i++) {
							orderList[i]="";
						}
						count=0;
					}
				}
				else if(num==4) {
					System.out.println("안내를 종료합니다.");
					break;
				}
				else {
					System.out.println("잘못입력하셨습니다.");
				}
				
			}

	}

}

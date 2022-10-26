package ch01;

import java.util.*;
//카페 메뉴판 만들기
public class A3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int count=0;
			int total=0;
			String orderList[] = new String[100];
			while(true) {
				System.out.println("☆★☆★Cafe Menu☆★☆★");
				System.out.println("1. COFFEE 선택");
				System.out.println("2. TEA 선택");
				System.out.println("3. LATE 선택");
				System.out.println("4. SMOOTHE 선택");
				System.out.println("5. ADE 선택");
				System.out.println("6. BREAD 선택");
				System.out.println("7. 결제하기");
				System.out.println("8. 종료");
				System.out.print("입력");
			
				int num= sc.nextInt();
				if(num==1) {
				String menuName="";
				int menuPrice=0;
				
				System.out.println("1. 아메리카노\t4000원");
				System.out.println("2. 카페라떼\t4200원");
				System.out.println("3. 바닐라라떼\t4500원");
				System.out.println("4. 카라멜라떼\t4500원");
				System.out.println("주문할 메뉴번호 : ");
					int menuNum=sc.nextInt();
					if(menuNum==1) {
						menuName="아메리카노";
						menuPrice=4000;
					}
					else if(menuNum==2) {
						menuName="카페라떼";
						menuPrice=4200;
					}
					else if(menuNum==3) {
						menuName="바닐라라떼";
						menuPrice=4500;
					}
					else if(menuNum==4) {
						menuName="카라멜라떼";
						menuPrice=4500;
					}
					else {
						System.out.println("잘못입력하셨습니다.");
						continue;
					}
					total+=menuPrice;
					orderList[count]=menuName;
					count++;
					System.out.println("주문한 메뉴는 "+menuName+"입니다.");
					System.out.println("가격는 "+menuPrice+"입니다.");
					System.out.println();
					}
				else if(num==2) {
					System.out.println("TEA 선택");
					String menuName1="";
					int menuPrice1=0;
					
					System.out.println("1. 복숭아아이스티\t4000원");
					System.out.println("2. 레몬차\t4500원");
					System.out.println("3. 유자차\t4500원");
					System.out.println("4. 자몽차\t4500원");
					System.out.println("5. 레몬밤\t4000원");
					System.out.println("6. 얼그레이\t4000원");
					System.out.println("7. 캐모마일\t4000원");
					System.out.println("주문할 메뉴번호 : ");
					int menuNum2=sc.nextInt();
					if(menuNum2==1) {
						menuName1="복숭아아이스티";
						menuPrice1=4000;
					}
					else if(menuNum2==2) {
						menuName1="레몬차";
						menuPrice1=4500;
					}
					else if(menuNum2==3) {
						menuName1="유자차";
						menuPrice1=4500;
					}
					else if(menuNum2==4) {
						menuName1="자몽차";
						menuPrice1=4500;
					}
					else if(menuNum2==5) {
						menuName1="레몬밤";
						menuPrice1=4000;
					}
					else if(menuNum2==6) {
						menuName1="얼그레이";
						menuPrice1=4000;
					}
					else if(menuNum2==7) {
						menuName1="캐모마일";
						menuPrice1=4000;
					}
					else {
						System.out.println("잘못입력하셨습니다.");
						continue;
					}
					total+=menuPrice1;
					orderList[count]=menuName1;
					count++;
					System.out.println("주문한 메뉴는 "+menuName1+"입니다.");
					System.out.println("가격는 "+menuPrice1+"입니다.");
					System.out.println();
					}
				else if(num==3) {
					System.out.println("LATE 선택");
					String menuName2="";
					int menuPrice2=0;
					
					System.out.println("1. 딸기에빠진우유\t5500원");
					System.out.println("2. 녹차라떼\t4500원");
					System.out.println("3. 초코라떼\t4500원");
					System.out.println("4. 민트초코라떼\t4500원");
					System.out.println("5. 고구마라떼\t4500원");
					System.out.println("6. 마숫가루라떼\t4500원");
					System.out.println("주문할 메뉴번호 : ");
					int menuNum3=sc.nextInt();
					if(menuNum3==1) {
						menuName2="딸기에빠진우유";
						menuPrice2=5500;
					}
					else if(menuNum3==2) {
						menuName2="녹차라떼";
						menuPrice2=4500;
					}
					else if(menuNum3==3) {
						menuName2="초코라떼";
						menuPrice2=4500;
					}
					else if(menuNum3==4) {
						menuName2="민트초코라떼";
						menuPrice2=4500;
					}
					else if(menuNum3==5) {
						menuName2="고구마라떼";
						menuPrice2=4500;
					}
					else if(menuNum3==6) {
						menuName2="마숫가루라떼";
						menuPrice2=4500;
					}
					else {
						System.out.println("잘못입력하셨습니다.");
						continue;
					}
					total+=menuPrice2;
					orderList[count]=menuName2;
					count++;
					System.out.println("주문한 메뉴는 "+menuName2+"입니다.");
					System.out.println("가격는 "+menuPrice2+"입니다.");
					System.out.println();
					}
				else if(num==4) {
					System.out.println("SMOOTHE 선택");
					String menuName3="";
					int menuPrice3=0;
					
					System.out.println("1. 딸기요거트스무디\t6000원");
					System.out.println("2. 블루베리요거트스무디\t6000원");
					System.out.println("3. 망고요거트스무디\t6000원");
					System.out.println("4. 오레오쉐이크\t6000원");
					System.out.println("주문할 메뉴번호 : ");
					int menuNum4=sc.nextInt();
					if(menuNum4==1) {
						menuName3="딸기요거트스무디";
						menuPrice3=6000;
					}
					else if(menuNum4==2) {
						menuName3="블루베리요거트스무디";
						menuPrice3=6000;
					}
					else if(menuNum4==3) {
						menuName3="망고요거트스무디";
						menuPrice3=6000;
					}
					else if(menuNum4==4) {
						menuName3="자몽오레오쉐이크차";
						menuPrice3=6000;
					}
					else {
						System.out.println("잘못입력하셨습니다.");
						continue;
					}
					total+=menuPrice3;
					orderList[count]=menuName3;
					count++;
					System.out.println("주문한 메뉴는 "+menuName3+"입니다.");
					System.out.println("가격는 "+menuPrice3+"입니다.");
					System.out.println();
					}
				else if(num==5) {
					System.out.println("ADE 선택");
					String menuName4="";
					int menuPrice4=0;
					
					System.out.println("1. 자몽에이드\t4500원");
					System.out.println("2. 레몬에이드\t4500원");
					System.out.println("3. 체리에이드\t4500원");
					System.out.println("4. 체리콕\t4500원");
					System.out.println("5. 망고후르츨에이드\t4500원");
					System.out.println("주문할 메뉴번호 : ");
					int menuNum5=sc.nextInt();
					if(menuNum5==1) {
						menuName4="복숭아아이스티";
						menuPrice4=4500;
					}
					else if(menuNum5==2) {
						menuName4="레몬차";
						menuPrice4=4500;
					}
					else if(menuNum5==3) {
						menuName4="유자차";
						menuPrice4=4500;
					}
					else if(menuNum5==4) {
						menuName4="자몽차";
						menuPrice4=4500;
					}
					else if(menuNum5==5) {
						menuName4="레몬밤";
						menuPrice4=4500;
					}
					else {
						System.out.println("잘못입력하셨습니다.");
						continue;
					}
					total+=menuPrice4;
					orderList[count]=menuName4;
					count++;
					System.out.println("주문한 메뉴는 "+menuName4+"입니다.");
					System.out.println("가격는 "+menuPrice4+"입니다.");
					System.out.println();
					}
				else if(num==6) {
					System.out.println("BREAD 선택");
					String menuName5="";
					int menuPrice5=0;
					
					System.out.println("1. 초코빵\t4500원");
					System.out.println("2. 생크림빵\t4500원");
					System.out.println("3. 딸기롤케이크\t5500원");
					System.out.println("4. 에그마요샌드위치\t6000원");
					System.out.println("5. 닭가슴살샌드위치\t6000원");
					System.out.println("6. 햄샌드위치\t6000원");
					System.out.println("주문할 메뉴번호 : ");
					int menuNum6=sc.nextInt();
					if(menuNum6==1) {
						menuName5="초코빵";
						menuPrice5=4500;
					}
					else if(menuNum6==2) {
						menuName5="생크림빵";
						menuPrice5=4500;
					}
					else if(menuNum6==3) {
						menuName5="딸기롤케이크";
						menuPrice5=5500;
					}
					else if(menuNum6==4) {
						menuName5="에그마요샌드위치";
						menuPrice5=6000;
					}
					else if(menuNum6==5) {
						menuName5="닭가슴살샌드위치";
						menuPrice5=6000;
					}
					else if(menuNum6==6) {
						menuName5="햄샌드위치";
						menuPrice5=6000;
					}
					else {
						System.out.println("잘못입력하셨습니다.");
					}
					total+=menuPrice5;
					orderList[count]=menuName5;
					count++;
					System.out.println("주문한 메뉴는 "+menuName5+"입니다.");
					System.out.println("가격는 "+menuPrice5+"입니다.");
					System.out.println();
					}
				else if(num==7) {
					System.out.println("결제할 금액"+total+"원");
					System.out.print("지불할 금액 : ");
					int money=sc.nextInt();
					if(money<total) {
						System.out.println("잔돈이 부족합니다.");
						continue;
					}
					else {
						System.out.println("잔돈은"+(money-total)+"원");
						total=0;
						for(int i=0;i<count;i++) {
							orderList[i]="";
						}
						count=0;
					}
				}
				else if(num==8) {
					System.out.println("안내를 종료합니다.");
					break;
			}
		}
}}

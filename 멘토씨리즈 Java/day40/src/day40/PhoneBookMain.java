package day40;

import java.util.*;
//한번에 java.util 패키지 클래스 import 하기

public class PhoneBookMain {
	static HashMap<String, String> hm = new HashMap<String, String>();
	// -main은 static 영역이므로 main영역에서도 사용하기 위해 static 변수로 지정
	static Scanner sc=new Scanner(System.in);
	//모든 메서드에서 알아야 할 필드 : 클래스 영역 내에서 생성
	public static void main(String[] args) {
		int choice;
		while(true) {
			System.out.println("☆★☆★☆★ 전화번호부 프로그램 입니다.~!! ☆★☆★☆★");
			System.out.println("1. 고객정보저장");
			System.out.println("2. 고객정보검색");
			System.out.println("3. 고객정보출력");
			System.out.println("4. 끝내기");
			choice = sc.nextInt();
			if(choice==1) {
				System.out.println("----------고객 정보 저장----------");
				insert();
			}
			else if(choice==2) {
				System.out.println("----------고객 정보 검색----------");
				search();
			}
			else if(choice==3) {
				System.out.println("----------고객 정보 출력----------");
				show();
			}
			else if(choice==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {System.out.println("잘못입력하셨습니다.");}
		}
		
		
		
	}
	public static void insert() {//insert() : 고객 정보 저장 -저장할 고객의 이름을 받아  hashmap에 존재하지 않을 경우 저장 가능

		System.out.print("저장할 고객의 이름 : "); 
		String insertName = sc.next();
		//name이 key 이므로, 중복허용 불가!
		if(hm.containsKey(insertName)) {
			System.out.println("이미 존재하는 사람이므로 저장할 수 없습니다.");
		}
		else {
			System.out.print("저장할 고객 번호 : ");
			String insertPhone = sc.next();
			hm.put(insertName, insertPhone);
			System.out.println("저장이 완료됬습니다.");
					
		}
	}
	public static void search() { //search() : 고객정보 검색 - 검색할 고객의 이름을 입력 받아, hashmap에 존재할 경우 검색 가능
		String searchName;
		System.out.print("검색할 이름 : ");
		searchName = sc.next();
		//searchName이 hm에 존재해야 검색 가능!
		if(hm.containsKey(searchName)) {
			System.out.println("검색 완료!");
			System.out.println("검색된 전화번호 : "+hm.get(searchName));
		}
		else {
			System.out.println("존재하지 않는 이름입니다.");
		}
	}
	public static void show() {//show() : 고객 전체 출력 
		Set keySet = hm.keySet(); //Iterator을 가져오기 위해 먼저 hashmap의 key들을 set 으로 가져온다
		Iterator i = keySet.iterator();//가져온 keyset으로 iterator을 선언 후, 다음 요소가 존재할 때까지 반복해서 전체 요소를 가져온다.
		System.out.println("----------전체 고객 조회----------");
		while(i.hasNext()) {
			String curName=(String)i.next();
			System.out.println("name : "+curName+", phone : "+hm.get(curName));
			
		}
	}


}

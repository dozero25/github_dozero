package day39;

import java.util.HashMap;
import java.util.Scanner;

public class Map1 {
	//HashMap을 사용하여 간단한 사전(dictionary) 프로그램 만들어 보기
	public static void main(String[] args) {
		HashMap hm =new HashMap();
		Scanner sc = new Scanner(System.in);
		
		//1. put(key, value)
		hm.put("apple", "사과");
		hm.put("paper", "종이");
		hm.put("flower", "꽃");
		String voca;
		
		System.out.println("알고 싶은 단어를 입력하세요 : ");
		voca = sc.nextLine();
		//2. containKey(Key) : Key가 hashmap에 존재한다면 true
		if(hm.containsKey(voca)) {
			//3. get(key) : value 값 반환
			System.out.println("해당하는 단어의 뜻은 "+hm.get(voca)+"입니다.");
		}
		else {
			System.out.println("해당 단어에 뜻은 데이터베이스에 없습니다.");
		}
		

	}

}

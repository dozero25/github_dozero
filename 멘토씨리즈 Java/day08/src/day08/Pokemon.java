package day08;

import java.util.Random;

public class Pokemon {

	public static void main(String[] args) {
		Random random=new Random();
		System.out.println("☆★☆★☆★Ramdom Choosing a Pokemon☆★☆★☆★");
		System.out.println("1. 피카츄");
		System.out.println("2. 꼬부기");
		System.out.println("3. 이상해씨");
		System.out.println("4. 잠만보");
		System.out.println("5. 뮤츠");
		System.out.println("6. 망나뇽");
		System.out.println("7. 파이리");
		System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		int mp=random.nextInt(7)+1;//0~6밖에 범위지정하기 때문에, +1을 해준다
		System.out.println("선택된 번호 :"+mp);
		switch(mp) {
		case 1:
			System.out.println("피카츄가 선택되었습니다.");
			break;
		case 2:
			System.out.println("꼬부기가 선택되었습니다.");
			break;
		case 3:
			System.out.println("이상해씨가 선택되었습니다.");
			break;
		case 4:
			System.out.println("잠만보가 선택되었습니다.");
			break;
		case 5:
			System.out.println("뮤츠가 선택되었습니다.");
			break;
		case 6:
			System.out.println("망나뇽가 선택되었습니다.");
			break;
		case 7:
			System.out.println("파이리가 선택되었습니다.");
			break;
			
		}
	}

}

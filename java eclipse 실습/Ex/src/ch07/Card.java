package ch07;

public class Card {
	
	private static int cardid;
	private int num;
	
	public Card(int num){
		this.cardid=1000;
		this.num=num;
	}
	
	public void printshow() {
		System.out.println(num +"기기에서 카드번호 "+cardid+"가 발급되었습니다.");
		cardid++;
	}

}

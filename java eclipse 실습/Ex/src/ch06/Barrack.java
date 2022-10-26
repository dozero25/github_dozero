package ch06;

public class Barrack {

	public static int marineCount = 0;

	private int energy = 50;
	private int terran;
	private int barrackNum;
	private String name;

	private int hp;

	// 게이트웨이 hp
	public Barrack() {
		this.hp = 1000;
		this.name="배럭"+(barrackNum+1);
	}

	// 테란 자원 추가
	public void productTer(int terran) {
		this.terran += terran;
	}

	// 마린 생산
	public Marine createMarine() {
		System.out.println("자원이 소모됩니다.");
		this.terran -= this.energy;
		System.out.println("테란 유닛이 생산되었습니다.");
		marineCount++;
		return new Marine("마린 : " + marineCount);
	}

	// 공격을 받습니다.
	public void beattack(int power) {
		if (this.hp <= 0) {
			System.out.println(this.name + "가 파괴 되었습니다.");
		} else {
			this.hp -= power;
		}
	}

	public void showinfo() {
		System.out.println("==== 배럭 정보 ====");
		System.out.println("이름 : " + this.name);
		System.out.println("건물 체력 : " + this.hp);
	}

	public void showSource() {
		System.out.println("==== 테란 자원 정보 ====");
		System.out.println("총 자원 : " + terran);
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}
}

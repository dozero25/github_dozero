package ch06;

public class Hatchery {
	// 저글링 두마리 생성
	public static int zerglingCount = 0;

	private int energy = 25;
	private int zeg;
	private int hatcheryNum;
	private String name;

	private int hp;

	// 게이트웨이 hp
	public Hatchery() {
		this.hp = 1250;
		this.name="해처리"+(hatcheryNum+1);
	}

	// 저그 자원 추가
	public void productZeg(int zeg) {
		this.zeg += zeg;
	}

	// 저글링 생산
	public Zergling createZergling() {
		System.out.println("자원이 소모됩니다.");
		this.zeg -= this.energy;
		System.out.println("저그 유닛이 생산되었습니다.");
		zerglingCount += 2;
		return new Zergling("저글링" + zerglingCount);
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
		System.out.println("==== 해처리 정보 ====");
		System.out.println("이름 : " + this.name);
		System.out.println("건물 : " + this.hp);
	}

	public void showSource() {
		System.out.println("==== 저그 자원 정보 ====");
		System.out.println("총 자원 : " + zeg);
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

}

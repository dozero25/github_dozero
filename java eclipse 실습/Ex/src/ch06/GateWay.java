package ch06;

public class GateWay {

	public static int zealotCount = 0;

	private int protoss;
	private int energy = 100;
	private int gateWayNum;
	private String name;

	private int hp;
	private int sheld;

	// 게이트웨이 hp
	public GateWay() {
		this.hp = 500;
		this.sheld = 400;
		this.name="게이트웨이"+(gateWayNum+1);
	}
	// 자원 추가
	public void productPro(int protoss) {
		this.protoss += protoss;
	}

	// 질럿 생산
	public Zealot createZealot() {
		System.out.println("자원이 소모됩니다.");
		this.protoss -= this.energy;
		System.out.println("프로토스 유닛이 생산되었습니다.");
		zealotCount++;
		return new Zealot("질럿" + zealotCount);
	}

	// 공격을 받습니다.
	public void beattack(int power) {
		if (this.sheld <= 0) {
			System.out.println(this.name + "의 쉴드가 파괴되었습니다.");
			if (this.hp <= 0) {
				System.out.println(this.name + "이 파괴되었습니다.");
			} else {
				this.hp -= power;
			}
		} else {
			this.sheld -= power;
		}
	}

	public void showinfo() {
		System.out.println("==== 게이트웨이 정보 ====");
		System.out.println("이름 : " + name);
		System.out.println("건물 쉴드 : " + sheld);
		System.out.println("건물 체력 : " + hp);
	}

	public void showSource() {
		System.out.println("==== 프로토스 자원 정보 ====");
		System.out.println("총 자원 : " + protoss);
	}

	public String getName() {
		return name;
	}

	public int getSheld() {
		return sheld;
	}

	public int getHp() {
		return hp;
	}

}

package ch06;

public class Zergling {
	private String name;
	private int power;
	private int hp;

	public Zergling(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 35;
	}

	// 상태창
	public void showinfo() {
		System.out.println("==== 상태창 ====");
		System.out.println("유닛 이름 : " + name);
		System.out.println("유닛 공격력 : " + power);
		System.out.println("유닛 쉴드 : " + power);
		System.out.println("유닛 hp : " + hp);
		System.out.println("==== ==== ====");
	}

	// 저글링이 마린을 공격합니다.
	public void attackMarine(Marine marine) {
		System.out.println(this.name + "이 "+" " + marine.getName() + "을 공격합니다.");
		marine.beattack(this.power);
	}

	// 저글링이 질럿을 공격합니다.
	public void attackZealot(Zealot zealot) {
		System.out.println(this.name + "이 "+" " + zealot.getName() + "을 공격합니다.");
		zealot.beattack(this.power);
	}

	// 게이트웨이를 공격합니다.
	public void attackGateWay(GateWay gateWay) {
		System.out.println(this.name + "이"+" " + gateWay.getName() + "을 공격합니다.");
		gateWay.beattack(this.power);
	}

	// 질럿이 배럭을 공격합니다.
	public void attackBarrack(Barrack barrack) {
		System.out.println(this.name + "이"+" " + barrack.getName() + "을 공격합니다.");
		barrack.beattack(this.power);
	}

	// 공격받습니다.
	public void beattack(int power) {
		if (this.hp <= 0) {
			System.out.println(this.name + "가 사망했습니다.");
		} else {
			this.hp -= power;
		}
	}

	// getter
	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getPower() {
		return power;
	}
}

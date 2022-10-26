package ch09;

public class Unit {
	// 상속일 때는 protected
	protected String name;
	protected int power;
	protected int hp;

	// 오버로딩, 다형성
	// 공격을 한다.
	public void attack(Unit unit) {
		System.out.println(this.name + "이 " + unit.name + "을 공격합니다.");
		unit.beAttacked(this.power);
	}

	// 공격을 받습니다.
	public void beAttacked(int power) {
		if (this.hp <= 0) {
			System.out.println(this.name + "유닛이 사망했습니다.");
		} else {
			this.hp -= power;
		}

	}

	public void showinfo() {
		System.out.println("=== 상태창 ===");
		System.out.println("유닛 이름 : " + name);
		System.out.println("유닛 HP : " + hp);

	}

}

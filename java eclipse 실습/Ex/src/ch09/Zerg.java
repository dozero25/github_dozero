package ch09;

public class Zerg extends Unit {

	public Zerg() {
		this.name = name;
		this.power = power;
		this.hp = hp;
	}

	public void zergling() {
		name = "저글링";
		power = 8;
		hp = 35;
	}

	public void hydraLisk(int evolution) {
		name = "히드라리스크";
		power = 10;
		hp = 80;

	}

	public void lucker(Zerg hydraLisk) {
		name = "럴커";
		power = 20;
		hp = 125;

	}

}

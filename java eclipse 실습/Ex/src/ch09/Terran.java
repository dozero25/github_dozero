package ch09;

public class Terran extends Unit {

	public Terran() {
		this.name = name;
		this.power = power;
		this.hp = hp;

	}

	public void marine() {
		name = "마린";
		power = 6;
		hp = 40;
	}

	public void medic() {
		name = "메딕";
		power = 0;
		hp = 60;
	}

	public void firebat() {
		name = "파이어뱃";
		power = 6;
		hp = 40;
	}

	public void ghost() {
		name = "고스트";
		power = 6;
		hp = 40;
	}

}

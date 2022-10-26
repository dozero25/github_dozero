package ch06;

public class Zealot {
	private String name;
	private int power;
	private int hp;
	private int sheld;

	public Zealot(String name) {
		this.name = name;
		this.power = 16;
		this.hp = 100;
		this.sheld = 60;}
	// 상태창
	public void showinfo() {
		System.out.println("==== 상태창 ====");
		System.out.println("유닛 이름 : " + name);
		System.out.println("유닛 공격력 : " + power);
		System.out.println("유닛 쉴드 : " + power);
		System.out.println("유닛 hp : " + hp);
		System.out.println("==== ==== ====");}
	// 질럿이 마린을 공격합니다.
	public void attackMarine(Marine marine) {
		System.out.println(this.name + "이 "+" "+ marine.getName() + "을 공격합니다.");
		marine.beattack(this.power);
	}
	// 질럿이 저글링을 공격합니다.
	public void attackZergling(Zergling zergling) {
		System.out.println(this.name + "이 "+" " + zergling.getName() + "을 공격합니다.");
		zergling.beattack(this.power);
	}
	// 질럿이 배럭을 공격합니다.
	public void attackBarrack(Barrack barrack) {
		System.out.println(this.name + "이"+" "+ barrack.getName()+"을 공격합니다.");
		barrack.beattack(this.power);
	}
	// 질럿이 해처리르 공격합니다.
	public void attackHatchery(Hatchery hatchery) {
		System.out.println(this.name+"이"+" "+ hatchery.getName()+"울 공격합니다.");
		hatchery.beattack(this.power);
	}
	// 공격을 받습니다.
	public void beattack(int power) {
		if (this.sheld <= 0) {
			System.out.println(this.name + "의 쉴드가 파괴되었습니다.");
			if (this.hp <= 0) {
				System.out.println(this.name + "이 사망했습니다.");} 
			else {this.hp -= power;}} 
		else {this.sheld -= power;}}
	// getter
	public String getName() {return name;}

	public int getHp() {return hp;}

	public int getSheld() {return sheld;}

	public int getPower() {return power;}

}

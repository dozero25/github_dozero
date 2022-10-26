package ch06;

public class Marine {
	private String name;
	private int power;
	private int hp;

	public Marine(String name) {
		this.name = name;
		this.power = 6;
		this.hp = 40;}

	// 상태창
	public void showinfo() {
		System.out.println("==== 상태창 ====");
		System.out.println("유닛 이름 : " + name);
		System.out.println("유닛 공격력 : " + power);
		System.out.println("유닛 쉴드 : " + power);
		System.out.println("유닛 hp : " + hp);
		System.out.println("==== ==== ====");}
	// 마린이 질럿을 공격합니다.
	public void attackZealot(Zealot zealot) {
		System.out.println(this.name + "이 "+" " + zealot.getName() + "을 공격합니다.");
		zealot.beattack(this.power);}
	// 마린이 저글링을 공격합니다.
	public void attackZergling(Zergling zergling) {
		System.out.println(this.name + "이 "+" " + zergling.getName() + "을 공격합니다.");
		zergling.beattack(this.power);}
	// 게이트웨이를 공격합니다.
	public void attackGateWay(GateWay gateWay) {
		System.out.println(this.name+"이"+" "+ gateWay.getName()+ "을 공격합니다.");
		gateWay.beattack(this.power);
	}
	//해처리를 공격합니다.
	public void attackHatchery(Hatchery hatchery) {
		System.out.println(this.name+"이"+" "+ hatchery.getName()+"울 공격합니다.");
		hatchery.beattack(this.power);
	}
	
	// 공격을 받습니다.
	public void beattack(int power) {
		if (this.hp <= 0) {System.out.println(this.name + "가 사망했습니다.");} 
		else {this.hp -= power;}}

	// getter
	public String getName() {return name;}

	public int getHp() {return hp;}

	public int getPower() {return power;}

}

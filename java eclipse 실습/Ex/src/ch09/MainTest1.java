package ch09;

public class MainTest1 {

	public static void main(String[] args) {

		Protoss zealot1 = new Protoss();

		Terran marine1 = new Terran();
		Terran medic1 = new Terran();

		Zerg zergling1 = new Zerg();
		Zerg hydralisky1 = new Zerg();

		zealot1.jealot();
		marine1.marine();
		zergling1.zergling();

		marine1.attack(zealot1);

		zealot1.attack(marine1); // 마린 공격
		marine1.showinfo();
//		medic1.hill(marine1); // 메딕 힐

		marine1.attack(zergling1);

		zealot1.showinfo();
		marine1.showinfo();
		zergling1.showinfo();

	}

}

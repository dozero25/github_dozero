package ch06;

public class Fight {

	public static void main(String[] args) {

		GateWay gateway1 = new GateWay();
		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("질럿2");

//		gateway1.productPro(2000);
//		gateway1.createZealot();
//		gateway1.createZealot();
//		gateway1.showSource();
//		zealot1.showinfo();
//		zealot2.showinfo();

		Barrack barrack1 = new Barrack();
		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("마린2");

//		barrack1.productTer(2000);
//		barrack1.createMarine();
//		barrack1.createMarine();
//		barrack1.showSource();
//		marine1.showinfo();
//		marine2.showinfo();

		Hatchery hatchery1 = new Hatchery();
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");

//		hatchery1.productZeg(2000);
//		hatchery1.createZergling();
//		hatchery1.createZergling();
//		hatchery1.showSource();
//		zergling1.showinfo();
//		zergling2.showinfo();

//		zealot1.attackMarine(marine1);
//		zealot2.attackMarine(marine2);
//
//		marine1.attackZealot(zealot1);
//		marine2.attackZealot(zealot2);
//
//		zergling1.attackZealot(zealot1);
//		zergling2.attackZealot(zealot2);
//
//		zealot1.showinfo();
//		zealot2.showinfo();
//		marine1.showinfo();
//		marine2.showinfo();
//		zergling1.showinfo();
//		zergling2.showinfo();
		
		zealot1.attackBarrack(barrack1);
		zealot1.attackBarrack(barrack1);
		zealot1.attackBarrack(barrack1);
		zealot2.attackHatchery(hatchery1);
		zealot2.attackHatchery(hatchery1);
		zealot2.attackHatchery(hatchery1);
		
		marine1.attackHatchery(hatchery1);
		marine1.attackHatchery(hatchery1);
		marine2.attackGateWay(gateway1);
		marine2.attackGateWay(gateway1);
		
		zergling1.attackGateWay(gateway1);
		zergling1.attackGateWay(gateway1);
		zergling2.attackGateWay(gateway1);
		zergling2.attackGateWay(gateway1);
		zergling2.attackGateWay(gateway1);
		
		gateway1.showinfo();
		barrack1.showinfo();
		hatchery1.showinfo();
	}

}

package ch09;

public class Protoss extends Unit {

	protected int sheld;
	
	public Protoss() {
		this.name = name;
		this.power = power;
		this.hp = hp;
		this.sheld = sheld;
	}
	
	public void jealot() {
		name = "질럿";
		power = 8;
		hp = 100;
		sheld = 60;
	}
	
	public void dragoon() {
		name = "드라군";
		power = 20;
		hp = 100;
		sheld = 80;
	}
	
	public void darkTemplar() {
		name="다크템플러";
		power = 40;
		hp = 80;
		sheld =40;
	}
	
	public void highTemplar() {
		name ="하이템플러";
		power = 40;
		hp=40;
		sheld =40;
		System.out.println("스킬 사용!! 사이오닉 폭풍!!");
		
	}
	
	
	public void attack(Protoss protoss) {
		System.out.println(this.name + "이 " + protoss.name + "을 공격합니다.");
		protoss.beAttacked(this.power);
	}
	
	public void beAttacked(int power) {
		if (this.sheld <= 0) {
			System.out.println(this.name + "쉴드가 파괴되었습니다.");
		}else {
			this.sheld -= power;
		}if(this.hp <=0) {
			System.out.println(this.name + "이 사망했습니다.");
		}else {
			this.hp -= power;
		}

	}

	public void showinfo() {
		System.out.println("=== 상태창 ===");
		System.out.println("유닛 이름 : " + name);
		System.out.println("유닛 HP : " + hp);
		System.out.println("유닛 쉴드 : " + sheld);
	}

}

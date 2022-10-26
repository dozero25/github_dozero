package ch04;

public class Rpg {

	private String job;
	private int Level;
	private int Str;
	private int Dex;
	private int Luc;
	private int Int;

	public Rpg(String j,int le, int s, int d, int l, int i) {
		this.job = j;
		this.Level = le;
		this.Str = s;
		this.Dex = d;
		this.Luc = l;
		this.Int = i;
		
	}
	
	public void LevelUp(int le, int s, int d, int l, int i) {
		Level+=le;
		Str+=s;
		Dex+=d;
		Luc+=l;
		Int+=i;
	}


	public void ablity() {
		System.out.println("직업 : " + job);
		System.out.println("Level : " + Level);
		System.out.println("힘 : " + Str);
		System.out.println("민첩 : " + Dex);
		System.out.println("행운 : " + Luc);
		System.out.println("지력 : " + Int);

	}

}

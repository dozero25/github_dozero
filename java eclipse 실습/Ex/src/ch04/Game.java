package ch04;

public class Game {

	public static void main(String[] args) {
		Rpg warrior1 = new Rpg("전사1", 1,20,10,5,5);
		Rpg warrior2 = new Rpg("전사2", 1,20,10,5,5);
		
		Rpg archer1 = new Rpg("궁수1", 1,8,15,7,5);
		Rpg archer2 = new Rpg("궁수2", 1,8,15,7,5);
		
		Rpg assassin1 = new Rpg("도적1", 1,5,10,20,5);
		Rpg assassin2 = new Rpg("도적2", 1,5,10,20,5);
		
		Rpg wizard1 = new Rpg("마법사1", 1,5,5,10,20);
		Rpg wizard2 = new Rpg("마법사2", 1,5,5,10,20);
		
		warrior1.LevelUp(15,60,10,3,2);
		warrior2.LevelUp(20,70,20,5,5);
		
		archer1.LevelUp(22, 15, 75, 15, 5);
		archer2.LevelUp(8, 5, 25, 5, 0);
		
		assassin1.LevelUp(50, 20, 60, 150, 20);
		assassin2.LevelUp(37, 5, 55, 120, 5);
		
		wizard1.LevelUp(70, 0, 10, 40, 300);
		wizard2.LevelUp(4, 0, 0,0, 20);
		
		
		warrior1.ablity();
		System.out.println("------------------");
		warrior2.ablity();
		System.out.println("------------------");
		archer1.ablity();
		System.out.println("------------------");
		archer2.ablity();
		System.out.println("------------------");
		assassin1.ablity();
		System.out.println("------------------");
		assassin2.ablity();
		System.out.println("------------------");
		wizard1.ablity();
		System.out.println("------------------");
		wizard2.ablity();
	
	}

}

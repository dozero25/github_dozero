package J14_참조자료형캐스팅.동물;

public class AnimalMain {
    public static void main(String[] args) {
        Human human = new Human();
        Tiger tiger = new Tiger();
        Animal animal1 = null;
        Animal animal2 = null;
        System.out.println("[캐스팅 전]");
        human.move();
        human.readBooks();
        tiger.move();
        tiger.hunting();
        System.out.println("[캐스팅]");
        System.out.println("<업캐스팅>"); // 자식요소만 가지고 있는 메서드나 변수를 사용하지 못하게 된다.
        animal1 = human;
        animal2 = tiger;
        animal1.move();
        animal2.move();
        System.out.println("--------------");
        System.out.println("<다운캐스팅>");
        Human d_human = (Human) animal1;
        Tiger d_tiger = (Tiger) animal2;
        d_human.readBooks();
        d_tiger.hunting();
        System.out.println("--------------");
        System.out.println();

        Animal a = null;
        Human h = (Human) a;
//        Human h = (Human) a; // 다운 캐스팅 => 업캐스팅이 한 번 이상 있어야지만 사용 가능 => 메모리 기억
//        h.readBooks();








    }
}

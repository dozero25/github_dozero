package J18_제네릭.와일드카드;

public class Human extends Animal{ // 상속클래스
    @Override
    public void move() {

        System.out.println("두 발로 걷습니다.");
    }

    public void readBooks() {

        System.out.println("사람이 책을 읽습니다.");
    }
}

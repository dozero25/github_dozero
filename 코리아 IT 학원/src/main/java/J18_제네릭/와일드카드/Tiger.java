package J18_제네릭.와일드카드;

public class Tiger extends Animal{// 상속클래스
    @Override
    public void move() {
        System.out.println("네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("사냥을 시작합니다.");
    }
}

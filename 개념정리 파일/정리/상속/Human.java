package 정리.상속;

public class Human extends Animal{
    public Human(String name) {
        super(name);
        System.out.println("Human 생성");
    }

    @Override
    public void move() {
        super.move();
        System.out.println(getName()+"이(가) 움직입니다");
    }
    public void hello(){
        System.out.println(getName()+"이(가) 반갑게 인사합니다.");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}

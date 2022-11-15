package 정리.상속;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
        System.out.println("Tiger 생성");
    }
    @Override
    public void move() {
        super.move();
        System.out.println(getName()+"가(이) 산책을 합니다.");
    }
    public void eat(){
        System.out.println(getName()+"가(이) 간식을 먹습니다.");
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

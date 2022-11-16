package J12_상속;

public class Tiger extends Animal{
    public Tiger(String name) {
        super(name);
        System.out.println("Tiger 생성");
    }
    /*
    메서드 오버라이딩(오버라이드)
    [ 재정의 ]
    상위(Animal) 객체의 메소드를 하위(Tiger) 객체에서 다시 정의하는 행위
     */
//    @Override // @(어노테이션) : 해당 메소드가 상위 객체로부터 재정의된 메소드입니다를 표기하는 것
//    public void move(){
//        System.out.println("네 발로 뜁니다."); }
//    @Override
//    public void move() { // ctrl + space -> animal 클래스 찾기
//        super.move();}
//    @Override
//    public void move() { // ctrl + O -> override 선택
//        super.move();}
    @Override
    public void move() {
        super.move();
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

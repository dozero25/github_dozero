package J12_상속;

public class Human extends Animal{

    public Human(String name){
        super(name); // super : 부모의 주소를 가리킨다. super. 하면 부모가 가진 객체에 접근한다.
        // 부모 생성자가 항상 기본적으로 생략되어있다.
        System.out.println("Human 생성");
        // Human이 존재해야 나올 수 있는데 부모의 생성이 거치지 않았는데 실행을 할 수 없다.
        // 그래서 super 가 제일 위에 와야한다.
    }
    /*
    메서드 오버라이딩(오버라이드)
    [ 재정의 ]
    상위(Animal) 객체의 메소드를 하위(Human) 객체에서 다시 정의하는 행위
     */

    @Override // @(어노테이션) : 해당 메소드가 상위 객체로부터 재정의된 메소드입니다를 표기하는 것
    public void move(){
        super.move();
        // move(); : 자기 자신 호출(this), move가 무한적으로 된다.(재기함수)
//         클래스 두개가 합쳐져서 메서드 사용 가능
//         상속을 받더라도 private은 무조건 자기 class 내에서만 사용가능
        System.out.println("두 발로 걷습니다.");
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

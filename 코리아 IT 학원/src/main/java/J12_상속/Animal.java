package J12_상속;

public class Animal {

    private String name;
    
    public Animal(String name){
        System.out.println("Animal 생성");
        this.name = name;
    }

    public void move(){ // 공통으로 사용되는 메서드를 상속
        System.out.println("움직입니다.");
    }
    // getter, setter를 상속시켜준다.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

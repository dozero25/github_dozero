package J16_Bean;

public class Person {
    private final String name; // 상수가 설정되면 초기화가 무조건 해야한다.
    private int age;           // 멤버 변수 final을 선언하면 필수값이 된다.

//    public Person(){}  <- NoArgsConstructor는 RequiredArgsConstructor와 함께 쓸 수 없다.

    public Person(String name) { // <-RequiredArgsConstructor
        this.name = name;
    }

    public Person(String name, int age) { // <- AllArgsConstructor
        this.name = name;
        this.age = age;
    }
}

package J13_추상화.인터페이스;
/*
Interface(인터페이스)
1. 기본적으로 모든 메소드가 추상메소드로 정의된다.
2. 일반 메소드를 정의하기 위해서는 default 키워드를 사용하여야 한다.
3. 생성자 정의는 불가능하다.
4. 일반 변수 선언 불가능하다.
5. 상수는 선언할 수 있다.(접근지정자 public 사용)
ex)
public default void pop(){}  default를 선언하면 일반 메소드 정의 가능
private String name;  [변수 선언]도 불가능하다.
 */
public interface Press { // 여기 안에서 눌렀다가 때져야한다.
    public final String NAME = "button"; // [상수 선언. 초기화], final : 수정할 수 없다. 항상 public

    public void onPressed(); // interface는 abstract가 생략이 된다.








}

package 정리;

/*
    메서드 오버로딩(method overloading)
    : 같은 이름의 메소드를 중복하여 정의하는 것을 의미한다.
    : 원래 한 클래스에 같은 이름의 메소드를 둘 이상 가질 수 없지만 매개변수의 개수나 타입을 다르게 하면, 하나의 이름처럼 저장 가능
    : 서로 다른 매개변수를 갖는 여러 메소드를 같은 이름으로 정의하는 것이라고 할 수 있다.
    : 다형성을 구현하는 방법 중 하나

    조건
    1. 메소드의 이름이 같아야한다.
    2. 매개변수의 개수 또는 타입이 달라야한다.
    
    메소드 오버라이딩(Method overriding)
    : 부모 클래스로부터 상속받은 자식 클래스에서 재정의하는 거
    
    조건 : 오버라이딩하고자 하는 메소드의 이름. 매개변수, 리턴값이 모두 같아야한다.
    나중에 제대로 알아보자
*/

public class 메서드2 {
    // Overloading

    public static void add(){
        System.out.println("add()");
    }
    public static void add(int a){
        System.out.println("add()");
    }
    public static void add(String a){
        System.out.println("add()");
    }
    public static void add(int a, int b){
        System.out.println("add()");
    }
    public static void add(int a, String b){
        System.out.println("add()");
    }
    public static void add(String b, int a){
        System.out.println("add()");
    }

    public static void main(String[] args) {
        add();
        add(1);
        add("1");
        add(1, 2);
        add(1,"1");
        add("1", 1);

    }


}

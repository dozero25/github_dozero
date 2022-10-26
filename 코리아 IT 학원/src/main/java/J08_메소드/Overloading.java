package J08_메소드;
/*
    메소드 오버로딩
    매개변수의 형태가 다르면 동일한 메소드명을 가지고 정의할 수 있다.
 */
public class Overloading { // 똑같은 methods 명은 쓸 수 없다.
    public static void add(){
        System.out.println("add()");
    }
    public static void add(int a){
        System.out.println("add(int a)"); // int a의 매개변수를 가지는 변수
    }
    public static void add(String s){
        System.out.println("add(String s)");
    }
    public static void add(int a, int b){
        System.out.println("add(int a, int b)");
    }
    public static void add(int a, String b){
        System.out.println("add(int a, String b)");
    }
    public static void add(String b, int a){
        System.out.println("add(String b, int a)");
    }
    public static void main(String[] args) {
        add();
        add(10); // 똑같은 변수명을 가지지만 매개변수를 가지면 다른 메서드가 된다. (overload)
        add("10");
        add(10,10);
        add(10,"10");
        add("10",10);
    }
}

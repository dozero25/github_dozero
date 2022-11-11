package J21_익명클래스;

public class Main {
    public static void main(String[] args) {

        Interface1 interface1 = new Class1();
        Interface1 interface2 = new Class1();
        Interface1 interface3 = new Class1();
        Interface1 interface4 = new Class1();
        Interface1 interface5 = new Class1();
        // Class1이라는 class로 계속 만들어 낼 수 있다.

        interface1.methodName();
        interface2.methodName();
        interface3.methodName();
        interface4.methodName();
        interface5.methodName();
        
        Interface1 interface6 = new Interface1(){ // 익명클래스
        // 임시 정의하고 생성했다. -> 주소만 들어있는 상태
        // 한번만 사용할 거면 익명 클래스로 만들고, 여러 번 사용할 경우 클래스로 만들어서 사용해라
            @Override
            public void methodName() {
                System.out.println("익명클래스로 정의한 메소드");
            }

            @Override
            public void methodName2(){
                System.out.println("익명클래스로 재정의한 메소드");
            }
        }; // 익명 클래스 정의
        interface6.methodName();
        interface6.methodName2();
    }
}

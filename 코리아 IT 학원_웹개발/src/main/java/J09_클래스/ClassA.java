package J09_클래스;

public class ClassA {// 틀
    int num;
    String name;
    double score;

    //생성자
    // 모든 클래스들은 생성자가 생략되어 있다.
    // 생성자는 반환자료형이 없다.
    // 대문자로 시작하고, 생성자는 클래스랑 이름이 일치해야한다.
    // 생성자는 항상 주소가 반환된다. 주소값은 생략되어있다.
    // 생성자도 메소드 처럼 사용할 수 있다.
    // overloading, 실행문 처럼 사용 가능
    // 생성자는 호출이 우선이다.
    // 다른 생성자로 오버로딩 되면 기본 생성자는 비활성화 된다.

    ClassA(){
        // 매개변수 없는 생성자
    }
    ClassA(int a){
        System.out.println("a : "+a);
        System.out.println("ClassA를 생성합니다.");
    }
    void callName(){
        System.out.println(name + "을(를) 부릅니다.");
    }

}

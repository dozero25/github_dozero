package 정리;

/*
        메서드란? 함수이다.
        함수란 : 일련의 동작을 묶어 정의한 것
        특징 : 입력과 출력을 가질 수 있다.(필수 아님)

        그러면 왜 메서드라고 부르는가?
        : 클래스 안에 함수를 정의하면 메서드라고 부른다. 클래스 밖에서 사용하지 못한다.
        함수를 실행하는 것은 우리는 호출(call)이라고 칭한다.

        목적
        : 중복되는 코드의 반복적인 프로그래밍을 피할 수 있기 때문
        : 프로그램에 문제가 발생하거나 기능의 변경이 필요할때 손쉽게 유지 보수 가능

        retrun
        : 실행 중인 메서드를 종료하고 호출한 곳으로 되돌아가도록 한다.
        : 반환 타입이 void 일결우 : return 생략 가능, 컴파일러 자동 추가
        : 반환 타입이 void 아닐경우, return 반드시 필요

        static
        : '고정된'이란 의미를 가짐.
        : static 변수와 static 메소드를 만들 수 있는데 다른 말로 정적 변수와 정적 메소드라 하며, 합쳐 정적 멤버라고 한다.
        : 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버이다.
        : heap 영역이 아닌 static 영역에 할당 된다.
        : static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있는 장점이 있다.
        : 하지만 garbage collector의 관리 영역 밖에 존재하기에 프로그램 종료 시까지 메로리가 할당된 채로 존재하게 된다.
        : 남발할 경우 시스템 성능에 악영향을 줄 수 있다.
    */
public class 메서드1 {

    public static void call(){
        System.out.println("x | x");
    }

    public static void call2(String name){
        System.out.println("o | x");

    }
    public static String call3(){
        System.out.println("x | o");
        String name = "윤도영";

        return name;
    }// void 없으면 return 필요
    public static String call4(int year, int month, int day){
        System.out.println("o | o");
        return year + "-" + month + "-" + day;
    }

    public static void main(String[] args) {
        call();
        call2("윤도영");
        call3();
        call4(2022, 11, 6);
    }
}

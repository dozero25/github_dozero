package 정리.람다;

/*
    람다 함수
    : 프로그래밍 언어에서 사용되는 개념으로 익명 함수를 지칭하는 용어
    : 람다 대수는 이름을 가질 필요가 없다.
    : 두 개 이상의 입력이 있는 함수는 최종적으로 1개의 입력만 받는 람다 대수로 단순화 될 수 있다.

    익명 함수
    : 이름이 없는 함수이다.
    : 일반적으로 다른 객체들에 적용 가능한 연산을 모두 지원하는 개체를 가르킨다.
    : 함수를 값으로 사용할 수 있으며 파라메터로 전달 및 변수에 대입하기와 같은 연산들이 가능

    장점
    코드의 간결성 : 불필요한 반복문의 삭제가 가능하며 복잡한 식을 단순하게 표현할 수 있다.
    지연연산 수행 : 지연연산을 수행 함으로 불필요한 연산을 최소화 할 수 있다.
    병렬처리 가능 - 멀티쓰레드를 활용하여 병렬처리를 사용할 수 있다.

    단점
    : 식의 호출이 까다롭다.
    : 람다 steam 사용시 단순 for문 혹은 while문 사용 시 성능이 떨어진다.
    : 불필요하게 사용되면 가독성이 떨어질 수 있다.

*/

public class OperationMain {
    public static void main(String[] args) {

        int a = 10, b = 20;

        Operation add = new Operation() {
            @Override
            public int calc(int x, int y) {
                return x+y;
            }
        };

        Operation add2 = (x, y) -> x+y;

        Operation sub = (x, y) -> x-y;

        Operation mulit = (x, y) -> x*y;

        Operation div = (x, y) -> x/y;

        System.out.println(add2.resultToString(add2.calc(a, b)));
        System.out.println(sub.resultToString(sub.calc(a, b)));
        System.out.println(mulit.resultToString(mulit.calc(a, b)));
        System.out.println(div.resultToString(div.calc(a, b)));
    }
}

package 정리;

public class 연산자 {
    public static void main(String[] args) {
        /*
            연산에 사용되는 표시나 기호

            산술 > 관계(비교) > 논리 > 대입 순서로 진행, 대입이 제일 마지막
            대입연산자는 연산의 진행방향이 오른쪽에서 왼쪽
        */
        int num1 =10;
        // 증감연산자
        System.out.println(++num1); // 선증가 : +1이 앞에 붙는다. 바로 증가한다.
        System.out.println(num1++); // 후증가 : +1이 뒤에 붙는다. 다음 호출할 때 증가시킨다.

        /*
            논리연산자
            ||(or) : 피연산자 중 한쪽만 true면 true
            &&(and) : 피연산자 모두 true여야 true
            !(not) : true는 false, false는 true
        */
        boolean flag1 = true;
        boolean flag2 = false;

        boolean result = flag1 || flag2; // true
        boolean result2 = flag1 && flag2; // false
        boolean result3 = flag1 != true; // fasle

        /*
            대입연산자
            += : 더한값 저장,   /= : 나눈 값 저장
            -= : 뺀 값 저장,    %= : 나눈 나머지 값 저장
            *= : 곱한값 저장
        */
        num1 += 2; // 12
        num1 -= 2; // 10
        num1 *= 2; // 20
        num1 /= 2; // 10
        num1 %= 2; // 0

        /*
            조건연산자(삼항연산자)
            : 조건식, 식1, 식2 모두 세 개의 피여산자를 필요로 하는 삼항연산자이며, 조건연산자는 하나이다.
         */
       boolean tf = num1 > 5 ? true : false; // true
       boolean tf2 = num1 < 5 ? true : false; //false






    }
}

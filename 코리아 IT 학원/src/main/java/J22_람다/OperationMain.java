package J22_람다;

public class OperationMain {
    public static void main(String[] args) {
        int a = 10, b = 20;

        Operation add = new Operation(){
            @Override
            public int calc(int x, int y) {
                return x+y;
            }

        };

        // 람다식
        // 여기에 익명클래스가 들어왔다, 매개변수가 x, y에 들어왔다.
        // public int calc 가 -> 로 바뀌게 되었다.
        // return 부분이 x + y로 바뀌게 되었다.
        // 추상 메소드(구현 메소드)는 딱 하나만 정의한다. 두개 이상은 안된다. default는 있어도 된다.
        //Operation add2 = (int x, int y) -> {
        // return x + y; }

        Operation add2 = (int x, int y) -> { return x + y;};

        Operation sub = (x, y) -> x - y; // 이런식으로 코드를 줄일 수 있다.

        Operation mulit = (x, y) -> x * y;

        Operation div = (x, y) -> x / y;

        System.out.println(sub.resultToString(sub.calc(b, a)));

        System.out.println(mulit.resultToString(mulit.calc(a, b)));

        System.out.println(div.resultToString(div.calc(b, a)));

        int addResult1 = add.calc(a, b); // 위에 익명 클래스 에서 들어왔다
        System.out.println(a+ " + "+ b + " = "+addResult1);

        int addResult2 = add.calc(a, b);
        System.out.println(a+ " + "+ b + " = "+addResult2);

    }
}

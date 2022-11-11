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
        Operation add2 = (x, y) -> x + y;
        // 람다식
        // 여기에 익명클래스가 들어왔다, 매개변수가 x, y에 들어왔다.
        // public int calc 가 -> 로 바뀌게 되었다.
        // return 부분이 x + y로 바뀌게 되었다.
        // 추상 메소드(구현 메소드)는 딱 하나만 있어야 한다. 두개 이상은 안된다.
        //Operation add2 = (int x, int y) -> {
        // return x + y; }

        int addResult1 = add.calc(a, b); // 위에 익명 클래스 에서 들어왔다
        System.out.println(a+ " + "+ b + " = "+addResult1);

        
        int addResult2 = add.calc(a, b);
        System.out.println(a+ " + "+ b + " = "+addResult2);

    }
}

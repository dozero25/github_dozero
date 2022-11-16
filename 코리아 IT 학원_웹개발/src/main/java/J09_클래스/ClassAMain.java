package J09_클래스;

public class ClassAMain {
    public static void main(String[] args) {

        System.out.println(new ClassA());  // 새로운  classA를 생성해라
        System.out.println(new ClassA());

        //자료형 . 변수명 = new ClassA();
        ClassA a1 = new ClassA();

        ClassA a2 = new ClassA();
        a1.name = "윤도영";
        a1.num = 25;
        a1.score = 100;

        a2.name = "윤도일";
        a2.num = 25;
        a2.score = 100;

        System.out.println(a1.name);
        System.out.println(a1.num);
        System.out.println(a1.score);
        System.out.println("==========");
        System.out.println(a2.name);
        System.out.println(a2.num);
        System.out.println(a2.score);

//        System.out.println(a1.callName());  돌려받는 void가 없어서 출력을 못한다.
        a1.callName();
        a2.callName();



    }
}

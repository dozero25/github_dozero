package J03_형변환;

public class Conversion {
    public static void main(String[] args) {
        // upcasting(업캐스팅)
        char cast1 = 'a';
        System.out.println((int) cast1); // cast1 이라는 변수를 int 자료형으로 바꿔라

        int cast2 = cast1; // 묵시적형변환
        System.out.println(cast2); // cast2에는 97이 들어가게 된다.

        //downcasting(다운캐스팅)
        int cast3 = 98;
        char cast4 = (char)cast3; // 명시적형변환
        System.out.println(cast4);

        double cast5 = 3.14;
        int cast6 = (int)cast5; // 다운 캐스팅
        System.out.println(cast6);
        double cast7 = cast6; // 업캐스팅
        System.out.println(cast7);



    }
}

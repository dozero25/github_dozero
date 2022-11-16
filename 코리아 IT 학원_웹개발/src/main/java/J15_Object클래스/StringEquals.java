package J15_Object클래스;

public class StringEquals {
    public static void main(String[] args) {

        int i = 10; // 리터럴 상수 : 어딘가에 이미 선언되어진 상수
        
        String name1 = "윤도영";
        String name2 = "윤도영";
        String name3 = new String("윤도영"); // new : 메모리를 새로 할당 받는 것(주소를 받는다).
        String name4 = new String("윤도영"); // 그래서 name3,4에 주소 값이 들어가게 되면서 fasle가 나오게 된다.

        System.out.println(name1 + ", "+ name2+", "+ name3);

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name3 == name4);
        System.out.println("-------------------");
        // 안에 들어 있는 리터럴 값들을 비교해주는 것이 equals 사용
        System.out.println(name1.equals(name3)); // name1과 name3의 값의 내용을 비교해주는 것

    }
}

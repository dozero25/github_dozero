package J15_Object클래스;

public class TeacherEquals {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김준일", "코리아아이티");
        J15_Object클래스.equals.Teacher teacher2 // import 한거랑 똑같다.
                = new J15_Object클래스.equals.Teacher("김준일", "코리아아이티");

        // 둘이 자료형이 다르기때문에 비교할 수 없다.
//        System.out.println(teacher1 == teacher2);
        System.out.println(teacher1.equals(teacher2)); // 두개의 값이 같아도 다른 패키지 이기 때문에 false가 나온다.
        System.out.println(teacher1.hashCode() == teacher2.hashCode()); // 값이 같아 true 가 나오게 된다.
        // hash가 주소를 만들어 주면서 hash안에 name, schoolName의 값만 같으면 true가 나오게 된다.
        // 값 비교 하는 방법 ==, equals, hashcode
    }
}

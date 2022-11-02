package J15_Object클래스;

public class ToString {
    public static void main(String[] args) {

        ObjectTest objectTest = new ObjectTest("윤도영", "장유");

        System.out.println(objectTest);
        System.out.println(objectTest.toString());

        String str = objectTest.toString(); // 객체에 대입하기 위해
        System.out.println(str);
        System.out.println(objectTest.showInfo());

        Teacher teacher1 = new Teacher("김준일", "코리아아이티");
        Teacher teacher2 = new Teacher("김준이", "부산교육대학원");

        System.out.println(teacher1);
        System.out.println(teacher2);
    }
}

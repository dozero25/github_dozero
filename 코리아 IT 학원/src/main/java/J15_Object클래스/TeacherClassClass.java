package J15_Object클래스;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class TeacherClassClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김준일", "코리아아이티");
        Teacher teacher2 = new Teacher("김준일", "코리아아이티");

        Class t_class = teacher1.getClass(); // 해당 클래스의 모든 정보를 다 가지고 온다.

        System.out.println(t_class.getSimpleName());
        System.out.println(t_class.getName());
        System.out.println("----------");
        Field[] fields = t_class.getDeclaredFields();
        for(int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
            System.out.println(fields[i].getType().getSimpleName());
        }
        System.out.println("----------");
       Method[] meothods =  t_class.getDeclaredMethods();
        for(int i = 0; i < meothods.length; i++) {
            System.out.println(meothods[i].getName());
            System.out.println(meothods[i].getReturnType());
        }
        System.out.println("----------");
        System.out.println(teacher1.getClass() == teacher2.getClass());
        System.out.println(teacher1 instanceof Teacher); // 아래와 같은 내용, 앞으로 아래 내용으로 비교
        System.out.println(teacher1.getClass() == Teacher.class); // instanceof를 사용 안해도 된다.
        System.out.println(teacher2.getClass() == Teacher.class);
    }



}

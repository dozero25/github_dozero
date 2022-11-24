package 정리.Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    /*
        Object 클래스
        : 모든 자바 클래스의 최고 조상 클래스

        toString()
        : 해당 인스턴스에 대한 정보를 문자열로 반환합니다.
        : 클래스 이름과 함께 구분자로 '@'가 사용되며, 그뒤로 16진수 해시코드(hash code)가 추가됩니다.

        equals()
        : 해당 인스턴스를 매개변수로 전달받는 참조 변수와 비교하여, 그 결과를 반환합니다.
        : 이때 참조 변수가 가리키는 값을 비교하므로, 같으면 true 다르면 false를 리턴한다.

        hashcode()
        : 객체를 식별할 하나의 정수값.
        : 객체의 메모리 번지를 이용해서 해시코드를 만들어서 리턴한다.
     */

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("윤도영", "코리아IT아카데미");

        Class t_class = teacher1.getClass(); // 해당 클래스의 모든 정보를 다 가져 온다.

        System.out.println(t_class.getSimpleName());
        System.out.println(t_class.getName());
        System.out.println();
        Field[] fields = t_class.getDeclaredFields();
        for(int i = 0; i < fields.length; i++){
            System.out.println(fields[i].getName());
            System.out.println(fields[i].getType().getSimpleName());
        }
        System.out.println();
        Method[] methods = t_class.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
            System.out.println(methods[i].getReturnType());
        }
        System.out.println();
        System.out.println(teacher1 instanceof Teacher);




    }
}

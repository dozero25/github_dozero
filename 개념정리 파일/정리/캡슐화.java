package 정리;

import org.codehaus.groovy.transform.SourceURIASTTransformation;

public class 캡슐화 {
    /*
            캡슐화
            : 객체지향 언어의 특징 중 하나이다.
            : 클래스 안에 멤버변수와 멤버함수를 담아 캡슐처럼 보호하고 원하는 만큼만 오픈하여 사용할 수 있도록 한다.
            : 객체의 내부 구조 및 데이터를 캡슐처럼 감싸 외부에서 직접 볼 수 없게 은닉하여 보호하는 것
            : 하지만 객체들끼리의 상호작용을 위해서 일정부분이 외부에 공개되어야 데이터를 주고 받을 수 있다.
            : 이를 위해서 클래스와 멤버변수(필드), 멤버함수(메소드)는 외부에서 접근가는한 범위를 지정할 수 있는 접근 제어자와 함께 사용

            getter
            : 외부에서 변수의 데이터를 읽어올 때 사용되는 메소드

            setter
            : 외부에서 변수에 데이터를 쓰고자 할 때 사용되는 메소드

        */

    // ex1)

    public void registerStudent(){ // 밖으로 보여주야 하므로 public을 사용
        System.out.println("학생 정보 등록 메뉴");
        System.out.println("먼저 중복된 학생 정보인지 확인합니다.");
        doubleCheckStudent("윤도영");

        System.out.println("학생 정보를 등록합니다.");
    }
    private boolean doubleCheckStudent(String studentName) {
        // 중복된 정보 판결 기능은 내부에서만 사용하므로 private 사용
        // 이 기능은 이 클래스 안에서만 사용 가능하다.
        if(studentName.equals("윤도영")){
            return false;
        }
        return true;

    }

    // ex2)

    private int age; // private 이기 때문에 보호받고 있음

    // getter
    public int getAge() {
        return age;
    }
    // setter
    public void setAge(int age) {
        if(age >= 0 ){
            this.age = age;
        }
    }

    public static void main(String[] args) {
        캡슐화 p1 = new 캡슐화();

        p1.setAge(20);
        System.out.println(p1.getAge() + "살 입니다.");
    }
    // 실행 결과 : 20살 입니다.
}

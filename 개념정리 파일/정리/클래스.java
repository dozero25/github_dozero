package 정리;
/*
    클래스(class)
    : 객체를 정의하는 틀 또는 설계도와 같은 의미
    : 여러 객체를 생성하여 사용하게 된다.
    : 객체의 상태를 나타내는 필드와 객체의 행동을 나타내는 메소드로 구성된다.
    : 필드란 클래스에 포함된 변수를 의미한다.
    : 메소드란 어떠한 특정 작업을 수행하기 위한 명령문의 잡합이라 할 수 있다.

    인스턴스(instance)
    : 클래스를 사용하기 위해서는 우선 해당 클래스 타입의 객체(object)를 선언해야한다.
    : 클래스로부터 객체를 선언하는 과정을 클래스의 인스턴스 화 라고 한다.
    : 선언된 해당 클래스 타입의 객체를 인스턴스라고 한다.
    : 인스턴스란 메모리에 할당된 객체를 의미한다.
    : 클래스로부터 여러 개의 인스턴스를 생성할 수 있다.
    : 이렇게 생성된 인스턴스는 독립된 메모리 공간에 저장된 자신만의 필드를 가질 수 있다.
    : 하지만 해당 클래스의 모든 메서드는 해당 클래스에서 생성된 모든 인스턴스가 공유하게 된다.

    생성자
    : 모든 클래스들은 생성자가 생략되어 있다.
    : 생성자는 반환자료형이 없다.
    : 대문자로 시작하고, 생성자는 클래스랑 이름이 일치해야 한다.
    : 생성자는 항상 주소가 반환된다. 주소값은 생략되어 있다.
    : 생성자도 메서드처럼 사용할 수 있다.
    : overloading, 실행문처럼 사용 가능
    : 생성자는 호출이 우선이다.
    : 다른 생성자로 오버로딩 되면 기본 생서자는 비활성화된다.
*/


public class 클래스 {
    // 멤버변수
    private String schoolName;
    private int studentCode;
    private int studentYear;
    private String name;

    // increaseStudentYear : 호출시에 현재 학년을 1학년 증가(최대 5학년)
    // showStudentInfo() : 학생정보 출력

    public void increaseStudentYear(){
        studentYear++;
        if(studentYear > 5){
            System.out.println("더 이상 학년을 증가시킬 수 없습니다.");
            studentYear--;
            return;
        }
        showStudentInfo();
    }
    public void increaseStudentYear(int year){
        studentYear += year;
        if(studentYear > 5){
            System.out.println(year + "학년을 더하면 "+studentYear + "학년을 넘어섭니다.");
            studentYear -= year;
            return;
        }
        showStudentInfo();
    }

    public void showStudentInfo(){
        System.out.println("학교 : "+schoolName);
        System.out.println("학번 : "+studentCode);
        System.out.println("학년 : "+studentYear);
        System.out.println("이름 : "+name);
        System.out.println();
    }
}

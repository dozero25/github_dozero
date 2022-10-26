package J09_클래스;
public class Student {
//    properties(속성) - (멤버)변수
    String schoolName;
    int studentCode;
    int studentYear;
    String name;
    //Function(기능) - (멤버)메소드
    //increaseStudentYear() - 호출시에 현재 학년을 1학년 증가(최대 5학년)
    // showStudentinfo() - 학생정보 출력
    Student(){
    }
    void increaseStudentYear(){ // void 에서 retrun 사용 가능
        studentYear++;
        if(studentYear > 5){
            System.out.println("더 이상 학년을 증가시킬 수 없습니다.");
            studentYear--;
            return;
        }
        showStudentinfo();
    } // 그만 줄려고 할때 else 를 준다.

    void increaseStudentYear(int year){// 메서드 오버로딩
        studentYear += year;
        if(studentYear > 5){
            System.out.println(year + "학년을 더하면 "+studentYear+"학년을 넘어섭니다.");
            studentYear-= year;
            return;
        }
        showStudentinfo();
    }
    void showStudentinfo() {
        System.out.println("학교 : " + schoolName);
        System.out.println("학번 : " + studentCode);
        System.out.println("학년 : " + studentYear);
        System.out.println("이름 : " + name);
        System.out.println();
    }

    
}

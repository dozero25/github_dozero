package J09_클래스;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.schoolName = "부산대학교";
        s1.studentCode = 20220001;
        s1.studentYear = 1;
        s1.name = "김준일";

        s2.schoolName = "부경대학교";
        s2.studentCode = 20220002;
        s2.studentYear = 2;
        s2.name = "김준이";

        s1.showStudentinfo();

//        System.out.println("<<<<<<<<<학년증가 반복>>>>>>>>>");
//        for(int i = 0; i < 10; i++){
//            s1.increaseStudentYear();
//        }

        s1.showStudentinfo();
        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);

    }
}

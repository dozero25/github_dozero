package 컬렉션;

import java.util.*;

public class StudentSetHome {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        System.out.println(students);

        /*
            1. 김혜진 학생의 학번을 출력하세요.
            2. 20220004 학번을 가진 학생의 이름을 설민수로 변경하세요.
            3. 20220001 학번이 존재하면 해당 학생을 삭제하세요.
            set -> list 로 변환
            해당 list를 학번에 순서에 맞게  정렬하시오

         */
        System.out.println("1번 문제");
        System.out.print("답 : ");
        // 1.
        String searchName = "김혜진";
        for(Student student : students){
            if(student.getName().equals(searchName)) {
                student.getId();
                System.out.println(student.getName()+"의 학생의 번호는 "+student.getId()+"입니다.");
            }
        }

        System.out.println("2번 문제");
        System.out.print("답 : ");
        // 2.
        int searchNum = 20220004;
        for(Student student : students){
            if(student.getId() == searchNum) {
                student.setName("설민수");
                break;
            }
        }
        System.out.println(students);

        System.out.println("3번 문제");
        System.out.print("답 : ");
        // 3.
        searchNum = 20220001;
        for(Student student : students){
            if(student.getId() == searchNum) {
                students.remove(student);
                break;
            }
        }
        System.out.println(students);










    }
}
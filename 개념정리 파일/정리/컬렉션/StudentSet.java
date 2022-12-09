package 정리.컬렉션;


import java.util.HashSet;
import java.util.Set;

public class StudentSet {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<Student>();
        students.add(new Student(20220001, "윤도영"));
        students.add(new Student(20220002, "윤도일"));
        students.add(new Student(20220003, "윤도이"));
        students.add(new Student(20220004, "윤도삼"));
        students.add(new Student(20220005, "윤도사"));

        System.out.println(students);

        String searchName = "윤도이";
        for(Student student : students){
            if(student.getName().equals(searchName)) {
                System.out.println(searchName+"의 학생의 번호는 "+student.getId()+"입니다.");
                break;
            }
        }

        int searchId = 20220001;
        for(Student student : students){
            if(student.getId() == searchId) {
                students.remove(student);
                break;
            }
        }
        System.out.println(students);



    }


}

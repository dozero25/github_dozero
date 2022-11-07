package J19_컬렉션;

import java.util.List;
import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        String searchName = "김규민";

        for (Student student : students) { // forEach로 반복조회
            if (student.getName().equals(searchName)){ // if문으로 getName()을 통해 searchName과 일치한지
                System.out.println(searchName + " 학생의 학번 : "+student.getId()); // 일치하면 이름과 getId를 한다.
                break; // 찾았으니 break
            }
        }
        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            if(student.getName().equals(searchName)){
                System.out.println(searchName + " 학생의 학번 : "+students.get(i).getId());
                break;
            }
        }

        int searchId = 20220002;
        // 지우고 학생리스트 출력
        for(Student student : students){
            if(student.getId() == searchId){ // 만약 학생 중 getId와 serachId가 같으면
               students.remove(students.indexOf(student)); // students에서 해당 학생을 삭제한다.
                break;
            }
        }
        int searchId2 = 20220003;
        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            if(student.getId() == searchId2){
                students.remove(i);
                break;
            }
        }

        System.out.println(students);









    }
}

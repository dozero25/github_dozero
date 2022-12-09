package 정리.컬렉션;

import java.util.*;

public class StudnetList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20220001, "윤도영"));
        students.add(new Student(20220002, "윤도일"));
        students.add(new Student(20220003, "윤도이"));
        students.add(new Student(20220004, "윤도삼"));
        students.add(new Student(20220005, "윤도사"));

        String searchName = "윤도이";

        // 학생 찾기
        for (Student student : students){
            if(student.getName().equals(searchName)){
                System.out.println(searchName+" 학생의 학번 : "+student.getId());
                break;
            }
        }
        // 지우고 출력
        for(Student student : students){
            if(student.getName().equals(searchName)){
                students.remove(students.indexOf(student));
                break;
            }
        }
        // 변경하고 출력
        int searchId = 20220004;
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getId() == searchId){
                student.setName("윤도라이");
                break;
            }
        }
        // 반대로 출력
        List<Student> reverseStudent = new ArrayList<Student>();

        for(Student student : students){
            reverseStudent.add(0, student);
        }
        System.out.println(reverseStudent);

        Collections.reverse(reverseStudent);
        System.out.println(reverseStudent);

        // idList, nameList 각각 출력
        List<Integer> idList = new ArrayList<Integer>();
        List<String> nameList = new ArrayList<String>();

        for(Student student : students){
            idList.add(student.getId());
            nameList.add(student.getName());
        }
        students.clear();
        System.out.println(idList);
        System.out.println(nameList);




    }
}

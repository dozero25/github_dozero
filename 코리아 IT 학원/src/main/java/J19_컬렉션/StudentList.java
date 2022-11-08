package J19_컬렉션;

import java.util.Collections;
import java.util.Iterator;
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

        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            if(student.getId() == searchId){
                students.remove(i);
                break;
            }
        }

        System.out.println(students);


        /*
        id = 20220003의 학생을 찾아서 그 학생의 이름이 김규민이면 김경민으로 바꿔라
         */
        searchId = 20220003;
        for(Student student : students){
            if(student.getId() == searchId && student.getName().equals("김규민")){
                student.setName("김경민");
                break;
            }
        }

        System.out.println(students);

        System.out.println("----------------------------------");

        for(Student student : students){
            System.out.println(student);
        }
        System.out.println("----------------------------------");
        /*
        박경효를 박창우로 변경
         */
        searchId = 20220004;
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next(); // student에 주소를 담아라
            if(student.getId() == searchId){
                student.setName("박창우");
                break;
            }
        }
        System.out.println(students);

        System.out.println("----------------------------------");
        // 반대로 출력하기
        List<Student> reverseStudents = new ArrayList<Student>();
        //방버 1.
//        for(int i = 0; i < students.size(); i++) {
//            reverseStudents.add(students.get(students.size()-1-i));
//        }
//        System.out.println(reverseStudents);
        //방법 2.
        for(Student student : students){
            reverseStudents.add(0, student);
        }
        System.out.println(reverseStudents);

        Collections.reverse(reverseStudents);
        System.out.println(reverseStudents);

        System.out.println("----------------------------------");

        /*
            idList
            nameList
            각각 리스트 출력
        */
        List<Integer> idList = new ArrayList<Integer>(); // 일반자료형은 사용하지 못한다.
        List<String> nameList = new ArrayList<String>();

        for(Student student : students){
            idList.add(student.getId());
            nameList.add(student.getName());
        }
        System.out.println(idList);
        System.out.println(nameList);

        students.clear(); // students 배열 내용 삭제
        System.out.println(students);
        System.out.println("----------------------------------");
        
        // idList, nameList로 삭제된 students 내용 추가
      for(int i = 0; i < idList.size(); i++){
         Student student =  new Student(idList.get(i), nameList.get(i)); // 합쳐서 넣기
          students.add(student);
      }
        System.out.println(students);




    }
}

package J11_배열.StudentManagement;

import java.util.Scanner;
public class StudentService {
    private Scanner scanner; // scanner도 자료형이다, 필수값
    private StudentRepository studentRepository; // 필수값
    public StudentService(Scanner scanner, StudentRepository studentRepository) {
        this.scanner = scanner;
        this.studentRepository = studentRepository;
    }
    public void registerStudent() { //registerStudent의 로직
        String name;
        int kor;
        int eng;
        int math;
        //입력하는 기능은 밖으로 빼는게 좋다.
        System.out.println("[학생정보 등록]");
        System.out.print("이름 : ");
        name = scanner.nextLine();
        System.out.print("국어 : ");
        kor = scanner.nextInt();
        System.out.print("영어 : ");
        eng = scanner.nextInt();
        System.out.print("수학 : ");
        math = scanner.nextInt();
        scanner.nextLine();
        Student student = new Student(name, kor, eng, math);
        studentRepository.addStudent(student);
    }

    public void showStudents() {
       Student[] students = studentRepository.getStudents();

       for(int i = 0; i < students.length; i++) {
           Student student = students[i];
           student.showStudentInfo();
       }
    }

    public void showStudent(){
        String name;
        System.out.println("[학생 정보 이름으로 조회]");
        System.out.print("이름을 입력하세요 : ");
        name = scanner.nextLine();

       int index = studentRepository.findStudnetByName(name);
       if(index == -1){
           System.out.println("입력한 이름의 학생은 등록되어 있지 않습니다.");
           return;
       }
       studentRepository.getStudents(index).showStudentInfo();
       //Repository에서  getStudents를 하면 학생의 정보를 보여준다.
    }

}

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

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if(student != null){
                student.showStudentInfo();
            }
        }
    }
    private int indexOf(){ // 중복으로 사용하므로 메서드로 생성, Service에서만 사용하기 때문에 private로 설정
        String name;
        
        System.out.print("이름을 입력하세요 : ");
        name = scanner.nextLine();

        return studentRepository.findStudnetByName(name);
    }
    public void showStudent() {
        System.out.println("[학생 정보 이름으로 조회]");
        int index = indexOf();
        
        if (index == -1) {
            System.out.println("입력한 이름의 학생은 등록되어 있지 않습니다.");
            return;
        }
        studentRepository.getStudents(index).showStudentInfo();
        System.out.println("조회 완료!");
        System.out.println();
        //Repository에서  getStudents를 하면 학생의 정보를 보여준다.
    }

    public void deleteStudent() {
        System.out.println("[학생 정보 이름으로 삭제]");
        int index = indexOf();

        if (index == -1) {
            System.out.println("입력한 이름의 학생은 등록되어 있지 않습니다.");
            return;
        }
        studentRepository.removeStudent(index).showStudentInfo();
        System.out.println("삭제 완료!");
        System.out.println();

    }

    public void modifyStudent(){
        System.out.println("[학생 정보 이름으로 수정]");
        int index = indexOf();
        int kor;
        int eng;
        int math;

        if (index == -1) {
            System.out.println("입력한 이름의 학생은 등록되어 있지 않습니다.");
            return;
        }
        System.out.print("국어 : ");
        kor = scanner.nextInt();
        System.out.print("영어 : ");
        eng = scanner.nextInt();
        System.out.print("수학 : ");
        math = scanner.nextInt();
        scanner.nextLine();
        Student updateStudent = new Student(null, kor, eng, math);

        studentRepository.updateStudent(index, updateStudent);
        System.out.println("수정 완료!");
        System.out.println();
    }
}

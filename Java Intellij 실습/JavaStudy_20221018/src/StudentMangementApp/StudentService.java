package StudentMangementApp;

import java.util.Scanner;

public class StudentService {

    private Scanner scanner; // 클래스에 멤버 변수로 선언, Scanner도 자료형이기 때문에 가능

    private StudentRepository studentRepository;

    public StudentService(Scanner scanner, StudentRepository studentRepository) {
        this.scanner = scanner; // 매개변수로 전달해 대입시킨다.
        this.studentRepository = studentRepository;
    }

    public void registerStudent() { // registerStudent의 로직
        String name;
        int kor;
        int eng;
        int math;
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

        // 학생객체 생성
        Student student = new Student(name, kor, eng, math);
        // 생성된 학생을 전달한다.
        studentRepository.addStudent(student); // repository에 student 정보가 저장이 된다.
    }
    // 학생들의 정보출력
    public void showStudents() {
        Student[] students = studentRepository.getStudents(); // students의 배열
        // 반복을 통해 학생정보를 학생의 배열 수 많큼 출력하게 된다.
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if(student != null){ //  null이 아닐때만 실행해라
                student.showStudentInfo();
            }
        }
    }
    // 공통으로 사용되므로 메서드로 만든다.
    private int indexOf() {
        String name;
        System.out.print("이름을 입력하세요 : ");
        name = scanner.nextLine();

        return studentRepository.findStudentByName(name); // 우리가 넣은 이름으로 index 번호를 찾게 한다.
        // 결과값이므로 return
    }
    // 학생 한 명 정보 출력
    public void showStudent() {
        System.out.println("[학생정보 이름으로 조회]");
        int index = indexOf();
        if (index == -1) {
            System.out.println("입력한 학생의 이름은 조회되지 않습니다.");
            return;
        }
        studentRepository.getStudent(index).showStudentInfo(); //
        //repository에서 getStudent의 인덱스 번호를 가져와서 showInfo를 한다.
        System.out.println("조회 완료!!");
        System.out.println();
    }
    // 학생 정보 삭제
    public void deleteStudent() {
        System.out.println("[학생정보 이름으로 삭제]");
        int index = indexOf();
        if (index == -1) {
            System.out.println("입력한 학생의 이름은 조회되지 않습니다.");
            return;
        }
        studentRepository.removeStudent(index).showStudentInfo();
        //repository에서 removeStudent의 인덱스 번호를 가져와서 showInfo를 한다.
        System.out.println("삭제 완료!!");
        System.out.println();
    }

    // 학생정보 수정
    public void modifyStudent() {
        System.out.println("[학생정보 이름으로 수정]");
        int index = indexOf();
        int kor;
        int eng;
        int math;

        if (index == -1) {
            System.out.println("입력한 학생의 이름은 조회되지 않습니다.");
            return;
        }// 등록 되어야 수정 가능, 등록 되어있지 않으면 return 되면서 실행 x
        System.out.print("국어 : ");
        kor = scanner.nextInt();
        System.out.print("영어 : ");
        eng = scanner.nextInt();
        System.out.print("수학 : ");
        math = scanner.nextInt();
        scanner.nextLine();

        Student updateStudent = new Student(null,kor, eng, math);
        studentRepository.updateStudent(index, updateStudent);
        System.out.println("수정완료!!");
        System.out.println();

    }
}

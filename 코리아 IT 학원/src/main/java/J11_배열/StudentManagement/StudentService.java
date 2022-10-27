package J11_배열.StudentManagement;

import java.util.Scanner;

public class StudentService {

    private Scanner scanner; // scanner도 자료형이다

    
    public StudentService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void registerStudent() { //registerStudent의 로직
        String name;
        int kor;
        int eng;
        int math;
        //입력하는 기능은 밖으로 빼는게 좋다.
        System.out.println("[학생정보 등록]");
        System.out.println("이름 : ");
        name = scanner.nextLine();
        System.out.println("국어 : ");
        kor = scanner.nextInt();
        System.out.println("영어 : ");
        eng = scanner.nextInt();
        System.out.println("수학 : ");
        math = scanner.nextInt();

        Student student = new Student(name, kor, eng, math);
    }
}

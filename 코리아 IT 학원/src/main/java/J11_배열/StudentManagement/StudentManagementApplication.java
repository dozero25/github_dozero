package J11_배열.StudentManagement;

import java.util.Scanner;

public class StudentManagementApplication {

    public static void main(String[] args) {

        StudentService studentService = new StudentService(new Scanner(System.in), new StudentRepository()); // 매개변수 필요

        studentService.registerStudent();
        studentService.registerStudent();
        studentService.showStudents();
    }
}

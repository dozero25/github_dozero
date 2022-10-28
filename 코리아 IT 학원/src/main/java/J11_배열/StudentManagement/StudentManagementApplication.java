package J11_배열.StudentManagement;

import java.util.Scanner;

public class StudentManagementApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService(scanner, new StudentRepository()); // 매개변수 필요

        String selected = null;

        while(true){
            System.out.println("[학생 관리 프로그램 메뉴]");
            System.out.println("1. 학생 전체 조회");
            System.out.println("2. 학생 등록");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. 학생 정보 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            selected = scanner.nextLine();

            if(selected.equals("q")){
                break;
            }
            else if(selected.equals("1")){
                studentService.showStudents();
            }
            else if(selected.equals("2")){
                studentService.registerStudent();
            }
            else if(selected.equals("3")){
                studentService.modifyStudent();
            }
            else if(selected.equals("4")){
                studentService.deleteStudent();
            }
            else if(selected.equals("5")){
                studentService.showStudent();
            }else{
                System.out.println("잘못된 입력!!! 다시 입력하세요.");
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
        System.out.println("프로그램 종료!!");

    }
}

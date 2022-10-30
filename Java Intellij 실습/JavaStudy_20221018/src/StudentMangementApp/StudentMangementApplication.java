package StudentMangementApp;

import java.util.Scanner;

public class StudentMangementApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // repository 객체를 만들고 service가 생성될때 주소(매개변수로)를 주게 된다. service의 생성자에게 주소를 주게 된다.
        StudentService studentService = new StudentService(scanner, new StudentRepository());

        String select = null;
        while(true){
            System.out.println("[학생 관리 프로그램 메뉴]");
            System.out.println("1. 학생 전체 조회");
            System.out.println("2. 학생 등록");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. 학생 정보 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            select = scanner.nextLine();

            if(select.equals("7")){
                break;
            } else if (select.equals("1")) {
                studentService.showStudents();
            }
            else if (select.equals("2")) {
                studentService.registerStudent();
            }
            else if (select.equals("3")) {
                studentService.modifyStudent();
            }
            else if (select.equals("4")) {
                studentService.deleteStudent();
            }
            else if (select.equals("5")) {
                studentService.showStudent();
            }
            else{
                System.out.println("잘못된 입력!! 다시 입력하세요!!");
            }
        }
        System.out.println("프로그램 종료");


    }
}

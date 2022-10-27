package J10_접근지정자.캡슐화;

public class StudentService {
    
    public void registerStudent() {
        System.out.println("[ 학생 정보 등록 메뉴 ]");
        System.out.println("먼저 중복된 학생 정보인지 확인합니다.");
        doubleCheckStudent("윤도영");

        System.out.println("학생정보를 등록합니다.");
    }

    private boolean doubleCheckStudent(String studentName) {
        // 중복된 정보 판별기는 내부에서 사용하므로 private 사용
        // 이 기능은 이 클래스 안에서만 사용 가능하다.
        if(studentName.equals("윤도영")){
            return false;
        }
        return true;
    }
    
    
}

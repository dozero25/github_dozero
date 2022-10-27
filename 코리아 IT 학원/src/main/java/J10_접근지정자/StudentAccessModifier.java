package J10_접근지정자;

public class StudentAccessModifier {
    private int code; // 동일한 클래스 내에서만 사용 가능, 외부인들은 건들일 수 없다.
    private String name; // 변수들은 무조건  private
//  int code : 아무 것도 없지만 앞에 default가 적혀진 상태이다.
    // 생성자를 통해서 값 주입
    public StudentAccessModifier(int code, String name){ // public을 항상 붙여준다.
        this.code= code;
        this.name = name;
    }  // 생성자

    public void setCode(int code){ // 앞에 무조건  set 뒤엔 무조건 카멜 표기법을 사용, 값을 넣을려면 매개변수 필요
        this.code = code;
    } // setter : 생성자 주입이랑 같다.
    public int getCode(){ // 앞에 무조건 get 뒤엔 무조건 카멜 표기법 사용
        return code;
    } // getter : 안에 있는걸 밖으로 가져오는 것(return 사용)
    // Alt + insert = 단축키 getter and se
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void showinfo(){ // 메소드들은 대부분 public을 사용
        System.out.println("학번 : "+code);
        System.out.println("이름 : "+name);
    }


}

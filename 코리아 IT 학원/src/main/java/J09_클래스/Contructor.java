package J09_클래스;

public class Contructor { // 생성자를 통한 값 주입
    //전역변수
    int num;
    String name;

    Contructor(){
        System.out.println("NoArgsConstructor(기본 생성자)");
    }
    Contructor(int num){
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로하는 생성자)");
        this.num = num; // 지역변수
        // 지역변수가 전역변수보다 높다.
        // 전역변수에 넣기 위해서는 매개변수를 바꿔준다. (매개변수를 바꿔줄 경우 단점이 많다. 잘 사용 x)
        // 그래서 this. 을 사용(전역 변수 자기 자신을 뜻함)
    }
    Contructor(String name){
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로하는 생성자)");
        this.name= name;
    }
    Contructor(int num, String name){
        System.out.println("AllArgsConstructor(전체 생성자)");
        this.num = num;
        this.name = name;
    }
    void showInfo(){
        System.out.println("num : "+num);
        System.out.println("name : "+name);
    }

}

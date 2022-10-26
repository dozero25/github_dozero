package J06_조건;

public class Condition1 {
    public static void main(String[] args) {

        int num = 0;

        if(num > 0 || num ==0){
            System.out.println("num이 0이거나 num은 양수입니다.");
        }else {
            System.out.println("num은 음수입니다.");
        }
        if(num < 0){
            System.out.println("num은 음수입니다.");
        }
    }
}

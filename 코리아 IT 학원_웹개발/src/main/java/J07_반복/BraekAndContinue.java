package J07_반복;

public class BraekAndContinue {
    public static void main(String[] args) {
        
        int i = 0;
        while (true) {// while에 true가 있으면 무한반복
            if(i > 9){
                break;
            }
            System.out.println(i);
            i++;
        }

        for(int j = 0; j < 10; j++) {
            if(j == 7){
                System.out.println("7을 만났습니다.");
                break;
            }
            System.out.println(j);
        }
        System.out.println("<<<<<<Continue>>>>>>");

        for(int j = 0; j < 100; j++) {
            if(j % 5 != 0 || j ==0){
                continue; // 계속하다.
            }
            System.out.println(j);
        }

    }
}

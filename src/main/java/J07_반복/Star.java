package J07_반복;

public class Star {
    public static void main(String[] args) {

        for (int i = 0; i <5; i++){ // 반복횟수, 5번 반복해야한다.
            for (int j = 0; j < i + 1; j++){
                System.out.print("*");
                //
            }
            System.out.println();
        }
        System.out.println("==========");

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==========");

        for (int i = 0; i < 10; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==========");

        for (int i = 0; i<10; i++){
            for(int j = 0; j<10-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}

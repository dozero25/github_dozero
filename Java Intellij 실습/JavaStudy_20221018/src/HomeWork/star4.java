package HomeWork;

public class star4 {
    public static void main(String[] args) {
        // 오른쪽으로 치우쳐진 별
        for (int i = 0; i < 5; i++){
            for (int j = 0; j<i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

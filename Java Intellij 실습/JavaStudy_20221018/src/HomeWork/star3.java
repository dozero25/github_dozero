package HomeWork;

public class star3 {
    public static void main(String[] args) {
        // 왼쪽에 치우친 감소하는 별
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}

package HomeWork;

public class star2 {
    public static void main(String[] args) {
        // 오른쪽에 치우친 증가별
        for(int i = 0; i < 5; i++){
            for (int j= 0; j<5-i-1; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

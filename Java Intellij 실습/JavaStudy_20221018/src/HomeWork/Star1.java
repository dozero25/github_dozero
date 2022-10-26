package HomeWork;

public class Star1 {
    public static void main(String[] args) {
        // 왼쪽에 치우쳐진 별 증가

        for(int i = 0; i<5; i++){
            for (int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

package HomeWork;

import java.util.Scanner;

public class Method {
    public static String getStar(int select, int n){
        String result = "";
        if(select == 1){
            for(int i = 0; i<n; i++){
                for (int j = 0; j<i+1; j++){
                    result +="*";
                }
                result +="\n";
            }
        }
        else if (select == 2) {
            for(int i = 0; i < n; i++){
                for (int j= 0; j<n-i-1; j++){
                    result +=" ";
                }
                for (int j = 0; j < i+1; j++){
                    result +="*";
                }
                result +="\n";
            }
        }
        else if (select == 3) {
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n-i; j++){
                    result +="*";
                }
                result +="\n";
            }
        }
        else if (select == 4) {
            for (int i = 0; i < n; i++){
                for (int j = 0; j<i;j++){
                    result +=" ";
                }
                for (int j = 0; j < n-i; j++){
                    result +="*";
                }
                result +="\n";
            }
        }
        else{
            System.out.println("잘못입력하셨습니다.");
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int select = 0;
        System.out.print("별의 개수입력 : ");
        n = scanner.nextInt();

        System.out.println("1. 왼쪽에 치우친 증가하는 별");
        System.out.println("2. 오른쪽에 치우친 증가하는 별");
        System.out.println("3. 왼쪽에 치우친 감소하는 별");
        System.out.println("4. 오른쪽에 치우친 감소하는 별");
        System.out.print("메뉴 선택 : ");
        select = scanner.nextInt();

        String star = getStar(select, n);
        System.out.println("[ 결과 ]");
        System.out.println(star);
    }
}

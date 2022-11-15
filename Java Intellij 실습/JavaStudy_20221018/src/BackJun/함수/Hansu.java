package BackJun.함수;

public class Hansu {

    public static void main(String[] args) {

        System.out.println(su(110));
        System.out.println(su(210));
        System.out.println(su(1000));
        System.out.println(su(500));

    }

    public static int su(int num){ // 조건식을 풀 함수, 언제든지 사용 가능하다.
        int count = 0;

        if(num < 100){
            return num;
        }
        else{
            count = 99;

            for(int i =100; i <= num; i++){
                int hundred = i /100;
                int ten = (i/10)%10;
                int one = i%10;

                if((hundred - ten) == (ten - one)){
                    count++;
                }
            }
        }
        return count;
    }

}

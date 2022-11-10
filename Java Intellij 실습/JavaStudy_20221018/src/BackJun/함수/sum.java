package BackJun.함수;


public class sum {
// class 만 만들면 된다.
    long sum(int[] a){
        long sum = 0;

        for (int i = 0; i < a.length; i++){
            sum += a[i]; // 똑같이 하던대로 하면 된다.
        }
        return sum;
    }



}

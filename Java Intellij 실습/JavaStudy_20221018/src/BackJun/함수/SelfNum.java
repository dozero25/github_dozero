package BackJun.함수;

public class SelfNum {
    // 참고 및 출처 : https://st-lab.tistory.com/53
    public static int num1(int num) {
        int sum = num;
        // 모르는 부분 : 계산 부분이 이해가 못하겠음;;
        while(num !=0){ // 반복문 num이 0이 아니면
            sum = sum + (num % 10); // 첫째 자리수
            num = num/10; // 10을 나누어 첫 째자리를 없앤다.
        }

        return num; // num을 return
    }

    public static void main(String[] args) {

        boolean[] selfNum = new boolean[10001];

        for(int i = 0; i <= 10000; i++) { // 10000까지 반복
            int num = num1(i);

            if(num < 10001){
                selfNum[num] = true;
            }
        }
        // 헷갈리는 부분 : StringBuilder 사용
        StringBuilder strBuilder = new StringBuilder();
        // String과 같이 문자열을 다루는 클래스, 변경 가능한 문자열로 만들어 준다.
        // 문자열을 생성자로 넣어 인스턴스를 한 번 생성하고 나면
        // 인스턴스가 가진 문자열 값을 변경하지 못하는 단점을 보완한 클래스

        for(int i = 0; i <= 10000; i++) {
            if(!selfNum[i]){
                strBuilder.append(i).append('\n'); // append 문자열 추가
            }
        }
        System.out.println(strBuilder);
    }
}

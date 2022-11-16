package J25_문자열;

public class String6 {
    public static void main(String[] args) {

        String httpRequest = "     ";

        /*
            문자열이 비어있지 않으면
            1. null x
            2. "" x 빈값이 아니다.
            3. " " x  스페이스바도 들어 있는 경우 비어있다.
         */
        if(!httpRequest.isBlank()){ // 2, 3 을 포함한 내용이다.
            System.out.println(httpRequest);
        }else{
            System.out.println("공백은 사용할 수 없습니다.");
        }
    }
}

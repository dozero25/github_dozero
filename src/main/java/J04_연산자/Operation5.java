package J04_연산자;

public class Operation5 {
    public static void main(String[] args) {
        int totalCount = 202;
        int maxPage = totalCount / 10 == 0 ? totalCount / 10 : totalCount / 10 +1;
                                            // 참이면 앞 거짓이면 뒤
        int page = 15;

        // 삼항연산자
        int startIndex = page % 5 == 0 ? page -4 : page -(page % 5 )+1;
        int endIndex = startIndex + 4 <= maxPage ? startIndex + 4 : maxPage ;

        System.out.println("page : " + page);
        System.out.println("startIndex : "+ startIndex);
        System.out.println("endIndex : "+ endIndex);

        String isMaxIndexStr = page == endIndex ? "마지막 인덱스입니다." : "마지막 인덱스가 아닙니다.";
        System.out.println(isMaxIndexStr);

    }
}

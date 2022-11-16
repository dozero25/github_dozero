package J17_스태틱.싱글톤;

public class ProductView {
    // 싱글톤의 공식
    private static ProductView instance = null;

    private ProductView(){}

    // 중요
    public static ProductView getInstance() { //getter 
        if (instance == null) {
            instance = new ProductView();
        } // instance가 null이면 new Productview 해라
        return instance; // 이미 static로 공유 되었기 때문에 return 된다.
///////////////////////////////////////////////////////////////////////////// 여기까지 클래스명만 달라지게 해서 사용
    }
    public void showMainView(){
        System.out.println("상품 정보를 보여주는 메인 화면");
    }

    public void showOrderView(){
        System.out.println("주문 정보를 보여주는 화면");
    }
}

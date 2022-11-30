package 정리.스태틱.싱글톤;

public class ProductView {
    
    // 싱글톤 공식
    private static ProductView instance = null;
    
    private ProductView(){}
    
    // 중요
   public static ProductView getInstance() {  // getInstance
        if(instance == null) {
            instance = new ProductView();
        } // instance가 null이 아니면 new ProductView 해라
        return instance; // 이미 static(정적)으로 공유 되었기 때문에 return 된다.
   }
   
   public void showMainView(){
       System.out.println("상품을 보여주는 메인 화면");
   }
   
   public void showOrderView(){
       System.out.println("주문 정보를 보여주는 화면");
   }
}

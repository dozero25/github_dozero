package J17_스태틱.싱글톤;

public class ViewMain {
    public static void main(String[] args) {
        // 생성자가 private일 경우
        ProductView.getInstance().showMainView();
        ProductView.getInstance().showOrderView();

    }
}

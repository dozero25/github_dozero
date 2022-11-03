package J17_스태틱;
import lombok.Data;
@Data
public class Product {
    // static은 공유하는 영역, 똑같은 메모리를 공유하게 된다.
    public static int autoIncrement = 20220000;
    private  int serialNumber;
    private String productName;

    public Product(String productName) {
        serialNumber = ++autoIncrement;
        this.productName = productName;
    }
    public static int getAutoIncrement() {
        return autoIncrement;
    }
    public static void printInfo(){
        //System.out.println(productName);
        // static 변수가 아니라서 사용을 못한다. static 변수 안에선 static만 사용할 수 있다.
        // 멤버변수는 static 메소드에서 사용할 수 없다.
        // 안에서 자기 자신을 생성하면 사용할 수있다.
        Product product = new Product("product");
        System.out.println(product.productName); // 메모리가 할당 되었으므로 사용할 수 있다.
        System.out.println(autoIncrement);
    }


}

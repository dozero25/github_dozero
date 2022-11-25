package 정리.스태틱;

public class Product {
    public static int autoIncrement = 20220000;
    private int serialNumber;
    private String productName;

    public Product(String productName) {
        serialNumber = ++autoIncrement;
        this.productName = productName;
    }

    public static int getAutoIncrement() {
        return autoIncrement;
    }

    public static void printinfo() {
        Product product= new Product("product");
        System.out.println(product.productName);
        System.out.println(autoIncrement);
    }
}

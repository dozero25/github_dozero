package 정리.추상화.추상클래스;

public abstract class Factory {

    private String productName;

    public Factory(String productName) {
        this.productName = productName;
    }

    public abstract void produce(String model);

    public abstract void managment(String model);

    public String getName() {
        return productName;
    }

    public void printInfo() {
        System.out.println("공장의 정보를 출력합니다.");
        System.out.println("공장 생산 라인 : "+productName);
        System.out.println();
    }
}

package 정리.추상화.추상클래스;

public class TabletFactory extends Factory{

    private String model;

    public TabletFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("타블렛 모델명 : " + model);
        System.out.println();
    }

    @Override
    public void managment(String model) {
        System.out.println(model+" 관리 시스템을 시작합니다.");
        System.out.println();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

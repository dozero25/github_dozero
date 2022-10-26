package J09_클래스;

public class ContructorMain {
    public static void main(String[] args) {

        Contructor c1 = new Contructor();
        c1.showInfo();

        Contructor c2 = new Contructor(10);
        c2.showInfo();

        Contructor c3 = new Contructor(10, "윤도영");
        c3.showInfo();

    }
}

package J10_접근지정자;

public class AccessModifierMain {
    public static void main(String[] args) {

        StudentAccessModifier sam = new StudentAccessModifier(20220001, "윤도영");

        sam.showinfo();
        sam.setName("윤도일");
        sam.showinfo();

        System.out.println(sam.getCode());
        System.out.println(sam.getName());


    }
}

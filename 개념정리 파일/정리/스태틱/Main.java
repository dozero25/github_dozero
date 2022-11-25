package 정리.스태틱;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Main {
    /*
        정적(static)
        : 고정된이란 의미를 가진다.
        : static라는 키워드를 사용하며, static 변수와 static 메소드를 만들 수 있다. 이를 정적 필드, 정적 멤버라고 한다.
        : 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버이다.
        : static 영역에 할당된다. 할당된 메모리는 모든 객체가 공유하여 하나의 멤버가 어디서든지 참조할 수 있다.
     */

    public static void main(String[] args) {
        int autoIncrement = Product.getAutoIncrement();
        System.out.println(autoIncrement);
        System.out.println(Product.autoIncrement);
        Product.autoIncrement++;
        System.out.println(Product.getAutoIncrement());

        Product p1 = new Product("p1");
        System.out.println(p1.getAutoIncrement());
        Product p2 = new Product("p1");
        Product p3 = new Product("p1");
        Product p4 = new Product("p1");
        System.out.println(p2.getAutoIncrement());
        System.out.println(p3.getAutoIncrement());
        System.out.println(p4.getAutoIncrement());

    }
}

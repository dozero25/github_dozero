package J05_Scanner;

import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        /*
        이름 : 윤도영
        나이 : 25
        주소 : 김해 율하
        전화번호 : 010-1111-1111
        사용자의 이름은 윤도영이고 나이는 25살입니다.
        주소는 김해 율하이며 연락처는 010-1111-1111 입니다.
         */
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        String address;
        String phone;

        System.out.print("이름 : ");
        name = sc.next();// next 는  space 와  enter 를 포함하지 않는다. 글자를 넣어야지만 넘어간다.

        System.out.print("나이 : ");
        age = sc.nextInt();
        sc.nextLine();              // 허공에 라인을 적음으로 enter를 날려준다.
        System.out.print("주소 : ");

        address = sc.nextLine();    // nextLine 는  space 와  enter 를 포함 한다.
        System.out.print("전화번호 : ");
        phone = sc.nextLine();

        System.out.println("사용자의 이름은 "+name+"이고 나이는 "+age+"살입니다. ");
        System.out.println("주소는 "+address+"이며 연락처는 "+phone+ "입니다.");



    }
}

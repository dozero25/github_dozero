package J21_익명클래스;

public class AdditionMain1 {
    public static void main(String[] args) {

        Addition<String> stringAddition = new AdditionImpl<String>();
        // <T>에 string이 들어가면 다른 T에도 String이 들어간다.
        // Interface를 생성하기 위해서는 Inplement를 생성해야한다.

        String str = stringAddition.add("문자열");
        System.out.println(str);

        Addition<Integer> integerAddition = new AdditionImpl<Integer>(){ // 정의하면서 동시에 생성을 했다.
        // 여기 메서드에 바로 구현했다.(클래스 정의)
        // 임시틀 ,1회용틀 (interface, 추상클래스) 만들고 생성했다.
        // 재사용이 안된다. 한번만 생성되고 사용할 수 없다.
        // implements는 Override을 통해 재정의하여 매번 생성하여 사용 할 수 있다. 하지만 여기는 클래스 이름이 없어 익명 클래스이며
        // 한번만 사용하고 버리게 되는 클래스이다.
        // 임시 정의하고 생성했다. -> 주소만 들어있는 상태
        // 한번만 사용할 거면 익명 클래스로 만들고, 여러 번 사용할 경우 클래스로 만들어서 사용해라

            @Override // 임시 클래스 생성, 매번 재정의를 새롭게 할 수 있다.
            public Integer add(Integer values) {

                return null;
            }
        }; // 중괄호가 닫힌다.

    }
}

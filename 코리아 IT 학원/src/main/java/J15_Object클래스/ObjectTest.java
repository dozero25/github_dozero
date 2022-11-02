package J15_Object클래스;
/*
 * 모든 클래스는 Object 클래스를 상속받는다.
 * java.base에 있는 것들은 import를 따로 하지 않는다.
 * 배열을 다루는 클래스들은 뒤에 's'가 붙는다.
 */
public class ObjectTest extends Object{

    private String name;
    private String address;

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String showInfo(){
        return "name : "+ name + ", address : "+ address;
    }
    @Override 
    public boolean equals(Object obj) { // 주소 안에 있는 값 비교
        return super.equals(obj);
    }

    @Override
    public String toString() { // 멤버변수의 상태값을 확인하기 위해 많이 사용
        return "name : " + name + ", address : " + address;
    }
}

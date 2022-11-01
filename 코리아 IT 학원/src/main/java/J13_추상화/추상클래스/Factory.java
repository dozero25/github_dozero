package J13_추상화.추상클래스;
/*    { 구현부
         개념들을 묶기 위한 코드
         추상 메소드
         생성의 목적이 아니다.
         abstract : 추상적인, public 뒤에 abstract를 사용한다.
         구현부 없이 뒤에 ;을 붙인다.
    } 구현부
추상클래스
1. 추상 메소드가 하나라도 포함되면 해당 클래스는 추상클래스로 정의되어야 한다.
2. 추상 클래스는 생성할 수 없다.
3. 그 외의 다른 특징은 일반 클래스와 동일하다.
관계는 1 : n의 관계이다. n : n의 관계는 없다. 다른 클래스는 추가로 확장할 수 없다.
 */
public abstract class Factory { // 클래스 앞에도 abstract가 붙게 된다.
    // 이 클래스에는 이런 기능을 설계해야해!!
    // 설계도 같은 것 ,
    private String name;

    public Factory(String name){
        this.name = name;
    } // 생성자를 만들 수 있지만 호출은 안된다.

    public abstract void produce(String model);
    public abstract void management();
    // 여기를 만들게 되면 상속받은 다른 클래스들은 오버라이딩을 해야한다.
    // Alt + insert : getter, setter
    public String getName() {
        return name;
    }

//    public void setName(String name){
//        this.name = name;
//    }
    public void printInfo(){
        System.out.println("공장의 정보를 출력합니다.");
        System.out.println("공장이름 : "+name);
    }
    // 각자 만들 필요가 없다.


}

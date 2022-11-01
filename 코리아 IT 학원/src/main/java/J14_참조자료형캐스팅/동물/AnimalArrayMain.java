package J14_참조자료형캐스팅.동물;

public class AnimalArrayMain {

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();

        for(int i=0; i<animals.length; i++) {
            animals[i].move();
        }

        for(int i=0; i<animals.length; i++) {
            if(animals[i] instanceof Human){ // instanceof 적용 가능
//                Human h = (Human) animals[i];
//                h.readBooks();
                ((Human) animals[i]).readBooks(); // ()를 하고 뒤에 변수를 붙인다. 이 메소드의 실행 결과를 다운캐스팅 한다.
            } else if (animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).hunting();

            }
        }



    }
}

package 정리.제네릭.와일드카드;

public class Main {
    /*
        제네릭 와일드카드
        : <?> 는 와일드 카드라고 해서 '알 수 없는 타입'이다.
        : ? extend 상위타입 : 타입 파라미터와 대치하는 상위 타입과 하위 타입이 올 수 있다.
        : ? super 하위타입 : 타입 파라미터와 대치하는 하위 타입과 상위타입이 올 수 있다.
        :?는 타입이 지정되지 않는다는 의미다.
     */

    public AnimalData<? extends Animal> getAnimal(int flag){
        // Animal 을 상속받은 클래스만 가능하다.
        // 파라미터와 대치하는 사우이 타입과 하위 타입 이 올 수 있다.
        if(flag == 1){
            AnimalData<Human> animalData = new AnimalData<Human>(new Human());
            return animalData;
        } else if (flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<Tiger>(new Tiger());
            return animalData;
        }
        return null;

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.getAnimal(1).printData();
        main.getAnimal(2).printData();
    }
}

package 정리.제네릭.와일드카드;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class AnimalData<T> {
    // 제네릭<T>
    private T animal;

    public void printData(){
        ((Animal)animal).move();

        if(animal.getClass() == Human.class){
            ((Human)animal).readBooks(); // 다운 캐스팅
        } else if (animal.getClass() == Tiger.class) {
            ((Tiger)animal).hunting();
        }
        System.out.println();
    }
}

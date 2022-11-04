package J18_제네릭.와일드카드;

public class Main {// animaldata를 사용할수 있지만 animal을 상속 받은 클래스만 가능하다.
        public AnimalData<? extends Animal> getAnimal(int flag){
            if(flag == 1){
                AnimalData<Human> animalData = new AnimalData<Human>(new Human());
                return animalData;
            } else if (flag == 2) {
                AnimalData<Tiger> animalData = new AnimalData<Tiger>(new Tiger());
                return animalData;
            }
//            else if (flag == 3) {
//                AnimalData<Car> animalData = new AnimalData<Car>(new Car("k8"));
//                return animalData;
//            }
            return null;

        }

        public static void main(String[] args) {
            Main main = new Main();
            main.getAnimal(1).printData();
            main.getAnimal(2).printData();
        }




}

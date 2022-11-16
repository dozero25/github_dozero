package J11_배열;

public class ArrayTest1 {

    public static void main(String[] args) {
        // new 라고 적혀져 있으면 동적메모리 heap 메모리를 가져온다.
        int [] numArray = new int[10];
        // 공간 10개를 생성, 안에 값은 없음
        int index = 9;

        numArray[index] = 10;

        for(int i = 0; i < 10; i++){
            System.out.println(numArray[i]);
        }




    }
}

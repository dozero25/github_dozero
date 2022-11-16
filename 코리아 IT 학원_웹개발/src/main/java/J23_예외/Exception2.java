package J23_예외;

public class Exception2 {

    public static void printArray(int[] numbers) throws Exception { // throws 해서 Exception을 던져줬다.

        for (int i = 0; i< numbers.length + 1; i++) {
            System.out.println("/" + numbers[i]);
        }
    }

    public static void main(String[] args) {

        if(1 ==1){
            try{
                throw new RuntimeException("예외 강제 생성"); // 없던 예외도 강제로 만들었다.
            } catch(RuntimeException e){
                System.out.println("런타입 예외 처리");
            } catch(Exception e){
                // 왠만한 모든 예외들은 exception 으로 업캐스팅 가능하다.
                // 마지막 catch에 exception을 달아주면서 종료되는 것을 막아준다.
                e.printStackTrace();
            } finally {
                // 예외가 발생하든 예외가 발생하지 않든 실행이된다.
                // 임시 파일들이 저장된다.

                System.out.println("예외가 발생 하든 하지 않든 실행");
            }
        }
        System.out.println("프로그램 정상 종료");
        

//
//        try{
//            printArray(new int[] {1,2,3,4,5}); // 여기서 호출한다.
//
//        } catch(ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            throw new RuntimeException(e); // throw는 예외를 강제적으로 생성한다.
//        }
//        System.out.println("프로그램 정상 종료");





    }
}

package 정리.예외;

public class Exception2 {

    public static void printArray(int[] numbers) throws Exception{

        for(int i = 0; i < numbers.length +1; i++){
            System.out.println("/"+ numbers[i]);
        }
    }
    public static void main(String[] args) {

        if(1==1){
            try{
                throw new RuntimeException("예외 강제 생성");
                // 없던 예외 강제 생성
            }catch (RuntimeException e){
                System.out.println("런타입 예외 처리");
            }catch (Exception e){
                // 웬만한 모든 예외들은 exception으로 업캐스팅 가능하다.
                // 마지막 catch에 exception을 달아주면 종료되는 것을 막아준다.
                e.printStackTrace();
            }finally {
                // 예외가 발생하든 발생하지 않든 실행된다.
                // 임시 파일들이 저장된다.
                System.out.println("예외가 발생하든 하지않든 실행");
            }
        }
        System.out.println("프로그램 정상종료");

        try {
            printArray(new int[] {1,2,3,4,5});
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } catch (Exception e){
            throw  new RuntimeException(e);
        }
        System.out.println("프로그램 정상종료");


    }

}

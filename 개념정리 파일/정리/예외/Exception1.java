package 정리.예외;

/*
    예외 처리
    : 사용자가 잘못된 조작이나 개발자의 코딩 실수로 인해 발생하는 프로그램 오류를 말한다.
    : 예외가 발생되면 프로그램은 곧 바로 종료된다는 점에서 에러와 동일하나,
    : 예외처리를 통해 프로그램이 종료되지 않고 정상 실행 상태가 유지되도록 할 수 있다.

    : Checked Exception은 개발자가 반드시 직접 처리해야한다.
    : Unchecked Exception은 개발자가 예외처리를 직접하지 않아도 된다. 강제되는 것은 아니다.

    실행 예외(Unchecked Eception)의 종류

    NullPointerException(java.lang.NullPointerException)
    : 객체 참조가 없는 상태일 때 발 생
    : null 값을 갖는 참조 변수로 객체 접근 연산자인 도트(.)를 사용했을 때 발생한다.
    : 객체가 없는 상태에서 객체를 사용하려 했으니 당연히 예외가 발생한다.

    ArrayIndexOutOfBoundsException
    : 배열에서 인덱스 범위를 초과하여 사용할 때 발생한다.

    NumberFormatException
    : 문자열로 되어 있는 데이터를 숫자로 변경하는 경우, 문자열을 숫자로 변환하는 방법 중 가장 많이 사용 되는 코드는
      Integer.parseInt(String s) 메소드와 Double.parseDouble 메소드이다.
    : 매개값인 문자열이 숫자로 변활 될 수 있다면 숫자를 정상적으로 리턴하지만, 숫자로 변환할 수 없는 문자열이 포함되어 있으면 발생한다.

    ClassCastException
    : 허용되지 않는데 억지로 타입 변환을 시도할 경우 발생한다.

*/

public class Exception1 {
    public static void main(String[] args) {

        int [] numbers = new int[] {1,2,3,4,5,6,7};

        try {
            String a = null;
            a.toLowerCase();

            for (int i = 0; i < 8; i++){
                System.out.println(numbers[i]);
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("예외를 처리하였습니다.");
        }catch (NullPointerException e){
            System.out.println("null pointer to exception");
        }finally {
            System.out.println("항상 실행되어야 하는 서비스");
        }

        System.out.println("정상종료");
    }
}

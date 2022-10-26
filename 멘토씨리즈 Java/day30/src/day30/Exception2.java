package day30;

public class Exception2 {

	public static void main(String[] args) {
		try {
			Exception e=new Exception("고의 예외");
			throw e; // 고의적으로 예외를 던지겠다
			}
		catch(Exception e) {
			System.out.println("예외발생");
			System.out.println(e.getMessage());
		}
		//Exception 생성자 호출시 전달했던 물자열이 내부적으로 저장되어, 객체.getMessage()를 호출하면 출력된다
		
}
}

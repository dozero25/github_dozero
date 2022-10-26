package day30;

public class RethrowExample {

	public static void main(String[] args) {
		try{
			System.out.println("외부 try . . .");
			try {
				System.out.println("내부 try . . .");
				Exception e=new Exception();
				throw e;
			}
			catch(Exception e) {
				System.out.println("(내부 try-catch) exception : " + e);
				System.out.println("예외 던지기 한번 더 : ");
				throw e;
			}
			finally {
				System.out.println("finally 구문 출력");
			}
			}
		catch(Exception e) {
			System.out.println("(외부 try-catch) exception : " + e);
		}
		System.out.println("종료");

		
	}

}

//1. 외부 try 문 실행
//2. 내부 try 문 실행
//3. 내부 catch 문 실행
//4. 내부 finally 문 실행
//5. 외부 catch 문 실행

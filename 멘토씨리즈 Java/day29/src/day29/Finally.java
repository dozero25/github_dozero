package day29;

public class Finally {

	public static void main(String[] args) {
		int a=0;
		int b=2;
		try {
			System.out.println("외부로 접속");
			int c=b/a;
		}
		catch(ArithmeticException e) {
			System.out.println("오류 발생");
		}
		finally {
			System.out.println("연결 강제 해제");
		}

	}

}

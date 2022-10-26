package day29;

public class Exception {

	public static void main(String[] args) {//try 문은 항상 catch랑 같이 쓰인다
		try {
			int []a= {2,0};
			int b=4;
			int c=b/a[2];//배열의 index [0], [1]
			System.out.println(c);
			
			
		}//같은 오류 처리는 두번 하면 안된다
		catch(ArithmeticException e) {
			System.out.println("산술 오류 발생");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열길이 오류 방생");
			
		}
		System.out.println("예외처리 공부중");

	}

}

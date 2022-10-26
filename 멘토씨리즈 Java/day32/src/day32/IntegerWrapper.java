package day32;

public class IntegerWrapper {

	public static void main(String[] args) {
		Integer i=100;
		//inValue():Integer -> int
		System.out.println(i.intValue()+3);
		
		//doubleValue(): Integer -> double
		System.out.println(i.doubleValue());
		
		//floatValue() : integer -> float
		System.out.println(i.floatValue());
		
		//toString() : integer -> String
		System.out.println(i.toString()+3);
		System.out.println("hello"+"World");
		
	}

}

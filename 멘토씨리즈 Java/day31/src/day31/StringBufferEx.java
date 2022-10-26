package day31;

public class StringBufferEx {

	public static void main(String[] args) {
			//StringBuffer buffer="test"; -->불가능
		StringBuffer buffer=new StringBuffer("test");
			String str="test";
			
			System.out.println("str : "+ str);
			System.out.println("buffer : "+ buffer);
			//append
			buffer.append("Test");
			System.out.println("buffer.append : "+buffer);
			str.concat("Test");
			System.out.println("str.concat : "+str);
			
			//replace(int start, int end, String str)
			buffer.replace(0, 10, "HELLO");
			System.out.println("buffer.replace : "+buffer);
			
			str.replace('t', 'T');
			System.out.println("str.replace : "+str);
			
	}

}

package day36;

public class TypeSearch {

	public static void main(String[] args) {
		Value v= new Value();
		v.TypeSearch(3);
		v.TypeSearch(3.14);
		v.TypeSearch(3.14f);
		v.TypeSearch('a');
		v.TypeSearch("hello");
		v.TypeSearch("true");
		
	}
}
class Value{
	public <T> void TypeSearch(T x) {
		if(x instanceof Integer) {
			System.out.println(x+"는 정수입니다.");
		}
		else if(x instanceof Double || x instanceof Float) {
			System.out.println(x+"는 실수입니다.");
		}
		else if(x instanceof Character) {
			System.out.println(x+"는 문자형입니다.");
		}
		else if(x instanceof String) {
			System.out.println(x+"는 문자열입니다.");
		}
		else if(x instanceof Boolean) {
			System.out.println(x+"는 논리형입니다.");
		}
	}
}
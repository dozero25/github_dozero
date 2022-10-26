package day38;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		// 1. push() : 데이터 삽입
		s.push("apple");
		s.push("banana");
		s.push("cherry");
		System.out.println(s);
		
		// 2. pop() : top의 데이터 삭제
		System.out.println("pop : "+s.pop());
		System.out.println(s);
		// 3. peek() : top의 데이터 보기
		System.out.println("peek : "+s.peek());
		//4. search() 1부터 시작
		s.search(s.search("apple"));
		s.search(s.search("banana"));
		//5. push()
		s.push("toamto");
		System.out.println(s);
		System.out.println("search(apple) : "+ s.search("apple"));
		System.out.println("search(banana) : "+ s.search("banana"));
		System.out.println("search(tomato) : "+ s.search("tomato"));
		
	}

}

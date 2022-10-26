package day38;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<String>(); 
		//Queue<Element>q = new LinkedList<Element>();
		//1. add(e) : rear 위치에  e 삽입
		q.add("apple");
		q.add("banana");
		q.add("cherry");
		
		System.out.println(q);
		
		//2. E element : front에 위치한 데이터 반환
		System.out.println("element : "+q.element());
		
		//3. remove : front에 위치한 데이터를 반환 후 삭제
		System.out.println("remove : "+q.remove());
		System.out.println(q);
		
		//4. offer(e) : rear 위치에 데이터 삽입
		q.offer("peach");
		System.out.println(q);
		
		//5. peek() : front 위치에 있는 데이터의 값 반환
		System.out.println("peek : "+q.peek());
		System.out.println(q);
		
		//6. poll() : front에 위치한 데이터르 반환 후 삭제
		System.out.println("poll : "+q.poll());
		System.out.println(q);

		
		
	}

}

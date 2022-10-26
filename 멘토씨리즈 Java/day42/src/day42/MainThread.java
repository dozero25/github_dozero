package day42;

public class MainThread {
	//Thread 이름, 상태, 우선순위 확인하는 메서드 실습
	public static void main(String[] args) {
		Thread3 t3 = new Thread3();
		t3.start();
		
		System.out.println("Thread Name : "+Thread.currentThread().getName()); //현재 실행되고 있는 스레드의 이름
		System.out.println("Thread state : "+Thread.currentThread().getState()); //현재 실행되고 있는 스레드의 상태
		System.out.println("Thread priority : "+Thread.currentThread().getPriority()); //현재 실행되고 있는 스레드의 우선순위
		System.out.println("--------------------");
	}

}
class Thread3 extends Thread{
	public void run() {
		this.setName("Thread3");
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		System.out.println("Thread state : "+Thread.currentThread().getState());
		System.out.println("Thread priority : "+Thread.currentThread().getPriority());
		
	}
}

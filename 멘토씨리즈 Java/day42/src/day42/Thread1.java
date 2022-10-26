package day42;

public class Thread1 {

	public static void main(String[] args) {
		//JVM 스레드 요청
		//1) Therad 클래스 상속받은 클래스의 스레드요청
		MyThread th1 = new MyThread();
		th1.start();
		// 2) Runnable 인터페이스를 구현한 클래스의 스레드를 요청
		MyThread2 th2 = new MyThread2();
		Thread t=new Thread(th2); //Thread(Runnable targe)
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main 진행 중"+i);}}
}
//1) Thread 클래스 상속받아 작업을 구현
class MyThread extends Thread{
	//run()메서드 오버라이딩(재정의)
	public void run() {
		//스레드가 해야할 작업 구현
		for(int i=0;i<10;i++) {
			System.out.println("Thread 진행 중"+i);}}
}
//2) Runnable 인터페이스를 구현하여 작업을 구현
class MyThread2 implements Runnable{
	//@override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Runnavle 진행 중 "+ i);}}
}
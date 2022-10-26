package day43;

public class Join1 {
	//join()메서드를 알아보는 코드
	public static void main(String[] args) {
		MyThread8 s1=new MyThread8();
		MyThread9 s2=new MyThread9();
		
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		t1.start();
		try {
			t1.join(); // t1를 제외한 다른 스레드 (lock), t1이 완료될때까지 기다림
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
		t2.start();
		try {
			t2.join(); // t2를 제외한 다른 스레드 (lock), t2이 완료될때까지 기다림 
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}
		for(int i=0;i<10;i++) {
			System.out.println("main : "+i);
}}}
class MyThread8 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("t1 : "+i);}
		System.out.println("<<t1 완료>>");
}}
class MyThread9 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("t2 : "+i);}
		System.out.println("<<t2 완료>>");
}}
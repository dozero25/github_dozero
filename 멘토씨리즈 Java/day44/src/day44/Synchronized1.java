package day44;

public class Synchronized1 {
	//한정된 티켓 수량을 멀티 태스킹으로 티켓팅을 했을 때 발생할 수 있는 문제점을 실습을 통해 확인
	public static void main(String[] args) {
		MyThreadB s1=new MyThreadB();
		Thread t1 = new Thread(s1, "A");
		Thread t2 = new Thread(s1, "B");
		Thread t3 = new Thread(s1, "C");
		
		t1.start();  //티켓 수량이 0일때만 티켓팅이 성공해야하나 B,C도 티켓팅을 성공해 음수가 되는 것을 확인할 수 있다
		t2.start();  //이유는 조건문을 걸어뒀으나, A가 티켓팅 한후 ticketNumber을 감소 시키기전에 BC코드가 코드를 통과했기 때문
		t3.start();  //문제 해결 : 스레드가 동시에 자원을 접근하는 것을 제한하는 스레드 동기화 작업이 필요!
	}

}
class MyThreadB implements Runnable{
	Ticketing ticket = new Ticketing();
	public void run() {
		ticket.ticketing();
	}
}
class Ticketing{
	int ticketNumber=1;
	public void ticketing() {
		synchronized (this) {
		if(ticketNumber>0) {
			System.out.println(Thread.currentThread().getName()+"가 티켓팅 성공!");
			ticketNumber--;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"가 티켓팅 실패!");
		}
		System.out.println(Thread.currentThread().getName()+"가 티켓팅 시도 후 티켓수 : "+ticketNumber);
		}
		}
}


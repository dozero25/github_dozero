package day44;

public class ShareBank {
	//엄마랑 아들이 동시에 돈을 뽑는 작업을 스레드를 이용해, 멀티태스킹으로 구현했을 때
	//발생하는 문제를 실습을 통해 확인해보자
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		
		mom.start();
		son.start();
}}
class ATM implements Runnable{
	int moeny = 10000;
	@Override
	public void run() {
			for(int i=0;i<50;i++) {
				withdraw(1000);
				printInfo();
				try {
					Thread.sleep(100); //다른 스레드에게 작업 양도
				} catch (InterruptedException e) {}}}
	synchronized void withdraw(int money) {
		Thread.yield();
		this.moeny -= money;
		System.out.println(Thread.currentThread().getName() +"이(가) "+ money + " 원출금");
	}
	void printInfo() {
		System.out.println("현재 잔액"+ moeny + "원");
	}	
	
}

//엄마가 돈을 뽑고 아들이 돈을 뽑는다면 2000원이 감소 해야하는데. 감소 되지 않는 것을 확인 가능
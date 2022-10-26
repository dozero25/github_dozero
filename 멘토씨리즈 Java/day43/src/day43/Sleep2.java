package day43;

public class Sleep2 {
	//sleep()의 block효과를 이용한  카운트
	public static void main(String[] args) {
		SleepThread t=new SleepThread();
		t.start();
		}
//	 스레드를 지정한 시간 동안 block 상태로 만든다
//	 시간은 1000분의 1초까지 저장할 수 있으며, 지정된 시간이 지나면 다시 ruunable(실행가능한)상태로 돌아간다.

}
class SleepThread extends Thread{
	public void run(){
		System.out.println("카운트 다운 5초");
		for(int i=5;i>=0;i--) {
			System.out.println(i);
			if(i!=0) {
				try {
					Thread.sleep(1000);} //1000당 1초
			
			catch(InterruptedException e) {
				System.out.println(e.toString());
				}
			}
		}
		System.out.println("종료");
}}
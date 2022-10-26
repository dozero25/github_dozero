package day33;

public class Date1 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("시직시간 : "+start);
		int a=0;
		for(int i=1;i<100000000;i++) {
			a++;
		}
		long end =System.currentTimeMillis();
		System.out.println("종료시간 : "+end);
		System.out.println("걸린 작업 시간 : "+(end-start));
	}

}

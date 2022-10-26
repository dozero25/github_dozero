package day27;

public class Interface3 {

	public static void main(String[] args) {
		TourGuide guide=new TourGuide();
		guide.leisureSports();
		guide.sightseeing();
		guide.food();

	}

}
interface Providable{
	void leisureSports();
	void sightseeing();
	void food();
}
class KoreaTour implements Providable{

	@Override
	public void leisureSports() {
		System.out.println("한강에서 수상스키 투어");
		
	}

	@Override
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
	}

	@Override
	public void food() {
		System.out.println("전주 비빔밥 투어");
	}
	
}
class JapenTour implements Providable{

	@Override
	public void leisureSports() {
		System.out.println("도쿄타워 번지점프 투어");
	}

	@Override
	public void sightseeing() {
		System.out.println("오사카 관람 투어");
	}

	@Override
	public void food() {
		System.out.println("초밥 투어");
	}
	
}

class TourGuide{
	//private Providable tour = new KoreaTour(); //인터페이스를 사용하여 업 캐스팅을 하면, 클래스 간 관계가 느슨해 지므로 코드의 수정이 간편함
	private Providable tour = new JapenTour();
	public void leisureSports() {
		tour.leisureSports();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
	
}

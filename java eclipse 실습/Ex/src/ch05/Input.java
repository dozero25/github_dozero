package ch05;

public class Input {

	public static void main(String[] args) {

		MyInformation information1 = new MyInformation();
		MyInformation information2 = new MyInformation();
		MyInformation information3 = new MyInformation();
		// 기본 값 세팅

		// information 정보입력
		// setter
		information1.setName("김두환");
		information1.setResident("990125-1******");
		information1.setPhoneNumber("010-1111-2222");
		information1.setAddress("부산 서면");
		information1.setProperty(1_000_000_000);
		
		information2.setName("이혜린");
		information2.setResident("731220-2******");
		information2.setPhoneNumber("010-2222-3333");
		information2.setAddress("경남 진주 가좌동");
		information2.setProperty(500_000_000);
		
		//getter
		information3.getName("아리랑");
		information3.getResident("040101-4******");
		information3.getPhoneNumber("010-1234-4567");
		information3.getAddress("서울 강남");
		information3.getProperty(5_000_000);
		
		information1.showinfo();
		System.out.println("--------------------");
		information2.showinfo();
		System.out.println("--------------------");
		information3.showinfo();
	}

}

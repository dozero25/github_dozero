package ch10;

public class MainTest1 {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("홍길동", 22, "기획");
		Employee employee2 = new Employee("나가수", 40, "인사");
		Employee employee3 = new Employee("이순재", 52, "개발");
		Employee employee4 = new Employee("김생산", 34, "생산");
		Employee employee5 = new Employee("이거사", 27, "영업");
		Employee employee6 = new Employee("신홍보", 45, "홍보");
		
		
		employee1.showinfo();
		employee2.showinfo();
		employee3.showinfo();
		employee4.showinfo();
		employee5.showinfo();
		employee6.showinfo();

	}
	// getter 
	// : 데이터를 읽어오는 역할
	// : 외부에서 객체의 데이터를 읽어올 때도 안전하게 값 유지
	
	// setter 
	// : 데이터를 변경하는 역할
	

}

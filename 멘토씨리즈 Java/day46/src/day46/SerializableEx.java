package day46;

import java.io.*;

public class SerializableEx {
	//User 클래스를 마샬링을 통해 바이트로 변환하여, 파일에 저장하고
	//파일에 저장된 객체를 언마샬링을 통해 객체의 정보를 프로그램에 출력하는 코드
	public static void main(String[] args) {
		marshalling();
		unmarshalling();
	}
	

	public static void marshalling() {

	try {
		FileOutputStream fos = new FileOutputStream("user.ser");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream out = new ObjectOutputStream(bos);
		
		User u1=new User("test1234", "1234", "가길동");
		
		out.writeObject(u1);
		out.close();
		System.out.println("직렬화 완료");
		

	}
	catch(IOException e) {
		e.printStackTrace();
	
		}
	}
	public static void unmarshalling() {
		try {
		FileInputStream fis = new FileInputStream("user.ser");
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream in = new ObjectInputStream(bis);
		
		User u1=(User)in.readObject();
		System.out.println(u1.toString());
		in.close();
		System.out.println("객체 복원 완료!");
		}
		catch(Exception e) {e.printStackTrace();}
	}
	
}
class User implements Serializable{
	private String id; //private 매개변수 자동생성방법
	private String pw; //마우스 우클릭 - Source - Generate Constructor using Field - generate
	private String name;
	public User(String id, String pw, String name) {
		this.id=id;
		this.pw=pw;
		this.name=name;
		
	}
	public String toString() {
		return "User [id=]" + id + ", name= "+name+"]";
	}
}

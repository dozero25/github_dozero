package day45;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File01 {

	public static void main(String[] args) throws IOException{
		//폴더 우클릭 -> new -> file -> 파일 만들기
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		fis = new FileInputStream("prac.txt"); //try-catch문 or throws 사용
		fos = new FileOutputStream("result.txt"); // 항상 존재하는 파일과 연결, 존재하지 않으면 파일 생성
		
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data;
		while((data = fis.read())!=-1) {
			//data에 읽어온 바이트를 저장하는데, data의 값이 -1이 아닐때 까지 반복
			// -1 : EOF(End Of File)
			
			bos.write(data); // result.txt와 연결
		}
		//파일과의 연결을 닫는 작업
		bos.close();
		bis.close(); // 연결문을 닫을 필요가 있다
	}
	//prac.txt에서 데이터를 하나하나 읽어와서 result.txt에서 읽어온 바이트를 그대로 사용
	//파일을 읽어와서 그대로 사용
}

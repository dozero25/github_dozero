package day35;

import java.io.FileInputStream;
import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src//day35//sample.txt");//파일에서 입력 받기
			Scanner s= new Scanner(fis); // package -> other -> file 검색
			while(s.hasNext()) {
				System.out.println(s.nextLine());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

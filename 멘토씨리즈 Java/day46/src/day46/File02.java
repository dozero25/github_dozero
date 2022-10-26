package day46;

import java.io.*;

public class File02 {

	public static void main(String[] args) {
		//파일 복사 프로그램
		FileReader fr;
		FileWriter fw;
		
		BufferedReader br;
		BufferedWriter bw;
		
		try {
			fr=new FileReader("prac.txt");
			fw=new FileWriter("result.txt");
			
			br = new BufferedReader(fr);
			bw=new BufferedWriter(fw);
			String Line;
			while((Line=br.readLine())!=null) {
				bw.write(Line);
			}
			br.close();
			bw.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

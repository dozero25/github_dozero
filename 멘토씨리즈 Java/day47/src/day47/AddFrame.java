package day47;

// JFrame 클래스를 만들 때 위의 메서드들을 사용해서 기본적인 설정 가능
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class AddFrame extends JFrame{//extends 파일명
	public AddFrame() {
		setTitle("JFrame");
		setSize(300,300);
		setVisible(true);
		//내 프로그램 닫는 기능을 닫기 버튼으로 설정
		
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new AddFrame();
		
		

	}

}

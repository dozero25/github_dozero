package day47;

// JFrame 클래스를 만들 때 위의 메서드들을 사용해서 기본적인 설정 가능
import java.awt.FlowLayout;
import javax.swing.*;


public class AddFrame2 extends JFrame{//extends 파일명
	AddFrame2() {
		setTitle("JFrame");
		setSize(300,300);
		
		//컴포넌트 객체 생성
		JButton button = new JButton("Button");
		JCheckBox box = new JCheckBox("check box");
		JSlider slide = new JSlider();
		JTextField tf = new JTextField("input text", 20);
		this.setLayout(new FlowLayout());
		
		//컴포넌트 객체 추가
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new AddFrame2();
		
		

	}

}

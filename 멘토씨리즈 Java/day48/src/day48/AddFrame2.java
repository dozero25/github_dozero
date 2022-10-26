package day48;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class Listener1 implements ActionListener{
	@Override					//이벤트 발생 시 e객체에 이벤트 정보가 전달
	public void actionPerformed(ActionEvent e) {//어떤 컴포넌트가 액션이 생길 때 발생, 
		JButton button = (JButton)e.getSource();//이벤트 발생한 컴포넌트
		button.setText("버튼 클릭"); //버튼 문자열 재지정
		//e.getSource() : 현재 이벤트가 발생된 컴포넌트, button.setText("문자열"); : 현재 버튼의 문자열 재지정
		}}
public class AddFrame2 extends JFrame {
	AddFrame2(){
		setTitle("JFrame");
		setSize(300,300);
			
		//컴포넌트 객체 생성
		JButton button = new JButton("Button");
		JCheckBox box = new JCheckBox("check box");
		JSlider slide = new JSlider();
		JTextField tf = new JTextField("text 입력", 20);
		this.setLayout(new FlowLayout());
				
		//컴포넌트 객체 추가
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
				
		setVisible(true);
		//내 프로그램 닫는 기능을 닫기버튼이로 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//버튼 컴포넌트에 액션 이벤트 리스너 달기
		button.addActionListener(new Listener1());
	}
	public static void main(String[] args) {
		new AddFrame2();

	}

}

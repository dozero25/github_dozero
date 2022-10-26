package day47;

import java.awt.FlowLayout;
import javax.swing.*;

public class FlowWindow extends JFrame {
	FlowWindow(){
		setTitle("flow");
		setSize(300,300);
		JButton btn1 = new JButton("btn1");
		JButton btn2 = new JButton("btn2");
		JButton btn3 = new JButton("btn3");
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.setLayout(new FlowLayout());
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new FlowWindow();

	}

}

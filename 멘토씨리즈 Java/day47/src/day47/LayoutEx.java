package day47;

import java.awt.*;
import javax.swing.*;

public class LayoutEx {

	public static void main(String[] args) {
		new FlowWindow();
		new BorderWindow();
		new GridWindow();
		

	}
}

class FlowWindow extends JFrame{
	FlowWindow(){
		setTitle("flow window");
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1= new JButton("btn1");
		JButton btn2= new JButton("btn2");
		JButton btn3= new JButton("btn3");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		this.setLayout(new FlowLayout());
		
		setVisible(true);
	}
}

class BorderWindow extends JFrame{
	BorderWindow(){
		setTitle("broder window");
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1= new JButton("btn1");
		JButton btn2= new JButton("btn2");
		JButton btn3= new JButton("btn3");
		JButton btn4= new JButton("btn4");
		JButton btn5= new JButton("btn5");
		
		this.setLayout(new BorderLayout());
		this.add(btn1, BorderLayout.EAST);
		this.add(btn2, BorderLayout.WEST);
		this.add(btn3, BorderLayout.SOUTH);
		this.add(btn4, BorderLayout.NORTH);
		this.add(btn5, BorderLayout.CENTER);
		
		
		setVisible(true);
	}
}
class GridWindow extends JFrame{
	GridWindow(){
		setTitle("grid window");
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1= new JButton("btn1");
		JButton btn2= new JButton("btn2");
		JButton btn3= new JButton("btn3");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		this.setLayout(new GridLayout(2,2));
		
		setVisible(true);
	}
}
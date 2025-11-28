package one.eventhandling;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleButtonClickEventTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		frame.setTitle("Button Click Test");
		
		//button
		JButton button1 = new JButton();
		button1.setText("Click me");
		button1.setBackground(Color.BLUE);
		
		frame.setBounds(50, 50, 500, 600);
		button1.setBounds(50, 100, 100, 100);	
		
		frame.add(button1);
		
		JLabel label1 = new JLabel();
		label1.setText("hahaha");
		label1.setBackground(Color.RED);
		label1.setBounds(200,  200, 150, 50);
		frame.add(label1);
		
		//handle the click event 
		MyButtonEventListener i = new MyButtonEventListener(label1);
		button1.addActionListener(i);
	}

}

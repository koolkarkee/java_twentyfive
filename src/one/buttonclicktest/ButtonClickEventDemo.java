package one.buttonclicktest;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonClickEventDemo {

	public static void main(String[] args) {
		//create a frame
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setTitle("Button Click Test");
		frame.setBounds(50, 50, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;

		//create a button
		JButton button1 = new JButton();
		button1.setText("Click me");
		button1.setBackground(Color.BLUE);
		button1.setBounds(50, 100, 100, 100);	
		
		//create a label
		JLabel label1 = new JLabel();
		label1.setText("hahaha");
		label1.setBackground(Color.RED);
		label1.setBounds(200,  200, 150, 50);
		
		//add button and label to the frame
		frame.add(button1);
		frame.add(label1);
		
		//add listener to the button
		//button1.addActionListener(new ButtonClickListener(label1));
		
		button1.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				label1.setText("hehehe");
			}
		});
	}

}

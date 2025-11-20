package one;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstSwing {
	public static void demo() {
		//JFrame frame = new JFrame();
		JFrame frame = new JFrame();
		System.out.println(frame);		
//		JButton button = new JButton();
//		button.setLabel("Click");
		JButton button = new JButton("Click"); 
//		System.out.println(button);		
		button.setBounds(550, 100, 100, 99);		
//		JButton button2 = new JButton("Click 2"); 
//		button2.setBounds(750, 100, 100, 99);		
		frame.add(button); 		
		//frame.setSize(1000, 1000);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}

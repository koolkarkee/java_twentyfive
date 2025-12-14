package one.layouts;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutExample {
	JFrame frame;
	JPanel panel;
	
	public BorderLayoutExample() {
		frame = new JFrame("BorderLayout Example");
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		panel = new JPanel();
		panel.add(new JButton("Yellow"));
		panel.add(new JButton("Red"));
		panel.add(new JButton("Green"));

		frame.add(panel, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new BorderLayoutExample();
	}

}

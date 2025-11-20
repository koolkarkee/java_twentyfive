package one;

import java.awt.Component;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	public MyFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
	
	@Override
	public Component add(Component comp) {
		System.out.println("A new component added");
		return super.add(comp);
	}
}

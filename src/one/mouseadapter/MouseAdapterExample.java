package one.mouseadapter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MouseAdapterExample extends MouseAdapter {
	JFrame frame;
	public MouseAdapterExample() {
		frame = new JFrame("Mouse Adapter Example");
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		Graphics g = frame.getGraphics();
		g.setColor(Color.RED);
		g.fillOval(e.getX(), e.getY(), 50, 50);
	}
	 
	public static void main(String[] args) {
		new MouseAdapterExample();
	}

}

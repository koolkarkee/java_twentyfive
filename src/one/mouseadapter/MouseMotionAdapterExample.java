package one.mouseadapter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

public class MouseMotionAdapterExample extends MouseMotionAdapter {
	JFrame frame;
	
	public MouseMotionAdapterExample() {
		frame = new JFrame("Mouse Motion Adapter Example");
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.addMouseMotionListener(this);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g = frame.getGraphics();
		g.setColor(Color.RED);
		g.fillOval(e.getX(), e.getY(), 50, 50);
	}
	
	public static void main(String[] args) {
		new MouseMotionAdapterExample();
	}
}

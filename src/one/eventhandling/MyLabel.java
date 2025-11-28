package one.eventhandling;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;

public class MyLabel extends JLabel {
	
	@Override
	public void setText(String text) {
		super.setText(text);
	}
	
	@Override
	public void setBackground(Color bg) {
		super.setBackground(Color.RED);
	}
	
	@Override
	public void setBounds(int x, int y, int width, int height) {
		super.setBounds(200,  200, 150, 50);
	}
	
	@Override
	public Component add(Component comp) {
		return super.add(comp);
	}

}

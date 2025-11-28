package one.eventhandling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class MyButtonEventListener implements ActionListener {
	private boolean toggled = false;
	private JLabel label;
	
	public MyButtonEventListener(JLabel label) {
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hello world");
		
		if(!toggled) {
			label.setText("hello world");
		}
		else {
			label.setText("hahahah");
		}
	}

}

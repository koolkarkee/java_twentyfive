package one.buttonclicktest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ButtonClickListener implements ActionListener {
	private JLabel label;
	
	public ButtonClickListener(JLabel label) {
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("heheheh");
		
		//label1 is recognized
		this.label.setText("heheheheh");
	}

}

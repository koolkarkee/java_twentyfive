package one.eventhandling;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonFrame extends JFrame {

	private JPanel buttonPanel;
	
	public ButtonFrame() {
		setSize(200, 200);
		
		JButton button1 = new JButton("Click me");
		
		//add the button1 to the buttonPanel
		buttonPanel.add(button1);
		
		//add panel to the frame
		add(buttonPanel);
		
		//create button action
		
		
	}
}

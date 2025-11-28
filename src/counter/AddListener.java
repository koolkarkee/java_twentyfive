package counter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class AddListener implements ActionListener {
	private JLabel labelPlus;
	private int counterValue = 0;
	
	public AddListener(JLabel labelPlus) {
		this.labelPlus = labelPlus;
		this.labelPlus.setText("0");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.counterValue++;
		this.labelPlus.setText(this.counterValue + "");
	}

}

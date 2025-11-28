package counter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class SubtractListener implements ActionListener {
	private int counterValue = 0;
	private JLabel labelMinus;
	
	public SubtractListener(JLabel labelMinus) {
		this.labelMinus = labelMinus;
		this.labelMinus.setText("0");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String counterValueText = this.labelMinus.getText();		
		this.counterValue = Integer.parseInt(counterValueText);
		
		if(this.counterValue == 0) return;
		
		this.counterValue--;
		this.labelMinus.setText(this.counterValue + "");		
	}

}

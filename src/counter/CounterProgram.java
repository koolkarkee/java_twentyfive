package counter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CounterProgram {

	public static void main(String[] args) {
		//create a frame
		JFrame frame = new JFrame("Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 500);		
		frame.setSize(500, 500);
		
		//create a label 
		JLabel label = new JLabel();
		
		//create a button 
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new AddListener(label));
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new SubtractListener(label));
		
		//create a panel with Flow Layout to place them side by side 
		JPanel panel = new JPanel();
		panel.add(buttonMinus);
		panel.add(label);
		panel.add(buttonPlus);
		
		//add panel to the frame
		frame.add(panel);
		frame.setVisible(true);
	}

}

package one.radio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Radio Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Radio buttons
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");
        
     // Group them so only one can be selected
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(other);

        JLabel status = new JLabel("Selected: None");
        
        // Event handling
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                status.setText("Selected: " + e.getActionCommand());
            }
        };
        
        male.addActionListener(listener);
        female.addActionListener(listener);
        other.addActionListener(listener);

        panel.add(male);
        panel.add(female);
        panel.add(other);
        panel.add(status);
        
        frame.add(panel);
        frame.setVisible(true);
	}

}

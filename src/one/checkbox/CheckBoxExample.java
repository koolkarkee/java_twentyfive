package one.checkbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Checkbox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JCheckBox checkBox = new JCheckBox("Enable Feature");

        JLabel statusLabel = new JLabel("Status: OFF");
        
     // Event handling
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (checkBox.isSelected()) {
                    statusLabel.setText("Status: ON");
                } else {
                    statusLabel.setText("Status: OFF");
                }
            }
        });

        panel.add(checkBox);
        panel.add(statusLabel);
        
        frame.add(panel);
        frame.setVisible(true);
	}

}

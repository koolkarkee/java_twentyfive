package one.combobox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("ComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Combo box items
        String[] languages = {"Java", "Python", "C++", "JavaScript", "Go"};

        JComboBox<String> comboBox = new JComboBox<>(languages);

        JLabel status = new JLabel("Selected: None");

     // Event handling
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                status.setText("Selected: " + selected);
            }
        });
        
        panel.add(comboBox);
        panel.add(status);

        frame.add(panel);
        frame.setVisible(true);
	}
}

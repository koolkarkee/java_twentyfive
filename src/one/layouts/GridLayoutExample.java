package one.layouts;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayoutExample {
	JFrame frame;
	
	public GridLayoutExample() {
		frame = new JFrame("Grid Layout Example");
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		// Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
		
        // Display field
        JTextField display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        mainPanel.add(display, BorderLayout.NORTH);
		
     // Buttons panel with GridLayout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5)); // rows, cols, hgap, vgap

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "(", ")", "%"
        };
        
        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            buttonPanel.add(btn);
        }
		
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutExample();
	}

}

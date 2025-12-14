package one.toolbar;

import javax.swing.*;
import java.awt.*;

public class ToolTipExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Tooltip Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton saveBtn = new JButton("Save");
        saveBtn.setToolTipText("Click to save your file");

        JButton openBtn = new JButton("Open");
        openBtn.setToolTipText("Click to open a file");

        JTextField textField = new JTextField(15);
        textField.setToolTipText("Enter your text here");

        JLabel label = new JLabel("Hover me");
        label.setToolTipText("This is a label tooltip");

        panel.add(saveBtn);
        panel.add(openBtn);
        panel.add(textField);
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);
	}

}

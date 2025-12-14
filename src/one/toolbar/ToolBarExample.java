package one.toolbar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToolBarExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Toolbar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Create toolbar
        JToolBar toolBar = new JToolBar();

        // Create toolbar buttons
        JButton newBtn = new JButton("New");
        JButton openBtn = new JButton("Open");
        JButton saveBtn = new JButton("Save");

        // Add buttons to toolbar
        toolBar.add(newBtn);
        toolBar.add(openBtn);
        toolBar.add(saveBtn);

        // Add a separator
        toolBar.addSeparator();

        JButton exitBtn = new JButton("Exit");
        toolBar.add(exitBtn);
        
     // Event handling
        ActionListener listener = e -> {
            String cmd = e.getActionCommand();
            JOptionPane.showMessageDialog(frame, "You clicked: " + cmd);
        };

        newBtn.addActionListener(listener);
        openBtn.addActionListener(listener);
        saveBtn.addActionListener(listener);
        exitBtn.addActionListener(e -> System.exit(0));

        // Add toolbar to frame (top area)
        frame.add(toolBar, BorderLayout.NORTH);

        frame.setVisible(true);
	}

}

package one.menubar;

import javax.swing.*;
import java.awt.event.*;

public class MenuBarExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Menu Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        
        // Create menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        JMenuItem aboutItem = new JMenuItem("About");
        
        // Add items to menus
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator(); // separator line
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        helpMenu.add(aboutItem);

     // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Add menu bar to frame
        frame.setJMenuBar(menuBar);
        
     // Event handling
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd = e.getActionCommand();
                JOptionPane.showMessageDialog(frame, "You clicked: " + cmd);
            }
        };
        
        // Attach listener to menu items
        newItem.addActionListener(listener);
        openItem.addActionListener(listener);
        exitItem.addActionListener(e -> System.exit(0)); // special case
        cutItem.addActionListener(listener);
        copyItem.addActionListener(listener);
        pasteItem.addActionListener(listener);
        aboutItem.addActionListener(listener);

        frame.setVisible(true);
	}

}

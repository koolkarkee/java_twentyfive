package one.popupmenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PopUpMenuExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Popup Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        // Create popup menu
        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        popupMenu.add(cutItem);
        popupMenu.add(copyItem);
        popupMenu.add(pasteItem);
        
        // Event handling for menu items
        ActionListener listener = e -> {
            String cmd = e.getActionCommand();
            JOptionPane.showMessageDialog(frame, "You clicked: " + cmd);
        };

        cutItem.addActionListener(listener);
        copyItem.addActionListener(listener);
        pasteItem.addActionListener(listener);

     // Show popup menu on right-click
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                showPopup(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                showPopup(e);
            }

            private void showPopup(MouseEvent e) {
                if (e.isPopupTrigger()) { // right-click
                    popupMenu.show(panel, e.getX(), e.getY());
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
	}

}

package one.fullswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class FullSwingInputsExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Full Swing Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 600);
        
        // menu bar
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitItem);
        
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Full Swing Form Example"));
        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);
        
        //toolbar
        JToolBar toolBar = new JToolBar();
        JButton newBtn = new JButton("New");
        newBtn.setToolTipText("Create new file");
        JButton saveBtn = new JButton("Save");
        saveBtn.setToolTipText("Save file");

        toolBar.add(newBtn);
        toolBar.add(saveBtn);
        frame.add(toolBar, BorderLayout.NORTH);

        //main panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 1, 10, 10));
        
        //label and textfield
        JLabel nameLabel = new JLabel("Enter your name:");
        JTextField nameField = new JTextField(15);
        nameField.setToolTipText("Type your name here");

        JButton showNameBtn = new JButton("Show Name");
        JLabel nameOutput = new JLabel("Your name will appear here");

        showNameBtn.addActionListener(e -> {
            nameOutput.setText("You entered: " + nameField.getText());
        });
        
        JPanel namePanel = new JPanel();
        namePanel.add(nameLabel);
        namePanel.add(nameField);
        namePanel.add(showNameBtn);
        namePanel.add(nameOutput);
        
        //textarea and button
        JLabel msgLabel = new JLabel("Enter your message:");
        JTextArea textArea = new JTextArea(4, 20);
        textArea.setToolTipText("Write something here");
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton showMsgBtn = new JButton("Show Message");
        JLabel msgOutput = new JLabel("Message will appear here");

        showMsgBtn.addActionListener(e -> {
            msgOutput.setText("Message: " + textArea.getText());
        });
        
        JPanel textAreaPanel = new JPanel();
        textAreaPanel.add(msgLabel);
        textAreaPanel.add(scrollPane);
        textAreaPanel.add(showMsgBtn);
        textAreaPanel.add(msgOutput);
        
        //checkbox
        JCheckBox checkBox = new JCheckBox("Enable Feature");
        JLabel checkStatus = new JLabel("Checkbox: OFF");

        checkBox.addItemListener(e -> {
            checkStatus.setText("Checkbox: " + (checkBox.isSelected() ? "ON" : "OFF"));
        });

        JPanel checkPanel = new JPanel();
        checkPanel.add(checkBox);
        checkPanel.add(checkStatus);
        
        //radio buttons
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(other);

        JLabel radioStatus = new JLabel("Selected: None");

        ActionListener radioListener = e -> {
            radioStatus.setText("Selected: " + e.getActionCommand());
        };
        male.addActionListener(radioListener);
        female.addActionListener(radioListener);
        other.addActionListener(radioListener);

        JPanel radioPanel = new JPanel();
        radioPanel.add(male);
        radioPanel.add(female);
        radioPanel.add(other);
        radioPanel.add(radioStatus);
        
        //combo box
        String[] langs = {"Java", "Python", "C++", "JavaScript"};
        JComboBox<String> combo = new JComboBox<>(langs);

        JLabel comboStatus = new JLabel("Selected: None");

        combo.addActionListener(e -> {
            comboStatus.setText("Selected: " + combo.getSelectedItem());
        });

        JPanel comboPanel = new JPanel();
        comboPanel.add(combo);
        comboPanel.add(comboStatus);
        
        //slider 
        JSlider slider = new JSlider(0, 100, 50);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);

        JLabel sliderStatus = new JLabel("Value: 50");

        slider.addChangeListener(e -> {
            sliderStatus.setText("Value: " + slider.getValue());
        });
        
        JPanel sliderPanel = new JPanel();
        sliderPanel.add(slider);
        sliderPanel.add(sliderStatus);
        
        //pop up menu 
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);

        ActionListener popupListener = e -> {
            JOptionPane.showMessageDialog(frame, "You clicked: " + e.getActionCommand());
        };

        cut.addActionListener(popupListener);
        copy.addActionListener(popupListener);
        paste.addActionListener(popupListener);

        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) { showPopup(e); }
            public void mouseReleased(MouseEvent e) { showPopup(e); }

            private void showPopup(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(panel, e.getX(), e.getY());
                }
            }
        });
        
        //add all panels
        panel.add(namePanel);
        panel.add(textAreaPanel);
        panel.add(checkPanel);
        panel.add(radioPanel);
        panel.add(comboPanel);
        panel.add(sliderPanel);

        frame.add(panel);
        frame.setVisible(true);
        
        

	}

}

package one.keyadapter;

import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class KeyAdapterExample extends KeyAdapter {
	JFrame frame;
	Label label;
	TextArea textArea; 
	
	public KeyAdapterExample() {
		frame = new JFrame("Key Adapter Example"); 
		label = new Label();
		label.setBounds(20, 50, 200, 20);
		textArea = new TextArea();
		textArea.setBounds(20, 80, 300, 300);
		
		textArea.addKeyListener(this);
		frame.add(label);
		frame.add(textArea);
		
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);				
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		String text = textArea.getText();
		String words[] = text.split("\\s");
		label.setText("Words: " + words.length + " Characters: " + text.length());
	}
	
	public static void main(String[] args) {
		new KeyAdapterExample();
	}

}

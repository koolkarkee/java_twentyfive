package one;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingHello {

	public static void main(String[] args) {
		//MyFrame frame = new MyFrame();
		GraphicsConfiguration gc = new GraphicsConfiguration() {
			
			@Override
			public AffineTransform getNormalizingTransform() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public GraphicsDevice getDevice() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public AffineTransform getDefaultTransform() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ColorModel getColorModel(int transparency) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ColorModel getColorModel() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Rectangle getBounds() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		//JFrame frame = new JFrame("Hello", gc);
		JFrame frame = new JFrame("Hello");
		frame.setResizable(true);

//		JButton button = new JButton();
//		button.setLabel("Click");
		JButton button = new JButton("Click"); 
//		System.out.println(button);		
		button.setBounds(550, 100, 100, 99);		
//		JButton button2 = new JButton("Click 2"); 
//		button2.setBounds(750, 100, 100, 99);		
		frame.add(button); 		
		frame.setSize(1000, 1000);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

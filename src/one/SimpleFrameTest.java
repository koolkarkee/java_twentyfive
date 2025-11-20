package one;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SimpleFrameTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			SimpleFrame sf = new SimpleFrame();
			sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			sf.setVisible(true);
			System.out.println(sf.isLocationByPlatform());
		}); 
	}

}

class SimpleFrame extends JFrame {
	public SimpleFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension d = kit.getScreenSize();
		int width = d.width;
		int height = d.height;
		
		setSize(width/2, height/2);
		setTitle("Simple Frame");
		
//		ImageIcon imgIcon = new ImageIcon("www_icon.gif");
		Image img = new ImageIcon("./src/resources/wwwicon.gif").getImage();
		setIconImage(img);
	}
}
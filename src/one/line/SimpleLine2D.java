package one.line;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class SimpleLine2D extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5)); // line thickness
        g2.setColor(Color.GREEN);

        // Create a Line2D from (50,50) to (250,150)
        Line2D line = new Line2D.Double(50, 50, 50, 150);
        g2.draw(line);
	}
}

package one.slider;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SliderExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Slider Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create slider: min=0, max=100, initial=50
        JSlider slider = new JSlider(0, 100, 50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        
        JLabel valueLabel = new JLabel("Value: 50");

        // Event handling
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                valueLabel.setText("Value: " + value);
            }
        });
        
        panel.add(slider);
        panel.add(valueLabel);

        frame.add(panel);
        frame.setVisible(true);
	}
}

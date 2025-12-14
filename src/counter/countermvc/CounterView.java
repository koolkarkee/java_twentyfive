package counter.countermvc;
import javax.swing.*;
import java.awt.*;

public class CounterView extends JFrame {
	 public JLabel label;
	 public JButton button;
	 
	 public CounterView() {
		setTitle("MVC Counter Example");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Count: 0");
        button = new JButton("Increment");

        setLayout(new FlowLayout());
        add(label);
        add(button);

        setVisible(true);
	 }
}

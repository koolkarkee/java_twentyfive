package counter.countermvc;
import java.awt.event.*;

public class CounterController {
	private CounterModel model;
    private CounterView view;
    
    public CounterController(CounterModel model, CounterView view) {
        this.model = model;
        this.view = view;

        // Handle button click
        view.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.increment();
                view.label.setText("Count: " + model.getCount());
            }
        });
    }
}

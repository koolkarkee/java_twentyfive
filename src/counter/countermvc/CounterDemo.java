package counter.countermvc;

public class CounterDemo {

	public static void main(String[] args) {
		CounterModel model = new CounterModel();
        CounterView view = new CounterView();
        new CounterController(model, view);
	}

}

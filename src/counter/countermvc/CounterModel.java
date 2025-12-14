package counter.countermvc;

public class CounterModel {
	private int count = 0;

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }
}

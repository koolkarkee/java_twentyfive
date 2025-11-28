package one.eventhandling;

public class MyDeveloper implements IDeveloperTask {

	@Override
	public void build() {
		System.out.println("I have built the app and sold!");		
	}
}

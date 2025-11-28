package one.eventhandling;

public class TestInterface {

	public static void main(String[] args) {
		MyDeveloper d1 = new MyDeveloper();
		//d1.build();
		
		IDeveloperTask d2 = new MyDeveloper();
		//d2.build();

		IDeveloperTask d3 = new MyRealEstateConstructor();
		//d3.build();
		
		MyBuild myBuild = new MyBuild();
		myBuild.doSomething(d3);
	}

}

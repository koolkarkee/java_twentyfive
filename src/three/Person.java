package three;

public class Person implements java.io.Serializable {
	//default constructor
	public Person() {
		//this is called whenever a new object is created
		System.out.println("Default constructor called >>");
	}
	
	//attributes, properties
	//name, age
	private String name;
	private int age;
	
	//getters and setters => public methods
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}

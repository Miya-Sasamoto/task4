package check;

public class Check2 {
	
	private String firstName;
	private String lastName;
	private int age;

	
public Check2 (String firstName, String lastName, int age) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	}

	protected String getFirstName() {
		return firstName;
	}
	
	protected String getLastName() {
		return lastName;
	}
	
	protected int getAge() {
		return age;
	}

}


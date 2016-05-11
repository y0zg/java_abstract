/**
 * Created by webstddesign on 11.05.2016.
 */
public abstract class Employee {
	private final String firstName; //we don't use set methods , once variables get values
	// through constructor, they won't be changed again
	private final String lastName;
	private final String securityNumber;

	Employee(String firstName, String lastName, String securityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.securityNumber = securityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSecurityNumber() {
		return securityNumber;
	}
//return String representation of Employee object
	@Override
	public String toString() {
		return String.format("%s%n %s%n security number:%s",
				getFirstName(), getLastName(), getSecurityNumber())
	}
//abstract methods must be overriden by concrete subclasses
	public abstract earnings(); //no implementation here

}

package model;

public class Employee {
	private String firstname;
	private String lastname;

	public Employee(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;

	}

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Employee (firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}

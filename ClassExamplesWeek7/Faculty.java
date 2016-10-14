/**
	Class to represent a USF Faculty member.
**/
public class Faculty extends USFPerson {

	private String department;

	//constructor
	public Faculty(String name, int id, String department) {
		super(name, id);
		this.department = department;
	}

	//getters
	public String getDepartment() {
		return this.department;
	}

	public double getEmailQuota() {
		return 5.0;
	}

	/**
		Overrides the toString method of superclass.
	**/
	public String toString() {

		return super.toString() + " Department: " + department;

	}

}
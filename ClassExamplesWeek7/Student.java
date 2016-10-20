/**
	Class to represent a USF Student.
**/
public class Student extends USFPerson {
	
	private String classYear;
	private String major;

	//constructor
	public Student(String name, int id, 
						String classYear, String major) {

		super(name, id); //call to superclass constructor must be first!
		this.classYear = classYear;
		this.major = major;
		
	}

	//getters
	public String getClassYear() {
		return this.classYear;		
	}

	public String getMajor() {
		return this.major;
	}

	/**
		Implementation of abstract method from superclass.
	**/
	public double getEmailQuota() {
		return 1.0;
	}

	/**
		Overrides the toString method of superclass.
	**/
	public String toString() {

		//OPTION 1: call the parent toString method
		//			partial overriding
		String parentString = super.toString();
		return parentString + " Class: " + classYear + " Major: " + major;

		//OPTION 2: directly access protected members from parent.
		// return "Name: " + name + " ID: "+ id + " Class: " + classYear + " Major: " + major;
	
		//OPTION 3: use the super class getName and getId methods
		// String localName = super.getName();
		// int localId = super.getId();
		// return "Name: " + localName + " ID: "+ localId + 
		// 			" Class: " + classYear + " Major: " + major;
	}

}


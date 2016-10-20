/**
	A class defining data and functionality for any person
	associated with USF. Class is abstract and cannot be instantiated.
**/
public abstract class USFPerson implements Comparable<USFPerson> {

	//data members declared as protected
	//so that they are available to the child classes
	protected String name;
	protected int id;

	//constructor
	public USFPerson(String name, int id) {
		this.name = name;
		this.id = id;
	}

	/**
		All classes that extend USFPerson must implement a method
		to return the email quota of the person.
	**/
	public abstract double getEmailQuota();

	//getters
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}

	/**
		String representation of USFPerson
	**/
	public String toString() {
		return "Name: " + name + " ID: " + id;
	}

	public int compareTo(USFPerson other) {

		if(this.name.equals(other.getName())) {
			return this.id - other.getId();
		}
		return this.name.compareTo(other.getName());

		// OPTION 2: more explicitly spells out logic
		// if(this.name.compareTo(other.getName()) == 0 &&
		// 	this.id == other.getId()) {
		// 	return 0;
		// } else if ( (this.name.compareTo(other.getName()) < 0) || 
		// 				(this.name.compareTo(other.getName()) == 0 && 
		// 					this.id < other.getId())) {
		// 	return -1;
		// } else {
		// 	return 1;
		// }



	}



}
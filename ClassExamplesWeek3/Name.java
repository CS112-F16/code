public class Name {

	//data members
	private String first;
	private String last;
	private char middle;

	//getters
	public String getFirst() {
		return this.first;
	}

	public String getLast() {
		return this.last;
	}
	
	public char getMiddle() {
		return this.middle;
	}

	//setters
	public void setLast(String last) {
		this.last = last;
	}

	//other methods
	public String toString() {
		return "First: " + this.first + 
				" Middle: " + this.middle + 
				" Last: " + this.last;
	}

	public boolean equals(Name other) {

		System.out.println("Comparing " + this.toString() + " and " + other.toString());

		if(this.first.equals(other.getFirst()) &&
			this.last.equals(other.getLast()) &&
				this.middle == other.getMiddle()) {
			return true;
		} 
		return false;
		


	}

	//constructor(s)
	public Name(String first, String last, char middle) {
		this.first = first;
		this.last = last;
		this.middle = middle;
	}
}	
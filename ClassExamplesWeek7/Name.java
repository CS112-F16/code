public class Name implements Viewable, Comparable<Name> {

	//data members
	private String first;
	private String last;

	//getters
	public String getFirst() {
		return this.first;
	}

	public String getLast() {
		return this.last;
	}

	//setters
	public void setLast(String last) {
		this.last = last;
	}

	//other methods
	public String toString() {
		return "First: " + this.first + 
				" Last: " + this.last;
	}

	public boolean equals(Name other) {

		if(this.first.equals(other.getFirst()) &&
			this.last.equals(other.getLast())) {
			return true;
		}
		return false;

	}

	public int compareTo(Name other) {

		//if last names are the same
		// return the comparison of the first names
		//return the comparison of the last names
		//if(this.last.equals(other.getLast())) {
		if(this.last.compareTo(other.getLast()) == 0) {
			return this.first.compareTo(other.getFirst());
		}
		return this.last.compareTo(other.getLast());


	}

	public void display() {
		System.out.println("First: " + first + " Last: " + last);
	}

	//constructor(s)
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
}	
/**
	A class to hold information about a single student.
	A student has a name and a score.
	@author Sami Rollins
**/
public class Student {

	//data members
	private String name;
	private int score;

	//methods
	//getters for both data members
	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}

	//a setter for generous professors who are 
	//willing to modify student scores
	public void setScore(int score) {
		this.score = score;
	}

	//returns a string representation of the object
	public String toString() {
		return "Name: " + this.name + " Score: " + this.score;
	}

	//constructor
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

}
/**
	A class to build a list of Students, display all student
	information, and display the average student score.
	@author Sami Rollins
**/
public class StudentScoresDriver {

	public static void main(String[] args) {

		//use the StudentListBuilder to build a StudentList from the file students.txt
		StudentListBuilder builder = new StudentListBuilder();
		StudentList list = builder.buildStudentList("students.txt");

		//print information about all Students
		System.out.println(list);

		//print the average score of all Students
		System.out.println("Average score: " + list.calculateAverage());
	}

}
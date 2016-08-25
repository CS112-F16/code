/*

	A program that calculates a final letter grade based on 
	scores for exams, homework, and projects.

	Exams are worth 100 points and 30% of the final grade.
	Homework is worth 100 points and is 10% of the final grade.
	Projects are worth 200 points and are 60% of the final grade.

	Final scores > 90% earn an A.
	Final scores > 80% earn an B.
	Final scores > 70% earn an C.
	Final scores <= 70% earn an F.

	@author Sami Rollins

*/
import java.util.Scanner;

public class GradeCalculator {


	public static void main(String[] args) {

		//declare constants to hold distribution
		final double EXAM_PERCENT = .3;
		final double HW_PERCENT = .1;
		final double PROJ_PERCENT = .6;

		//declare constants to hold max points 
		final int MAX_EXAM = 100;
		final int MAX_HW = 100;
		final int MAX_PROJECT = 200;

		//declare constants to hold min values for letters
		final int MIN_A = 90;
		final int MIN_B = 80;
		final int MIN_C = 70;

		//set earned points
		Scanner in = new Scanner(System.in);

		System.out.println("Enter exam points: ");
		int earnedExam = in.nextInt();

		System.out.println("Enter homework points: ");
		int earnedHomework = in.nextInt();

		System.out.println("Enter project points: ");
		int earnedProject = in.nextInt();		

		//calculate grade
		double exam = ((double)earnedExam)/MAX_EXAM;
		double homework = ((double)earnedHomework)/MAX_HW;
		double project = ((double)earnedProject)/MAX_PROJECT;	
		double finalGrade = (exam * EXAM_PERCENT) +
							(homework * HW_PERCENT) +
							(project * PROJ_PERCENT);
		finalGrade = finalGrade * 100;

		//print result
		String letter = null;
		if(finalGrade > 90) {	
			letter = "A";
		} else if(finalGrade > 80) {
			letter = "B";
		} else if(finalGrade > 70) {
			letter = "C";
		} else {
			letter = "F";
		}
		System.out.printf("With a final grade of %3.1f you earn a letter grade of %s.\n", finalGrade, letter);


	}


}
public class TwoDArrays {

	/**
		Initialize array.
		Note the parameter is a reference so any changes
		made by the method will be reflected in the reference
		passed in by the driver.
	**/
	public static void initialize(double[][] scores) {
		//set scores for student 0
		scores[0][0] = 95;
		scores[0][1] = 78;
		scores[0][2] = 88;

		//set scores for student 1
		scores[1][0] = 77;
		scores[1][1] = 75;
		scores[1][2] = 73;

		//set scores for student 2
		scores[2][0] = 95;
		scores[2][1] = 77;
		scores[2][2] = 30;

		//set scores for student 3
		scores[3][0] = 30;
		scores[3][1] = 70;
		scores[3][2] = 88;

		//set scores for student 4
		scores[4][0] = 99;
		scores[4][1] = 76;
		scores[4][2] = 88;
	}

	/**
		Display all student grades in the format:
		Student 0: 95 78 88
		Student 1: 77 75 73
	**/
	public static void display(double[][] scores) {

		for(int row = 0; row < scores.length; row++) {

			System.out.print("Student " + row + ": ");
			
			for(int col = 0; col < scores[row].length; col++) {
				System.out.print(scores[row][col] + " ");
			} 
			
			System.out.println();

		}


	}

	/**
		Return a one-dimensional array containing the average score
		for each student.
		The result at position 0 will contain the average for student 0.
	**/
	public static double[] averages(double[][] scores) {
		
		double[] returnValue = new double[scores.length];

		
		for(int r = 0; r < scores.length; r++) {
			double sum = 0;

			for(int c = 0; c < scores[r].length; c++) {
				sum = sum + scores[r][c];
			}
			
			double avg = sum/scores[r].length;
			returnValue[r] = avg;

		}

		return returnValue;

	}

	/**
		Return the highest score from any student on any assignment.
	**/
	public static double highScore(double[][] scores) {

		double big = scores[0][0];

		for(double[] row: scores) {

			for(double score: row) {

				if(score > big) {
					big = score;
				}

			}			

		}
		return big;
	}



}
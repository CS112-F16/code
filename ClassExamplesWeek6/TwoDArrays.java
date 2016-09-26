public class TwoDArrays {

	public static void initialize(double[][] scores) {
		//set scores for student 0
		scores[0][0] = 95;
		scores[0][1] = 78;
		scores[0][2] = 88;

		//set scores for student 1
		scores[1][0] = 77;
		scores[1][1] = 75;
		scores[1][2] = 73;

	}

	public static void display(double[][] scores) {

	}

	public static double[] averages(double[][] scores) {
	}


	public static double highScore(double[][] scores) {
	}

	public static void main(String[] args) {

		double[][] scores = new double[5][3];
		
		initialize(scores);

		display(scores);

		System.out.print("Averages: ");
		for(double d: averages(scores)) {
			System.out.print(d + " ");
		}
		System.out.println();

		System.out.println("High score: " + highScore(scores));

	}

}
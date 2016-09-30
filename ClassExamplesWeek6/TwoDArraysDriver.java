public class TwoDArraysDriver {

	public static void main(String[] args) {

		double[][] scores = new double[5][3];
		
		TwoDArrays.initialize(scores);

		TwoDArrays.display(scores);

		System.out.print("Averages: ");
		for(double d: TwoDArrays.averages(scores)) {
			System.out.print(d + " ");
		}
		System.out.println();

		System.out.println("High score: " + TwoDArrays.highScore(scores));

	}

}
public class ArraySyntax {

	public static void main(String[] args) {

		int SIZE = 2;
		int count = 0;


		double[] scores = new double[SIZE];

		if(count < SIZE) {
			scores[count++] = 98.4;
		}
		if(count < SIZE) {
			scores[count++] = 934.6;
		}
		if(count < SIZE) {
			scores[count++] = 434.63;
		} else {

			double[] newScores = new double[SIZE*2];
			for(int i = 0; i < SIZE; i++) {
				newScores[i] = scores[i];
			}
			scores = newScores;
			SIZE = SIZE*2; //scores.length

		}

		if(count < SIZE) {
			scores[count++] = 434.63;
		}


		// Student[] students = new Student[SIZE];

		// students[count++] = new Student("bob", 76);

		// for(int i = 0; i < count; i++) {
		// 	System.out.println(students[i].getName());
		// }



		// int[] numbers = new int[SIZE];		

		// double[] scores = new double[30];



		// int count = 0;

		// numbers[count++] = 98;
		// numbers[count++] = 5;

		// for(int i = 0; i < count; i++) {
		// 	System.out.println(numbers[i]);
		// }

	}
}
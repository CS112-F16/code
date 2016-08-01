/**
	A class to demonstrate random number generation in Java.

	@author Sami Rollins

**/
import java.util.Random;

public class Randomize {

	public static void main(String[] args) {

		final int MAX = 3; //constant to track the max random value chosen
		Random r = new Random(); //create object of type Random
		int choice = r.nextInt(MAX) + 1; //choose a number 0 to MAX-1, and add 1 to get 1-MAX
		System.out.println("Choice: " + choice);

	}

}
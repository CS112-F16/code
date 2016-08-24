/*
	A class to calculate the total value of a 
	collection of coins.
	@author Sami Rollins
*/
public class CoinValue {
	
	public static void main(String[] args) {

		//declare variables to hold values of different coins
		final double PENNY = .01; //penny value
		final double NICKEL = .05;
		final double DIME = .1;
		final double QUARTER = .25;

		//declare variables to hold count of each type of coin
		int numPennies = 5;
		int numNickels = 4;
		int numDimes = 7;
		int numQuarters = 2;

		//calculate total value of coins
		double sum;
		sum = (PENNY * numPennies) +
				(NICKEL * numNickels) +
				(DIME * numDimes) +
				(QUARTER * numQuarters);

		//display result
		System.out.println("Coin Value: " + sum);
	}


}
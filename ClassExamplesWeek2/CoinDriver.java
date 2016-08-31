import java.util.Scanner;

/**
	Coin flipping game.
**/
public class CoinDriver {

	public static void main(String[] args) {

		//create a new Coin object
		Coin c = new Coin();

		//prepare to ask for user input
		Scanner input = new Scanner(System.in);

		String guess = null;

		//prompt the user for a guess
		System.out.println("Heads or tails?");
		guess = input.nextLine();

		//if the user entered a bad guess, game over
		if(!guess.equals("heads") && !guess.equals("tails")) {
			System.out.println("Bad input, thanks for playing");
		} else {
			//flip the coin and determine whether the user has won
			c.flip();
			if(c.isHeads() && guess.equals("heads") ||
				!c.isHeads() && guess.equals("tails")) {
				System.out.println("you guessed " + guess + " and " + c.toString());
				System.out.println("you win!");
			} else {
				System.out.println("you guessed " + guess + " and " + c.toString());
				System.out.println("you lose...");
			}
		}


	}

}
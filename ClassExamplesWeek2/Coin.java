import java.util.Random;
/**
	A class to represent a coin that may be flipped.
**/
public class Coin {

	//data member to represent whether the coin is heads or tails
	private boolean isHeads;

	/**
		Construct a new Coin that is initially showing tails.
	**/
	public Coin() {
		this.isHeads = false;
	}

	/**
		Flip the coin by randomly choosing heads or tails and
		return the side of the coin currently showing.
	**/
	public boolean flip() {
		Random r = new Random();
		isHeads = r.nextBoolean();
		return isHeads;
	}

	/**
		Return the side of the coin currently showing.
	**/
	public boolean isHeads() {
		return isHeads;
	}

	/**
		Return a string representation of the coin.
	**/
	public String toString() {
		String returnValue = "coin shows: " ;
		if(isHeads == true) {
			returnValue = returnValue + "heads";
		} else {
			returnValue = returnValue + "tails";
		}
		return returnValue;

	}
}
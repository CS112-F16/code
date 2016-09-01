/**
	A class to generate a user login name given a user's first name, last name, and middle initial.
 **/

import java.util.Random;

public class UserNameGenerator {

	/*
		Creates a username from the given Name.
		The username is the first two characters of the first name, 
		followed by the middle initial, followed by the first five
		characters of the last name, followed by a random number
		from 0 to 100.
		The username returned should be all lower case letters.		
	*/


	public String generateUserName(Name name) {

		String first = name.getFirst();
		String last = name.getLast();
		char middle = name.getMiddle();

		String firstPart = first.substring(0, 2);

		String lastPart = null;
		if(last.length() < 5) {
			lastPart = last;
		} else {
			lastPart = last.substring(0, 5);
		}

		Random r = new Random();
		int number = r.nextInt(100)+1;

		String returnValue = firstPart + middle + lastPart;
		returnValue = returnValue.toLowerCase();

		return returnValue + number;

	}


}
/**
	A class to demonstrate file input in Java.
	@author Sami Rollins
**/
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileInputNumbers {

	public static void main(String[] args) {

		File inputFile = new File("numbers.txt");
		//create an ArrayList to store the numbers read
		//from the input
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		//try-with-resources
		try (Scanner input = new Scanner(inputFile)) {

			//read in file
			while(input.hasNext()) {
				//add each number to the ArrayList				
				int number = input.nextInt();				
				numbers.add(number);
			}


		} catch(FileNotFoundException fnf) {
			System.out.println("File not found.");
			//System.out.println(fnf.getMessage());
			//fnf.printStackTrace();
			System.exit(1);
		}

		//use the static method sort of Collections
		Collections.sort(numbers);

		//use a for-each loop to print all
		//numbers in the list
		for(int number: numbers) {
			System.out.println(number);
		}

	}

}
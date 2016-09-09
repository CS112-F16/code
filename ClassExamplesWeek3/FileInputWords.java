/**
	A class to demonstrate file input in Java.
	@author Sami Rollins
**/
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class FileInputWords {

	public static void main(String[] args) {

		//uses a relative path so words.txt
		//must be a file in the directory
		//where this program is run
		File inputFile = new File("words.txt");

		//uses a try-with-resources 
		try (Scanner input = new Scanner(inputFile)) {

			//read in file
			while(input.hasNext()) {

				String line = input.nextLine();				
				System.out.println(line);
			}


		} catch(FileNotFoundException fnf) {
			System.out.println("File not found.");
			System.out.println(fnf.getMessage());
			//fnf.printStackTrace();
			System.exit(1);
		}


	}

}
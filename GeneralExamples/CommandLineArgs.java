import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;


public class CommandLineArgs {
	public static void main(String[] args) {

		String fileName = "hashdelimiter.txt";
		File file = new File(fileName);
		try (Scanner input = new Scanner(file)) { 
			input.useDelimiter("#");

			while(input.hasNext()) {
				String nextToken = input.next();
				System.out.println(nextToken);
			}
		} catch(FileNotFoundException fnf) {
			System.out.println("File not found.");
			System.out.println(fnf.getMessage());
			System.exit(1);
		}


	}
}
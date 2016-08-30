import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

import java.util.Scanner;


/**
  * A class to demonstrate one method of file input in Java.
  * 
  * @author Sami Rollins
 **/
public class SearchAndReplaceWithOutput {

	public static void main(String[] args) {

		//if the appropriate arguments are not passed as input
		//print an error and exit the program
		if(args.length != 4) {
			System.out.println("usage: java SearchAndReplace <infile> <outfile> <searchTerm> <replaceTerm>");
			System.out.println("\texample: java SearchAndReplace in.txt out.txt hello goodbye");
			System.exit(1); //exit the program 
		}

		//store the command line arguments in temporary variables
		String inFileName = args[0];
		String outFileName = args[1];
		String search = args[2];
		String replace = args[3];

		//create an object wrapper around the file
		File inputFile = new File(inFileName); 

		//open the input file in a
		//try-with-resources block
		try (Scanner input = new Scanner(inputFile);
			PrintWriter output = new PrintWriter(new FileWriter(outFileName))) { 
			while(input.hasNext()) {
				String line = input.nextLine(); //read in the next line of the input

				//replace all instances of the search term with the replace
				//term
				//note: strings are immutable, so we need to save the result
				line = line.replaceAll(search, replace); 
				//send result to output file
				output.println(line);
			}
		} catch(FileNotFoundException fnf) {
			System.out.println("File not found.");
			System.out.println(fnf.getMessage());
			System.exit(1);
		} catch(IOException ioe) {
			System.out.println("Problem with output file.");
			System.out.println(ioe.getMessage());
			System.exit(1);			
		}

	}

}
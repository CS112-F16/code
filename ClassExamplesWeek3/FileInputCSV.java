/**
	A class to demonstrate file input in Java.
	@author Sami Rollins
	**/
	import java.io.File;
	import java.io.FileNotFoundException;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	public class FileInputCSV {

		public static void main(String[] args) {
			
			//verify command line argument provided
			if(args.length != 1) {					
				System.out.println("usage: java FileInputCSV <filename>");
				System.exit(1);				
			}

			//store command line argument as filename
			String filename = args[0];

			//create ArrayLists to hold data from file
			ArrayList<String> names = new ArrayList<String>();
			ArrayList<Integer> scores = new ArrayList<Integer>();
			
			//open file
			File inputFile = new File(filename);
			try(Scanner input = new Scanner(inputFile)) {

				//set delimiter to be either comma or newline
				input.useDelimiter(",|\n");

				//TODO: this will break if the file is malformed
				//and does not have a score for every name
				while(input.hasNext()) {
					//read in a name and store in a list
					String name = input.next();
					names.add(name);
					//read in a score and store in a list
					int score = input.nextInt();
					scores.add(score);
				}

			} catch(FileNotFoundException fnf) {
				System.out.println("File not found.");
				System.exit(1);
			}

			//print the contents of both lists
			//if one list is longer than the other the last
			//elements will be ignored
			for(int i = 0; (i < scores.size() && i < names.size()); i++) {
				String name = names.get(i);
				int score = scores.get(i);
				System.out.println("Name: " + name + " Score: " + score);
			}

		}

	}
/**
	A class that demonstrates how to create and use an 
	ArrayList.
	@author Sami Rollins
**/
//java.util.ArrayList must be imported before it may be used.
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		//An example that creates an ArrayList of 
		//Strings, adds several strings, and prints
		//the list using a standard for loop.
		ArrayList<String> words = new ArrayList<String>();
		words.add("hello");
		words.add("goodbye");
		words.add("computer science!");

		//note, this loop uses the Java increment operator
		for(int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			System.out.println(word);
		}

		//separating the output
		System.out.println("\n***************\n");

		//An example that creates an ArrayList
		//of Integer, add several ints, and 
		//prints the list using a for-each loop.
		//Note that Java automatically converts
		//from primitive types to their object
		//wrappers.
		//see: https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(4);
		numbers.add(28);

		for(int number: numbers) {
			System.out.println(number);s
		}

		//Even though the get method returns an
		//Integer it is automatically converted to 
		//an int
		int number = numbers.get(0);

		//separating the output
		System.out.println("\n***************\n");


		//An example that creates an ArrayList of 
		//Names, adds several Names, and prints 
		//the list using a for-each loop.
		//To compile this example make sure that 
		//the Name class is in the same directory
		//and compiled at the same time.		
		Name n1 = new Name("Bob", "Smith", 'J');
		Name n2 = new Name("Bob", "Smith", 'J');
		Name n3 = new Name("Bob", "Smith", 'J');

		ArrayList<Name> names = new ArrayList<Name>();
		names.add(n1);
		names.add(n2);

		//Java for-each loop
		for(Name name: names) {
			//Note this will automatically call the
			//toString method on name.			
			System.out.println(name); 
		}

		//should print false
		System.out.println("names.contains(n3): " + names.contains(n3));

		names.set(0, n3);

		//should print true
		System.out.println("names.contains(n3): " + names.contains(n3));

		
	}

}
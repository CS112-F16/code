/**
	A class to demonstrate several methods that use recursion.
**/
public class RecursionFun {

	/**
		Uses recursion to calculate factorial.
	**/
	public static int factorial(int n) {
		//base case is if n is 1
		if(n == 1) {
			return 1;
		}
		//recurse
		return n * factorial(n-1);
	}

	/**
		Uses recursion to print the input string one character
		at a time, one character per line. May only use the string methods
		length, substring, and charAt.
	**/
	public static void printString(String s) {

		//if the string is empty do nothing (exit the method)
		if(s.length() == 0) {
			return;
		}

		//print a single letter
		System.out.println(s.charAt(0));
		//recurse with a smaller string
		printString(s.substring(1));

		//swapping the order of the previous two
		//lines of code results in printing the string
		//backward
	}

	/**
		Uses recursion to count the number of the character
		'a' that appears in a string.
	**/
	public static int countAs(String s) {

		//base case
		if(s.length() == 0) {
			return 0;
		}

		//alternative base case
		//stops when string is length 1 rather than 0
		// if(s.length() == 1) {
		// 	if(s.charAt(0) == 'a') {
		// 		return 1;
		// 	} else {
		// 		return 0;
		// 	}
		// }

		//version that uses a local variable
		//to keep track of result
		// int count = 0;
		// if(s.charAt(0) == 'a') {
		// 	count++;
		// }

		// int asInRest = countAs(s.substring(1));
		// return (count + asInRest);

		//recurse
		if(s.charAt(0) == 'a') {
			return 1 + countAs(s.substring(1));
		}
		return countAs(s.substring(1));

	}

	/**
		A method that uses iteration to calculate factorial.
	**/
	public static int factorialIterative(int n) {
		int product = 1;
		for(int i = n; i > 0 ; i--) {
			product *= i;
		}
		return product;
	}

	/**
		Uses recursion to print the numbers 0 to n on a single line.
	**/
	public static void printNums(int n) {
		printNums(n, 0);
	}

	/**
		Helper method that keeps track of how many
		numbers have already been printed.
	**/
	private static void printNums(int n, int count) {

		if(count == n) {
			System.out.println(n);
			return;
		}

		System.out.print(count + " ");
		printNums(n, count+1);

	}

	/**
		Prints a single row of n stars.
	**/
	public static void printStarRow(int n) {
		if(n == 1) {
			System.out.println("*");
			return;
		}
		System.out.print("*");
		printStarRow(n-1);
	}

	/**
		Prints an nxn square of stars.
	**/
	public static void printSquare(int n) {

		printSquare(n, 0);

	}

	/**
		Helper method to print an nxn square of stars.
	**/	
	private static void printSquare(int n, int count) {
		if(n == count) {
			return;
		}
		printStarRow(n);
		printSquare(n, count+1);
	}


	public static void main(String[] args) {

		//printStarRow(3);
		printSquare(3);


		// System.out.println(factorial(5));
		// printString("hello");
		// printNums(3);
		// System.out.println(countAs("lala"));

	}


}
/**
	A class to store a list of integers.
	Values will be stored in an array.
**/
public class NumberList {
	
	//data members
	private int[] numbers;
	private int count;

	/**
		Construct an empty list.
	**/
	public NumberList() {

		numbers = new int[2];
		count = 0;		

	}

	/**
		Private method as it will not be invoked anywhere outside of
		the class. 
		Method will create a new array of twice the size and copy over
		all elements of the existing array.
	**/
	private void resize() {

		int[] newArray = new int[numbers.length*2];

		for(int i = 0; i < numbers.length; i++) {
			newArray[i] = numbers[i];
		}
		numbers = newArray;

	}

	/**
		Insert a new number at the beginning of the list.
		@param - newNumber
	**/
	public void addFirst(int newNumber) {

		if(count >= numbers.length) {
			resize();
		}

		for(int i = count; i > 0; i--) {
			numbers[i] = numbers[i-1];
		}

		numbers[0] = newNumber;
		count++;
	}

	/**
		Remove the first item in the list.
		If the list is empty, do nothing.
	**/
	public void removeFirst() {

		if(count > 0) {
			for(int i = 0; i < count-1; i++) {
				numbers[i] = numbers[i+1];
			}

			count--;
		}
	}


	/**
		Returns true if the list contains any duplicate
		numbers.
	**/
	public boolean containsDuplicates() {

		for(int i = 0; i < count-1; i++) {

			for(int j = i+1; j < count; j++) {
				if(numbers[i] == numbers[j]) {
					return true;
				}
			}
		}

		return false;
	}
 

	/**
		Return a string representation of the list in the format
		{23, 4, 23, 66, 2}
		23 4 23 66 2
	**/
	public String toString() {
		String returnValue = "";


		for(int i = 0; i < count; i++) {
			returnValue += numbers[i] + " ";
		}

		return returnValue;

	}

}
public class NumberList {
	
	private int[] numbers;
	private int count;


	public NumberList() {
		this.numbers = new int[10];
		this.count = 0;
	}

	//resize

	//insert a new number at the beginning of the list
	public void addFirst(int newNumber) {
		if(this.count < this.numbers.length) {
			for(int i = count; i > 0; i--) {
				this.numbers[i] = this.numbers[i-1];
			}
			this.numbers[0] = newNumber;
			this.count++;
		}
	}

	//remove the first item in the list

	//contains duplicates?	
	//for each item - does it contain another of that item?

	//tostring
	public String toString() {
		String returnValue = "";


		return returnValue;
	}



}
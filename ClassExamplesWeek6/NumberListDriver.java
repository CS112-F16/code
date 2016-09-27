//Test driven development

public class NumberListDriver {

	public static void main(String[] args) {

		NumberList list = new NumberList();
		
		System.out.println(list.toString()); //{}
		
		list.addFirst(2);		
		System.out.println(list); //{2}

		list.addFirst(7);		
		System.out.println(list); //{7, 2}

		list.addFirst(9);		
		System.out.println(list); //{9, 7, 2}

		list.addFirst(7);
		System.out.println(list.containsDuplicates()); //true
		list.removeFirst();

		list.removeFirst();		
		System.out.println(list); //{7 2}

		list.removeFirst();		
		System.out.println(list); //{2}

		list.removeFirst();		
		System.out.println(list); //{}

		System.out.println(list.containsDuplicates()); //false

	}

}
public class NameTester {


	public static void main(String[] args) {

		Comparable n1 = new Name("Bob", "Smith");
		Comparable n2 = new Name("Jane", "Doe");
		
		n1.compareTo(n2);

		String name = (String) n1;


	}

}
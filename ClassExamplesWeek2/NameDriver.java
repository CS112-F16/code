public class NameDriver {

	public static void main(String[] args) {

		Name n1 = new Name("Bob", "Smith", 'J');

		Name n2 = new Name("Curt", "Jones", 'J');

		Name n3 = new Name("Daryl", "Cruz", 'J');

		if(n2.equals(n2)) {
			System.out.println("Equals");
		} else {
			System.out.println("Different");
		}


		// n2.setLast("Cruz");
		// System.out.println(n1.toString());
		// System.out.println(n2.toString());


	}

}
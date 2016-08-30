public class NameDriver {

	public static void main(String[] args) {

		Name n1 = new Name("Bob", "Smith", 'J');

		Name n2 = new Name("Bob", "Smith", 'J');

		n2.setLast("Cruz");
		System.out.println(n1.toString());
		System.out.println(n2.toString());


	}

}
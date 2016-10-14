/**
	Class to test USFPerson and subclasses.
**/
public class PersonTester {

	public static void main(String[] args) {

		//p is a polymorphic reference
		//It can refer to an object with type of any subclass
		//of USFPerson.
		USFPerson p = new Student("Bob", 123, "Junior", "History");
		System.out.println(p.toString());

		p = new Faculty("Jane", 987, "Art");

		// Faculty f = new Faculty("Jane", 987, "Art");
		// System.out.println(f);

	}

}
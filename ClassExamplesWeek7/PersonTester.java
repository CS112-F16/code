/**
	Class to test USFPerson and subclasses.
**/
public class PersonTester {

	public static void main(String[] args) {

		//p is a polymorphic reference
		//It can refer to an object with type of any subclass
		//of USFPerson.
		USFPerson p1 = new Student("Bob", 1234, "Junior", "History");
		USFPerson p2 = new Student("Bob", 1111, "Senior", "Math");

		System.out.println(p1.compareTo(p2));

		// Faculty f = new Faculty("Jane", 987, "Art");
		// System.out.println(f);

	}

}
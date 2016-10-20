import java.util.ArrayList;
import java.util.Collections;

/**
	A class that maintains a database of people associated with USF.
**/
public class USFDatabase {

	public static void main(String[] args) {

		//create an ArrayList of USFPerson objects.
		ArrayList<USFPerson> usfdb = new ArrayList<USFPerson>();

		//add several objects
		//any type that extends USFPerson may be added
		usfdb.add(new Student("Bob", 1234, "Junior", "History"));
		usfdb.add(new Student("Sally", 334, "Freshman", "Math"));
		usfdb.add(new Faculty("Jane", 987, "Art"));
		usfdb.add(new Student("Matt", 2343, "Senior", "Biology"));
		usfdb.add(new Faculty("Yannick", 99393, "Sociology"));
		usfdb.add(new Faculty("Bob", 1111, "Chemistry"));

		Collections.sort(usfdb);

		for(USFPerson person: usfdb) {

			//print the string representation of each person
			//because of dynamic binding, the toString method
			//of the child class will be invoked.
			System.out.println(person);

			//if the person is a Student then print the class year
			//if the person is a Faculty then print the department
			// if(person instanceof Student) {	
			// 	//cast the reference to Student then call the Student
			// 	//method			
			// 	System.out.println(((Student)person).getClassYear());

			// 	//OPTION 2:
			// 	//Student s = (Student)person;
			// 	//System.out.println(s.getClassYear());
			// } else if(person instanceof Faculty) {
			// 	System.out.println(((Faculty)person).getDepartment());
			// }

		}


	}

}
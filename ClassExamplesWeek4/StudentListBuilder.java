/**
	A class that will construct a StudentList object from
	a given CSV file.
**/

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class StudentListBuilder {

	/**
		Method takes as input a filename and returns a StudentList
		containing data for all students in the file.
		If the file is not found, method returns 0.
	**/
	public StudentList buildStudentList(String filename) {

		//create list to be returned
		StudentList list = new StudentList();

		//open file
		File inputFile = new File(filename);

		//read in each line of file
		try(Scanner input = new Scanner(inputFile)) {
			input.useDelimiter(",|\n");
			while(input.hasNext()) {
				String name = input.next();
				int score = input.nextInt();

				//	create a Student
				//	add Student to list
				Student student = new Student(name, score);
				list.addStudent(student);
			}


		} catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
			return null;
		}
		
		//return list
		return list;
	}

}
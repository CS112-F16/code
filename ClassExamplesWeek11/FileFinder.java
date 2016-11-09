
import java.io.File;
import java.util.HashMap;

/**
	A class with methods to recursively traverse a file system and count the number of
	files and directories found.
**/
public class FileFinder {

	/**
		Returns a HashMap with mappings for the numebr of files and directories found 
		while traversing the input directory.
	**/
	public static HashMap<String, Integer> countFilesDirs(String directory) {

		HashMap<String, Integer> result = new HashMap<String, Integer>();
		countFilesDirs(new File(directory), result);
		return result;
	}

	/**
		Helper method to traverse the directory.
		Note that a reference to the HashMap is passed as input so any changes will be
		reflected in the original object.
	**/
	private static void countFilesDirs(File input, HashMap<String, Integer> result) {
		
		if(input.isFile()) {
			if(!result.containsKey("Files")) {
				result.put("Files", 1);
			} else {
				result.put("Files", result.get("Files")+1);
				//alternative code
				// int count = result.get("Files");
				// count++;
				// result.put("Files", count);
			}			
		} else if(input.isDirectory()) {
			if(!result.containsKey("Dirs")) {
				result.put("Dirs", 1);
			} else {
				result.put("Dirs", result.get("Dirs")+1);
			}		
			File[] children = input.listFiles();
			for(File f: children) {
				countFilesDirs(f, result);
				
			}
		}
	}


	public static void main(String[] args) {

		HashMap<String, Integer> result = countFilesDirs("/Users/srollins/cs112/code/ClassExamplesWeek11/");

		for(String key: result.keySet()) {
			System.out.println(key + ": " + result.get(key));
		}



	}



}
import java.util.HashMap;

/**
	A class with code to demonstrate HashMap methods put, get, containsKey, keySet, and values.
**/
public class HashMapFun {

	public static void main(String[] args) {

		HashMap<String, Integer> myMap = new HashMap<String, Integer>();

		myMap.put("Sami", 2024);
		myMap.put("Rosa", 6843);
		myMap.put("Dave", 9234);
		if(!myMap.containsKey("Rosa")) {
			myMap.put("Rosa", 1111);	
		}
		
		//System.out.println(myMap.get("Rosa"));

		// for(String key: myMap.keySet()) {
		// 	System.out.println(key + ": " + myMap.get(key));
		// }
		for(Integer i: myMap.values()) {
			System.out.println(i);
		}

	}

}
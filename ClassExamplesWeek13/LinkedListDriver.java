/**
	A class to test out the implementation of a LinkedList.
**/
public class LinkedListDriver {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		// System.out.println("Empty List: \n" + ll.toString());
		// System.out.println("find(3) - empty list : " + ll.find(3));


		ll.addAtTail(3);
		ll.addAtHead(12);
		ll.addAtHead(38);

		// System.out.println(ll.toString());
		
		try {
		    System.out.println("get(0): " + ll.get(0));
		    System.out.println("get(1): " + ll.get(1));
		    System.out.println("get(2): " + ll.get(2));
		    System.out.println("get(-1): " + ll.get(-1));
		} catch(LinkedListException lle) {
		    System.out.println(lle.getMessage());
		}

		// System.out.println("find(3): " + ll.find(3));
		// System.out.println("find(12): " + ll.find(12));
		// System.out.println("find(38): " + ll.find(38));
		// System.out.println("find(322): " + ll.find(322));
		// System.out.println("find(42): " + ll.find(42));
	}

}
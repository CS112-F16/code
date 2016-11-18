public class LinkedList {

	private Node head;

	public LinkedList() {
		head = null;
	}

	public void addAtHead(Integer data) {
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
	}

	public String toString() {

		String result = "";

		Node current = head;
		while(current != null) {
			result += current.getData() + " \n";
			current = current.getNext();

		}
		return result;

	}

}
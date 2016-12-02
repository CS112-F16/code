/**
	A class to implement a LinkedList data structure
**/
public class LinkedList {

	private Node head;
	private Node tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	/**
		Add a new node at the head (beginning) of the list.
	**/
	public void addAtHead(Integer data) {

		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;

		//if we are adding to an empty list
		if(tail == null) {
			//update tail
			tail = newNode;
		}

	}

	/**
		Add a new node at the tail (end) of the list.
	**/		
	public void addAtTail(Integer data) {
		Node newNode = new Node(data);

		//special case: list is empty
		if(head == null) {
			head = tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}


	}	

	/**
		Recursive implementation of a method to find a given item
		in the list.
	**/
	// public boolean find(Integer data) {
	// 	return find(data, head);
	// }

	// private boolean find(Integer data, Node current) {
	// 	if(current == null) {
	// 		return false;
	// 	}
	// 	if(current.getData().equals(data)) {
	// 		return true;
	// 	}
	// 	return find(data, current.getNext());

	// }

	/**
		Iterative implementation to find a given item in the list.
	**/
	public boolean find(Integer data) {
		Node current = head;

		while(current != null) {
			if(data.equals(current.getData())) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	/**
		Return the data at the position specified by index.
		Return -1 if index is out of range.
	**/
	public Integer get(int index) throws LinkedListException {
		
		Node current = head;

		for(int i = 0; (i < index && current != null); i++) {
			current = current.getNext();
		}

		if(current == null || index < 0) {
		    throw new LinkedListException("Index out of range.");
		}
		return current.getData();

	}

	/**
		Delete the item at the head of the list.
	**/
	public void deleteHead() {

		//delete from an empty list -- do nothing
		if(head == null) {
			return;
		}

		//advance head
		head = head.getNext();

		//make sure that we did not delete the last item
		if(head == null) {
			tail = null;
		}

	}

	/**
		Return a string representation of the list.
	**/
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

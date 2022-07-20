package linkedlist;

public class CircularSinglyLinkedList {

	public SinglyNode head = new SinglyNode();
	public SinglyNode tail = new SinglyNode();
	public int size = 0;

	// insertbefore
	public void insertBeforeElement(Object value, Object element) {
		SinglyNode node = new SinglyNode();
		node.nodeValue = value;
		if (size == 0) {
			System.out.println("Empty list..Creating new list");
			head = node;
			tail = node;
			tail.next = head;
		}
		if (head.nodeValue.equals(element)) {
			node.next = head;
			head = node;
		} else {
			SinglyNode current = head;
			do {
				if (current.next.nodeValue.equals(element)) {
					node.next = current.next;
					current.next = node;
					break;
				}
				current = current.next;
			}
			while (current.next != head);
		}
		size++;
	}

	// insert after
	public void insertAfterElement(Object value, Object element) {
		SinglyNode node = new SinglyNode();
		node.nodeValue = value;
		if (size == 0) {
			System.out.println("Empty list..Creating new list");
			head = node;
			tail = node;
			tail.next = head;
		}
		if (tail.nodeValue == element) {
			tail.next = node;
			tail = node;
			tail.next = head;
		} else {
			SinglyNode current = head;
			do{
				if (current.nodeValue.equals(element)) {
					node.next = current.next;
					current.next = node;
					break;
				}
				current = current.next;
			} 
			while (head != current) ;
		}
		size++;
	}

	// search
	public void findFirst(Object element) {
		SinglyNode current = head;
		do{
			if (current.nodeValue.equals(element)) {
				System.out.println("Found!!");
				break;
			}
			current = current.next;
		}
		while (current != head) ;
	}

	// delete
	public void deleteFirst(Object element) {
		if (head.nodeValue.equals(element)) {
			head = head.next;
		}
		SinglyNode current = head;
		do {
			if (head != current.next) {
				if (current.next.nodeValue.equals(element)) {
					current.next = current.next.next;
					System.out.println("Deleted!!");
					size--;
					if (size == 0) {
						tail = null;
					}
					break;
				}
			} else {
				if (tail.nodeValue.equals(element)) {
					tail = current;
					size--;
					if (size == 0) {
						tail = null;
					}
					break;
				}
			}
			current = current.next;

		}
		while (current != head) ;
	}

	public void insertAtIndex(Object value, int index) {
		// if empty
		SinglyNode node = new SinglyNode();
		node.nodeValue = value;
		if (size == 0) {
			head = node;
			tail = node;
			tail.next = head;
		}
		// if index at head
		if (index == 1) {
			node.next = head;
			head = node;
		}
		// if index at tail or more than tail
		else if (index == size || index > size) {
			tail.next = node;
			tail = node;
			tail.next = head;
		}
		// if index at middle
		else {
			int count = 1;
			SinglyNode current = head;
			while (count < index - 1) {
				current = current.next;
				count++;
			}
			node.next = current.next;
			current.next = node;
		}
		size++;
	}

	public void insertAtHead(Object value) {
		SinglyNode node = new SinglyNode();
		node.nodeValue = value;
		node.next = head;
		head = node;
		if (size == 0) {
			tail = node;
		}
		size++;
	}

	public void insertAtTail(Object value) {
		SinglyNode node = new SinglyNode();
		node.nodeValue = value;
		if (size == 0) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		tail.next = head;
		size++;
	}

	public void printCircularSinglyLinkedList() {
		SinglyNode currentNode = head;
		if (null == currentNode || size == 0) {
			System.out.println("Empty");
			return;
		}
		System.out.println("Head: " + head);
		System.out.println("Tail: " + tail);
		System.out.println("");
		if (size == 1) {
			System.out.println(
					"Node: " + currentNode + " value: " + currentNode.nodeValue + " next: " + currentNode.next);
		} else {
			do {
				System.out.println(
						"Node: " + currentNode + " value: " + currentNode.nodeValue + " next: " + currentNode.next);
				currentNode = currentNode.next;
			}
			while (head != currentNode) ;
		}
	}

}

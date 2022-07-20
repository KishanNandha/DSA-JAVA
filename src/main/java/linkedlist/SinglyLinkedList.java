package linkedlist;

public class SinglyLinkedList {

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
		}
		if (head.nodeValue.equals(element)) {
			node.next = head;
			head = node;
		} else {
			SinglyNode current = head;
			while (current.next != null) {
				if (current.next.nodeValue.equals(element)) {
					node.next = current.next;
					current.next = node;
					break;
				}
				current = current.next;
			}
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
		}
		if (tail.nodeValue == element) {
			tail.next = node;
			tail = node;
		} else {
			SinglyNode current = head;
			while (null != current) {
				if (current.nodeValue.equals(element)) {
					node.next = current.next;
					current.next = node;
					break;
				}
				current = current.next;
			}
		}
		size++;
	}

	// search
	public void findFirst(Object element) {
		SinglyNode current = head;
		while (current != null) {
			if (current.nodeValue.equals(element)) {
				System.out.println("Found!!");
				break;
			}
			current = current.next;
		}
	}

	// delete
	public void deleteFirst(Object element) {
		if (head.nodeValue.equals(element)) {
			head = head.next;
		}
		SinglyNode current = head;
		while (current != null) {
			if (null != current.next) {
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
	}

	public void insertAtIndex(Object value, int index) {
		// if empty
		SinglyNode node = new SinglyNode();
		node.nodeValue = value;
		if (size == 0) {
			head = node;
			tail = node;
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
		size++;
	}

	public void printSinglyLinkedList() {
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
			while (null != currentNode) {
				System.out.println(
						"Node: " + currentNode + " value: " + currentNode.nodeValue + " next: " + currentNode.next);
				currentNode = currentNode.next;
			}
		}
	}

}

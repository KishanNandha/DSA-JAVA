package linkedlist;

public class DoublyLinkedList {
	public DoublyNode head;
	public DoublyNode tail;

	public void insertAtIndex(Object value, int index) {
		DoublyNode node = new DoublyNode();
		node.nodeValue = value;
		if (head == null) {
			head = node;
			tail = node;
		} else if (index == 1 || index == 0) {
			node.next = head;
			head.prev = node;
			head = node;
		} else {
			int count = 1;
			DoublyNode current = head;
			while (count < index && null != current) {
				current = current.next;
				if (tail == current) {
					tail.next = node;
					node.prev = tail;
					tail = node;
					return;
				}
				count++;
			}
			node.prev = current.prev;
			current.prev.next = node;
			node.next = current;

		}
	}

	public void insertAtTail(Object value) {
		DoublyNode node = new DoublyNode();
		node.nodeValue = value;
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
	}

	public void insertAtHead(Object value) {
		DoublyNode node = new DoublyNode();
		node.nodeValue = value;
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
	}

	public void printDoublyLinkedList() {
		DoublyNode currentNode = head;
		if (null == currentNode) {
			System.out.println("Empty");
			return;
		}
		System.out.println("Head: " + head);
		System.out.println("Tail: " + tail);
		System.out.println("");
		if (head.next == null) {
			System.out.println("Node: " + currentNode + " value: " + currentNode.nodeValue + " next: "
					+ currentNode.next + " prev: " + currentNode.prev);
		} else {
			while (null != currentNode) {
				System.out.println("Node: " + currentNode + " value: " + currentNode.nodeValue + " next: "
						+ currentNode.next + " prev: " + currentNode.prev);
				currentNode = currentNode.next;
			}
		}
	}
}

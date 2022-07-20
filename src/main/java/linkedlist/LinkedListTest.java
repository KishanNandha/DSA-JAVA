package linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		//testSinglyLinkedList();
		//testCircularSinglyLinkedList();
		testDoublyLinkedList();
	}
	
	private static void testDoublyLinkedList() {
		DoublyLinkedList sl = new DoublyLinkedList();
		sl.insertAtHead(3);
		sl.insertAtHead(2);
		sl.insertAtHead(1);
		sl.insertAtTail(4);
		sl.insertAtTail(5);
		sl.insertAtTail(6);
		sl.insertAtIndex(7, 5);
		sl.insertAtIndex(8, 1);
		sl.insertAtIndex(9, 9);
		sl.insertAtIndex(10, 44);
		//sl.insertBeforeElement(11, 9);
		//sl.insertAfterElement(12,4 );
		//sl.findFirst(8);
		//sl.deleteFirst(8);
		sl.printDoublyLinkedList();
	}
	
	private static void testCircularSinglyLinkedList() {
		CircularSinglyLinkedList sl = new CircularSinglyLinkedList();
		sl.insertAtHead(3);
		sl.insertAtHead(2);
		sl.insertAtHead(1);
		sl.insertAtTail(4);
		sl.insertAtTail(5);
		sl.insertAtTail(6);
		sl.insertAtIndex(7, 5);
		sl.insertAtIndex(8, 1);
		sl.insertAtIndex(9, 9);
		sl.insertAtIndex(10, 44);
		sl.insertBeforeElement(11, 9);
		sl.insertAfterElement(12,4 );
		sl.findFirst(8);
		sl.deleteFirst(8);
		sl.printCircularSinglyLinkedList();
	}

	private static void testSinglyLinkedList() {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.insertAtHead(3);
		sl.insertAtHead(2);
		sl.insertAtHead(1);
		sl.insertAtTail(4);
		sl.insertAtTail(5);
		sl.insertAtTail(6);
		sl.insertAtIndex(7, 5);
		sl.insertAtIndex(8, 1);
		sl.insertAtIndex(9, 9);
		sl.insertAtIndex(10, 44);
		sl.insertBeforeElement(11, 9);
		sl.insertAfterElement(12,4 );
		sl.findFirst(8);
		sl.deleteFirst(8);
		sl.printSinglyLinkedList();
	}

}

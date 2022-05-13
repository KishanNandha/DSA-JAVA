package array;

public class ArrayMain {

	public static void main(String[] args) {
		SingleDimensionArray<Integer> a = new SingleDimensionArray<Integer>();
		
		a.insertElementByIndex(1, 7);
		a.printArray();
		a.insertElementByIndex(3, 6);
		a.printArray();
		
		a.insertElementAtEnd(1);
		a.printArray();
		a.insertElementAtEnd(2);
		a.printArray();
		a.insertElementAtEnd(3);
		a.printArray();
		
		a.insertElementAtStart(4);
		a.printArray();
		a.insertElementAtStart(5);
		a.printArray();
		
	}

}

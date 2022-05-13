package array;

public class SingleDimensionArray<T> {

	public final int INIT_LENGTH = 5; 
	private Object[] arr = null;
	private int size = 1;
	
	public SingleDimensionArray() {
		this.arr = new Object[INIT_LENGTH];
	}
	
	public void getElement(int index) {
		if(index > arr.length) {
			System.out.println("Please provide index less then array length.");
			return;
		}
		if(null == arr[index]) {
			System.out.println("Value at index "+index + " is empty.");
			return;
		}
		System.out.println(arr[index]);
	}
	
	public void insertElementAtStart(T value) {
		if(null == value) {
			System.out.println("Null value");
			return;
		}
		int lastElementindex = size +1;
		if(lastElementindex >= arr.length) {
			copyOldArrayToNewArray();
		}
		
		for(int i = size - 1 ; i >= 0 ; i--) {
			int j = i+1;
			arr[j] = arr[i];
		}
		arr[0] = value; 
		size ++;
		
	}
	
	public void insertElement(T value) {
		insertElementAtEnd(value);
	}
	
	public void insertElementAtEnd(T value) {
		if(null == value) {
			System.out.println("Null value");
			return;
		}
		int index = size+1;
		if(index >= arr.length) {
			copyOldArrayToNewArray();
		}
		if(null != arr[index]) {
			System.out.println("value at index "+ index + " is not empty. Please delete value at inxed first then insert.");
			return;
		}
		arr[index] = value;
		size ++;
		
	}
	
	public void insertElementByIndex(int index, T value) {
		if(null == value) {
			System.out.println("Null value");
			return;
		}
		if(index >= arr.length) {
			copyOldArrayToNewArray();
		}
		if(null != arr[index]) {
			System.out.println("value at index "+ index + " is not empty. Please delete value at inxed first then insert.");
			return;
		}
		arr[index] = value;
		size ++;
	}
	
	public void copyOldArrayToNewArray() {
		int currentLength = arr.length;
		int newLength = currentLength + INIT_LENGTH;
		Object[] newArray = new Object[newLength];
		for (int i = 0 ; i < arr.length ; i++) {
			newArray[i] = arr[i];
		}
		arr = newArray;
	}
	
	public void printArray() {
		System.out.print("[ ");
		for(int i= 0; i <= size ; i++) {
			if(i == size) {
				System.out.print(arr[i]);
			}else {
			System.out.print(arr[i] + " ,");}
		}
		System.out.print(" ]");
		System.out.println("");
	}
}

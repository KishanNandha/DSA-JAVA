package array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int[][] array = new int[2][2];
		print2DArray(array);
		insertValueInTheArray(0, 0, 1, array);
		print2DArray(array);
		insertValueInTheArray(0, 1, 2, array);
		print2DArray(array);
		insertValueInTheArray(1, 0, 3, array);
		print2DArray(array);
		insertValueInTheArray(1, 1, 4, array);
		print2DArray(array);
		getElement(1, 0, array);
		searchElement(array, 3);
		deleteElement(array, 3);
		print2DArray(array);
	}
	
	public static void print2DArray(int[][] array) {
		for(int row = 0; row < array.length ; row ++) {
			for(int col = 0 ; col < array[row].length; col ++) {
				System.out.print(array[row][col]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("");
	}

	public static void insertValueInTheArray(int row, int col, int value, int[][] array) {
		if(array[row][col] == 0) {
			array[row][col] = value;
		}
		else {
			System.out.println("This cell is already occupied");
		}
	}
	
	public static void getElement(int row, int col, int[][] array) {
		if(array[row][col] != 0) {
			System.out.println(array[row][col]);
		}
	}
	
	public static void searchElement(int[][] array, int value) {
		for(int row =0; row < array.length ; row++) {
			for(int col = 0 ; col < array[0].length; col ++) {
				if(array[row][col] == value) {
					System.out.println("element found");
					return;
				}
			}
		}
		System.out.println("element not found");
	}
	
	public static void deleteElement(int[][] array, int value) {
		for(int row =0; row < array.length ; row++) {
			for(int col = 0 ; col < array[0].length; col ++) {
				if(array[row][col] == value) {
					array[row][col] = 0;
					System.out.println("element deleted");
					return;
				}
			}
		}
		System.out.println("element not found");
	}
}

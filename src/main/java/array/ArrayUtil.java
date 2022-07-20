package array;

public class ArrayUtil {

	public static void printArray(int[] arr) {
		System.out.print("[ ");
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			if (i == size-1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + " ,");
			}
		}
		System.out.print(" ]");
		System.out.println("");
	}
}

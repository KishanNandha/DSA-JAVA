package array.programs.ibit.arraymath;

public class Q1_SumFromArrayEnds {
	/*
	 * Given an integer array A of size N.
	 * 
	 * You have to pick exactly B elements from either left or right end of the
	 * array A to get maximum sum.
	 * 
	 * Find and return this maximum possible sum.
	 * 
	 * NOTE: Suppose B = 4 and array A contains 10 elements then
	 * 
	 * You can pick first four elements or can pick last four elements or can pick 1
	 * from front and 3 from back etc . you need to return the maximum possible sum
	 * of elements you can pick
	 */
	public static void main(String[] args) {
		System.out.println(solve(new int[] {1 ,2 ,3, 4, 5}, 3));
	}

	public static int solve(int[] A, int B) {
		// BCR O(n)
		int maxSum = 0;
		for (int i = 0; i < B; i++) {
			int tempSum = 0;
			for (int j = (A.length - B - i); j < A.length; j++) {
				tempSum = tempSum + A[j];
			}
			tempSum = tempSum + A[i];
			if (tempSum > maxSum) {
				maxSum = tempSum;
			}
		}

		return maxSum;
	}

}

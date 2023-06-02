package patterns.slidingWindow;

public class A2_FindMaximumSumOfAnyContiguousSubarrayOfSizeK {
	/*Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.

	Example 1:

	Input: [2, 1, 5, 1, 3, 2], k=3 
	Output: 9
	Explanation: Subarray with maximum sum is [5, 1, 3]. */
	public static void main(String[] args) {

		int[] arr = new int[] { 2, 1, 5, 1, 3, 2 };
		System.out.println(maxSum(arr,3));
	}
	public static double maxSum(int[] arr, int K) {
		double sum = 0;
		double maxSum = 0;
		int start = 0;
		for(int i = start; i < arr.length; i++) {
			sum = sum + arr[i];
			if(i == start + K - 1) {
				if(maxSum<=sum) {
					maxSum = sum;
				}
				sum = sum - arr[start];
				start = start + 1;
			}
		}
		return maxSum;
	} 

}

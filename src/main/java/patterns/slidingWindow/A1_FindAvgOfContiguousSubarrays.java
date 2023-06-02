package patterns.slidingWindow;

import java.util.Arrays;

public class A1_FindAvgOfContiguousSubarrays {

	/*
Given an array, find the average of all contiguous subarrays of size ‘K’ in it.

Let’s understand this problem with a real input:

Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
Here, we are asked to find the average of all contiguous subarrays of size ‘5’ in the given array. Let’s solve this:

For the first 5 numbers (subarray from index 0-4), the average is: (1+3+2+6-1)/5 => 2.2(1+3+2+6−1)/5=>2.2
The average of next 5 numbers (subarray from index 1-5) is: (3+2+6-1+4)/5 => 2.8(3+2+6−1+4)/5=>2.8
For the next 5 numbers (subarray from index 2-6), the average is: (2+6-1+4+1)/5 => 2.4(2+6−1+4+1)/5=>2.4
…
Here is the final output containing the averages of all contiguous subarrays of size 5:

Output: [2.2, 2.8, 2.4, 3.6, 2.8]
*/
	public static void main(String[] args) {

		int[] arr =  new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
	    System.out.println("Averages of subarrays of size K: " +Arrays.toString(bruteForce(arr,5)));
	    System.out.println("Averages of subarrays of size K: " +Arrays.toString(usingSlidingWindow(arr,5)));
	}
	
	// O(N * K)
	public static double[] bruteForce(int[] arr, int K) {
		double[] result = new double[arr.length - K + 1];
	    for (int i = 0; i <= arr.length - K; i++) {
	      // find sum of next 'K' elements
	      double sum = 0;
	      for (int j = i; j < i + K; j++)
	        sum += arr[j];
	      result[i] = sum / K; // calculate average
	    }
	 
	    return result;
	}

	// O(N)
	public static double[] usingSlidingWindow(int[] arr, int K) {
		int start = 0;
		double[] result = new double[arr.length - K + 1];
		double sum = 0;
		for (int i = start; i < arr.length; i++) {
			sum = sum + arr[i];
			if(i == start + K - 1) {
				result[start]=sum/K;
				sum = sum - arr[start];
				start = start + 1;
			}
		}
		 return result;
	}
}

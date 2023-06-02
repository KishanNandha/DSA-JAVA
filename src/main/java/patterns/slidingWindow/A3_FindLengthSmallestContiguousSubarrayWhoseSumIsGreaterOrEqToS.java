package patterns.slidingWindow;

public abstract class A3_FindLengthSmallestContiguousSubarrayWhoseSumIsGreaterOrEqToS {
	/* Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.

	Example 1:

	Input: [2, 1, 5, 2, 3, 2], S=7 
	Output: 2
	Explanation: The smallest subarray with a sum great than or equal to '7' is [5, 2]. */
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 1, 5, 2, 3, 2 };
		System.out.println(findSubArray(arr, 7));
	}

	public static int findSubArray(int[] arr, int S) {
		int windowSum = 0, minLength = Integer.MAX_VALUE;
		int windowStart = 0;
		for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
			windowSum += arr[windowEnd]; // add the next element
			// shrink the window as small as possible until the 'windowSum' is smaller than
			// 'S'
			while (windowSum >= S) {
				minLength = Math.min(minLength, windowEnd - windowStart + 1);
				windowSum -= arr[windowStart]; // subtract the element going out
				windowStart++; // slide the window ahead
			}
		}

		return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}

}

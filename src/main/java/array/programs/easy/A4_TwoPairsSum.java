package array.programs.easy;

import java.util.HashMap;

//Write a program to find all pairs of integers whose sum is equal to a given number.

//Example 1:

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


// Only one valid pair exists.

public class A4_TwoPairsSum {

	public static void main(String[] args) {
		int[] nums = new int[] {2,11,7,15};
		printArray(twoSum(nums, 9));
		printArray(twoSumOpt(nums, 9));
	}

	public static int[] twoSumOpt(int[] nums, int target) {
		HashMap<Integer, Integer> valueToIndexMap = new HashMap<Integer, Integer>();
		 int[] result = new int[2];
		for(int i = 0 ; i< nums.length ; i++) {
			 int value = nums[i];
			 int lookingFor = target - value;
			 if(valueToIndexMap.containsKey(lookingFor)) {
				 result[0] = valueToIndexMap.get(lookingFor);
				 result[1] = i;
				 break;
			 }
			 else {
				 valueToIndexMap.put(value, i);
			 }
		 }
		
		return result;
	}
	
	public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0 ; i< nums.length ; i++) {
        	for(int j = i+1; j < nums.length ; j++) {
        		int sum = nums[i] + nums[j];
        		if(sum == target) {
        			result[0] = i;
        			result[1] =j ;
        			return result;
        		}
        	}
        }
        return result;
    }
	
	public static void printArray(int[] a) {
		for(int i = 0 ; i < a.length ; i++ ) {
			System.out.println(a[i] + " ");
		}
	}
}

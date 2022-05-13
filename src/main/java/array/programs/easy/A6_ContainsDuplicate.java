package array.programs.easy;

import java.util.HashMap;

public class A6_ContainsDuplicate {

	public static void main(String[] args) {
		 int[] intArray = {10,60,30,40,50,50};
		 System.out.println(containsDuplicate(intArray));
	}

	public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
		for(int i = 0 ; i < nums.length ; i ++) {
			if(null != map.get(nums[i])) {
				return true;
			}
			else {
				map.put(nums[i], "c");
			}
		}
		return false;
    }
}

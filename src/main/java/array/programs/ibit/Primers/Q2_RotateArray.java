package array.programs.ibit.Primers;

import array.ArrayUtil;

public class Q2_RotateArray {
	/*
	 * The following code is supposed to rotate the array A by B positions.
	 * 
	 * So, for example,
	 * 
	 * 
	 * A : [1 2 3 4 5 6] B : 1
	 * 
	 * The output :
	 * 
	 * [2 3 4 5 6 1]
	 * 
	 */
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3 ,4, 5, 6 };
		ArrayUtil.printArray(a);
		//ArrayUtil.printArray(rotateArray(a, 1));
		ArrayUtil.printArray(rotateArrayOpt(a, 9));
	}

	public static int[] rotateArray(int[] a, int n) {
		int[] res = new int[a.length];
		for(int i = 0 ; i < a.length; i ++) {
			int index = i + n;
			if(index > (a.length-1)) {
				index = index  - a.length ;
			}
			res[index] = a[i];
		}
		return res;
	}
	//B can be bigger than the size of the array. What should be the behavior then ?
	public static int[] rotateArrayOpt(int[] a, int n) {
		int[] res = new int[a.length];
		for(int i = 0 ; i < a.length; i ++) {
			int index = (i + n) % a.length;
			System.out.println(index);
			res[index] = a[i];
		}
		return res;
	}
}

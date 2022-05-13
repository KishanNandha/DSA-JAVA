package array.programs.easy;

public class A3_missingNumber {

	public static void main(String[] args) {
		int[] a =new int[]{ 1,2,3,4,5,6,8,9,10 };
		//array will be sorted
		System.out.println(findMissingNumberSorted(a));
		
		//array wont be sorted
		int[] a2 =new int[]{ 2,1,6,4,5,3,10,9,8 };
		System.out.println(findMissingNumberUnSorted(a2));
	}
	public static int findMissingNumberUnSorted(int[] a) {
		if(a.length ==0 || a.length ==1) {
			return 0;
		}
		int sum = 0;
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			if (max <= a[i]) {
				max = a[i];
			}
		}
		int n_sum = (max * (max+1)) / 2;
		return n_sum - sum;
	}
	
	
	public static int findMissingNumberSorted(int[] a) {
		if(a.length ==0 || a.length ==1) {
			return 0;
		}
		int n = a[a.length-1];
		int n_sum = (n * (n+1)) / 2;
		int sum = 0;
		for (int i= 0; i<a.length;i++) {
			sum = sum + a[i];
		}
		return n_sum - sum;
	}
}

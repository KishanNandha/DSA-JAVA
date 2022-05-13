package array.programs.easy;

public class A2_MaxMinFromArray {

	public static void main(String[] args) {
		int[] a= new int[] {3,2,1,4,5,6,7,18,9,10};
		findMaxMinElement(a);
		
		int[] a2= new int[] {3,2};
		findMaxMinElement(a2);
	}
	
	public static void findMaxMinElement(int[] a) {
		if(a.length == 0) {
			return;
		}
		int max = a[0];
		int min = a[0];
		
		if(a.length == 1) {
			System.out.println("Max: "+max);
			System.out.println("Min: "+min);
			return;
		}
		for(int i = 0 ; i < a.length; i++) {
			if(a[i] >= max) {
				max = a[i];
			}
			if(a[i] <= min) {
				min = a[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}

}

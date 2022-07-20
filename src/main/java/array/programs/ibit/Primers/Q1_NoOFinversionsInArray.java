package array.programs.ibit.Primers;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_NoOFinversionsInArray {

	/*
	 * Given an array A, count the number of inversions in the array.
	 * 
	 * Formally speaking, two elements A[i] and A[j] form an inversion if A[i] >
	 * A[j] and i < j
	 * 
	 * Example:
	 * 
	 * A : [2, 4, 1, 3, 5] Output : 3
	 * 
	 * as the 3 inversions are (2, 1), (4, 1), (4, 3).
	 */
	public static void main(String[] args) {
		int[] a = new int[] { 2, 4, 1, 3, 5 };
		System.out.println(noOfInversionArray(a));
	}

	public static int noOfInversionArray(int[] a) {
		// BCR : O(n)

		// current:
		int count = 0;
		if (a.length == 0 || a.length == 1) {
			return count;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					count++;
				}
			}
		}
		return count;
	}

	static int inv = 0;

	public int countInversionsOpt(ArrayList<Integer> A) {
		inv = 0;
		int a[] = new int[A.size()];
		for (int i = 0; i < A.size(); i++) {
			a[i] = A.get(i);
		}
		merge(a, 0, A.size() - 1);
		return inv;
	}

	void merge(int a[], int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			merge(a, low, mid);
			merge(a, mid + 1, high);

			int i = low, j = mid + 1;
			while (i <= mid && j <= high) {
				if (a[i] > a[j]) {
					j++;
					inv += mid - i + 1;
				} else {
					i++;
				}
			}
			Arrays.sort(a, low, high + 1);
		}
	}
}

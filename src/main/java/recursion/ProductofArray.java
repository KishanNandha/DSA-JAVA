/**
 * 
 */
package recursion;

/**
 * @author Kishan
 *
 * Apr 18, 2022
 */
public class ProductofArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 }; 
		System.out.println(productofArray(arr, arr.length));
	}

    public static int productofArray(int A[], int N) 
    { 
        if (N <= 0) 
            return 1; 
        return (productofArray(A, N - 1) * A[N - 1]); 
    } 
}

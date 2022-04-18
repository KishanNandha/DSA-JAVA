/**
 * 
 */
package recursion;

/**
 * @author Kishan
 *
 * Apr 18, 2022
 */
public class DEC_to_BIN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//13 to binary
		// 13/2 = 6 remd 1
		//  6/2 = 3 remd 0
		//  3/2 = 1 remd 1 
		//  1/2 = 0 remd 1
		// binary = down to top remd i.e 13 = 1101
		System.out.println(decToBin(13));
		
	}

	public static int decToBin(int n) {
		if(n==0) {
			return 0;
		}
		else {
			return (n%2) + 10*decToBin(n/2);
		} 
	}
}

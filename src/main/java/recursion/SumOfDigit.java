/**
 * 
 */
package recursion;

/**
 * @author Kishan
 *
 * Apr 18, 2022
 */
public class SumOfDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 546 
		//sum of digits = 5 + 4 + 6 = 15
		System.out.println(sumOfDigits(546));
	}
	public static int sumOfDigits(int n) {
		if(n<0) {
			return -1;
		}
		if(n / 10 == 0) {
			return n;
		}
		else {
			return (n%10) + sumOfDigits(n/10);
		}
	}

}

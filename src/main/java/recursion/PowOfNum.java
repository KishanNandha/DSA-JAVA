/**
 * 
 */
package recursion;

/**
 * @author Kishan
 *
 * Apr 18, 2022
 */
public class PowOfNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 2^4 = 2*2*2*2 =16
		// x^n = x*x*x...n times
		// x^a * x^b = x^(a+b)
		// x^n = x^1 * x^(n-1)
		// x^1 = X so x^n = x * x^(n-1)
		System.out.println(powOfNum(2,4));
	}

	public static int powOfNum(int x, int n) {
		if(n<0 || x<0) {
			return -1;
					}
		if(n == 0) {
			//x^-1 = 1
			return 1; 
		}else {
			return x * powOfNum(x,n-1);
		}
	}
}

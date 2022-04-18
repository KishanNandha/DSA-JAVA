/**
 * 
 */
package recursion;

/**
 * @author Kishan
 *
 * Apr 18, 2022
 */
public class GCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//gcd(48,18)
		//step 1 48/18 = 2 remd 12
		//step 2 18/12 = 1 remd 6
		//step 3 12/6 = 2 rem 0
		// gcd(48,18) = 6
		
		//gcd(a,0) = a
		//gcd(a,b) = gcd(b,a mod b)
		System.out.println(gcd(48,18));
				//step 1 48/18 = 2 remd 12
				//step 2 18/12 = 1 remd 6
				//step 3 12/6 = 2 rem 0
				//step 4 6,0 base cond so return 6
	}

	public static int gcd(int a, int b) {
		if(a<0 || b<0) {
			return -1;
		}
		if(b==0) {
			return a;
		}
		else {
			return gcd(b,a % b);
		}
	}
}

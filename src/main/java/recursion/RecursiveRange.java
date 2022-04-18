/**
 * 
 */
package recursion;

/**
 * @author Kishan
 *
 * Apr 18, 2022
 */
public class RecursiveRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    // recursiveRange(6)  // 6+5+4+3+2+1+0 = 21
	    // recursiveRange(10) // 55 
		
		// 6+5+4+3+2+1+0 = 21
		// n + (n-1) + (n-2).....
		//recursiveRange(n) = n + recursiveRange(n-1)
		System.out.println(recursiveRange(6));
	}

    public static int recursiveRange(int num) {
        if (num<=0) {
          return 0;
        }
        return num + recursiveRange(num - 1);
      } 
	
}

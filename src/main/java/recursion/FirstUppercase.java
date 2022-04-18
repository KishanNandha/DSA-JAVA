/**
 * 
 */
package recursion;

/**
 * @author Kishan
 *
 * Apr 18, 2022
 */
public class FirstUppercase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Input : appmillerS
	    // Output : S
		System.out.println(first("appmillerSA"));
	}
    public static char first(String str) {
        if(str.isEmpty()) {
            return ' ';
        }
        if (Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        }else {
            return first(str.substring(1, str.length()));
        }
    }
}

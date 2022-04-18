/**
 * 
 */
package recursion;

/**
 * @author Kishan
 *
 * Apr 18, 2022
 */
public class IsPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// isPalindrome('awesome') # false
		// isPalindrome('foobar') # false
		// isPalindrome('tacocat') # true
		
		System.out.println(isPalindrome("foobar"));
		System.out.println(isPalindrome("tacocat"));
	}

    public static boolean isPalindrome(String s)
    {   // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
        return isPalindrome(s.substring(1, s.length()-1));
        return false;
    }
}

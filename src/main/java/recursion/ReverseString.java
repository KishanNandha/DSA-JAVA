/**
 * 
 */
package recursion;

/**
 * @author Kishan
 *
 * Apr 18, 2022
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    // reverse('java') # 'avaj'
	    // reverse('appmillers') # 'srellimppa'
		System.out.println(reverse("java"));
	}

    public static String reverse(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }
}

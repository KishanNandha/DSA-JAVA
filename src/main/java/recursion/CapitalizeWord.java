/**
 * 
 */
package recursion;

/**
 * @author Kishan
 *
 * Apr 18, 2022
 */
public class CapitalizeWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	    //input: i love java
	   //output : I Love Java
		System.out.println(capitalizeWord("i love java"));
	}
    public static String capitalizeWord(String str) {
        
        if(str.isEmpty()) {
            return str;
        }
        char chr = str.charAt(str.length()-1);
        if(str.length()==1) {
            return Character.toString(Character.toUpperCase(chr));
        }
        if((str.substring(str.length()-2, str.length()-1).equals(" "))) {
            chr = Character.toUpperCase(chr);
        }
        return capitalizeWord(str.substring(0,str.length()-1))+ Character.toString(chr);
    }

}

package recursion;

public class factorial {

	public static void main(String[] args) {
		System.out.println(fact(3));
	}

	public static int fact(int n) {
		// n! = n * (n-1) * (n-2).....
		// n! = n *  (n-1)!
		
		// input is -ve then retrun -1
		if(n<0) {
			return -1;
		}
		//base condition
		if(n==0 || n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
}

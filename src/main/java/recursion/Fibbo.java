package recursion;

public class Fibbo {

	public static void main(String[] args) {
		// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144

		int maxNumber = 10;
		System.out.print("Fibonacci Series of " + maxNumber + " numbers: ");
		for (int i = 0; i < maxNumber; i++) {
			System.out.print(fib(i) + " ");
		}
	}

	public static int fib(int n) {
		// f(n) = (n-1) + (n-2)

		if (n < 0) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

}

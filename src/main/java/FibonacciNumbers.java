import java.math.BigInteger;

/**
 * @author medany
 */

public class FibonacciNumbers {
	public BigInteger solve(int n) {
		return fibonacci(n);
	}

	public BigInteger solveNoRecursion(int n) {
		return fibonacciNoRecursion(n);
	}

	private BigInteger fibonacci(int n) {
		if (n <= 1) {
			return BigInteger.valueOf(n);
		}
		return fibonacci(n - 1).add((fibonacci(n - 2)));
	}

	private BigInteger fibonacciNoRecursion(int x) {
		if (x == 0 || x == 1) {
			return BigInteger.valueOf(x);
		} else {
			BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;
			BigInteger r = BigInteger.ZERO;
			for (int i = 2; i <= x; i++) {
				r = a.add(b);
				a = b;
				b = r;
			}
			return r;
		}
	}
}

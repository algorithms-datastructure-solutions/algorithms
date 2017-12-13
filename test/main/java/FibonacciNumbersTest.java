
import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class FibonacciNumbersTest {

	@Test
	public void Test_1() {
		FibonacciNumbers alg = new FibonacciNumbers();

		BigInteger actual = alg.solve(1), expected = BigInteger.ONE;

		System.out.println(actual);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_2() {
		FibonacciNumbers alg = new FibonacciNumbers();

		BigInteger actual = alg.solve(5), expected = BigInteger.valueOf(5);

		System.out.println(actual);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_3() {
		FibonacciNumbers alg = new FibonacciNumbers();

		BigInteger actual = alg.solve(10), expected = BigInteger.valueOf(55);

		System.out.println(actual);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_4() {
		FibonacciNumbers alg = new FibonacciNumbers();

		BigInteger actual = alg.solveNoRecursion(1000);
		BigInteger expected = new BigInteger(
				"43466557686937456435688527675040625802564660517371780402481729089536555417949051890403879840079255169295922593080322634775209689623239873322471161642996440906533187938298969649928516003704476137795166849228875");

		System.out.println(actual);
		Assert.assertEquals(expected, actual);
	}
}

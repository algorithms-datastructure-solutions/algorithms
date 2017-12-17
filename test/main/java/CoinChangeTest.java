import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.Test;

/**
 * @author medany
 */

public class CoinChangeTest {

	private CoinChange alg = new CoinChange();
	long actual = 0, expected = 0;

	@Test
	public void Test_1() {

		actual = alg.solve(4, new int[] { 1, 2, 3 });
		expected = 4;

		test(expected, actual);
	}

	@Test
	public void Test_2() {

		actual = alg.solve(10, new int[] { 2, 5, 3, 6 });
		expected = 5;

		test(expected, actual);
	}

	@Test
	public void Test_3() {

		actual = alg.solve(250, new int[] { 8, 47, 13, 24, 25, 31, 32, 35, 3, 19, 40, 48, 1, 4, 17, 38, 22, 30, 33, 15,
				44, 46, 36, 9, 20, 49 });
		expected = 3542323427L;

		test(expected, actual);
	}

	@Test
	public void Test_4() {

		actual = alg.solve(85, new int[] { 50, 10, 17, 21, 8, 3, 12, 41, 9, 13, 43, 37, 49, 19, 23, 28, 45, 46, 29, 16,
				34, 25, 2, 22, 1 });
		expected = 370927;

		test(expected, actual);
	}

	@Test
	public void Test_5() {

		actual = alg.solve(222, new int[] { 3, 25, 34, 38, 26, 42, 16, 10, 15, 50, 39, 44, 36, 29, 22, 43, 20, 27, 9,
				30, 47, 13, 40, 33 });
		expected = 5621927;

		test(expected, actual);
	}

	private void test(long expected, long actual) {
		try {
			Assert.assertEquals(expected, actual);
		} catch (ComparisonFailure failed) {
			System.out.println(failed.getStackTrace()[3].getMethodName() + " failed, " + failed.getMessage());
		}
	}
}

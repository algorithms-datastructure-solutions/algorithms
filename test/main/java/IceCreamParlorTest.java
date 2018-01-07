import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class IceCreamParlorTest {

	private static IceCreamParlor alg = new IceCreamParlor();
	private int[] actual, expected;

	@Test
	public void Test_1() {

		actual = alg.solve(4, new int[] { 1, 4, 5, 3, 2 });
		expected = new int[] { 1, 4 };

		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void Test_2() {

		actual = alg.solve(4, new int[] { 2, 2, 4, 3 });
		expected = new int[] { 1, 2 };

		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void Test_3() {

		actual = alg.solve(16, new int[] { 2, 7, 8, 5, 8, 3, 8 });
		expected = new int[] { 3, 5 };

		Assert.assertArrayEquals(expected, actual);
	}
}

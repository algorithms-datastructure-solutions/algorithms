import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class EqualStacksTest {

	private EqualStacks alg = new EqualStacks();
	int actual, expected;

	@Test
	public void Test_1() {

		actual = alg.solve(new int[] { 3, 2, 1, 1, 1 }, new int[] { 4, 3, 2 }, new int[] { 1, 1, 4, 1 });
		expected = 5;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_2() {

		actual = alg.solve(new int[] { 1 }, new int[] { 1 }, new int[] { 1 });
		expected = 1;

		Assert.assertEquals(expected, actual);
	}
}

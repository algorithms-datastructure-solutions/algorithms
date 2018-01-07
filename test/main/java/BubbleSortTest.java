import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class BubbleSortTest {

	private BubbleSort alg = new BubbleSort();
	private int[] actual, expected;

	@Test
	public void Test_1() {

		actual = alg.solve(new int[] { 1, 2, 3 });
		expected = new int[] { 0, 1, 3 };

		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void Test_2() {

		actual = alg.solve(new int[] { 3, 2, 1 });
		expected = new int[] { 3, 1, 3 };

		Assert.assertArrayEquals(expected, actual);
	}

}

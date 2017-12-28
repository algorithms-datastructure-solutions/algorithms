import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */
public class BirthdayChocolateTest {

	private BirthdayChocolate alg = new BirthdayChocolate();
	private int actual, expected;

	@Test
	public void Test_1() {

		actual = alg.solve(3, 2, new int[] { 1, 2, 1, 3, 2 });
		expected = 2;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_2() {

		actual = alg.solve(3, 2, new int[] { 1, 1, 1, 1, 1, 1 });
		expected = 0;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_3() {

		actual = alg.solve(18, 6, new int[] { 4, 5, 4, 5, 1, 2, 1, 4, 3, 2, 4, 4, 3, 5, 2, 2, 5, 4, 3, 2, 3, 5, 2, 1, 5,
				2, 3, 1, 2, 3, 3, 1, 2, 5 });
		expected = 6;

		Assert.assertEquals(expected, actual);
	}

}

import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */
public class EqualizetheArrayTest {

	private EqualizetheArray alg = new EqualizetheArray();
	private int actual, expected;

	@Test
	public void Test_1() {

		actual = alg.solve(new int[] { 3, 3, 2, 1, 3 });
		expected = 2;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_2() {

		actual = alg.solve(new int[] { 37, 32, 97, 35, 76, 62 });
		expected = 5;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_3() {

		actual = alg.solve(new int[] { 36, 12, 60, 99, 78, 33, 4, 21, 22, 9, 12, 21, 34, 76, 21, 3, 3, 37, 65, 27, 21,
				42, 11, 14, 21, 88, 46, 63, 79, 6, 37, 94, 99, 68, 76, 6, 21, 86, 49, 56, 22, 90, 74, 83, 20, 21, 94,
				60, 76, 75, 96, 99, 92, 65, 77, 26, 51, 21, 77, 22, 97, 34, 56 });
		expected = 55;

		Assert.assertEquals(expected, actual);
	}

}

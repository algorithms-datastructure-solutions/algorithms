import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class PowerofTwoTest {

	private PowerofTwo alg = new PowerofTwo();
	private int[] actual, expected;

	@Test
	public void Test_1() {

		actual = alg.solve(new int[] { 1, 2, 3, -1, 15, 11, 12 });
		expected = new int[] { 1, 1, 0, 0, 0, 0, 0 };

		Assert.assertArrayEquals(expected, actual);
	}

}

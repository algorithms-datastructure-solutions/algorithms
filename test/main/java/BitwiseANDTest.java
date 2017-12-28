import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */
public class BitwiseANDTest {

	private BitwiseAND alg = new BitwiseAND();
	private int actual, expected;

	@Test
	public void Test_1() {

		actual = alg.solve(5, 2);
		expected = 1;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_2() {

		actual = alg.solve(8, 5);
		expected = 4;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_3() {

		actual = alg.solve(2, 2);
		expected = 0;

		Assert.assertEquals(expected, actual);
	}

}

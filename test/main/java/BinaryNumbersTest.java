import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */
public class BinaryNumbersTest {

	private BinaryNumbers alg = new BinaryNumbers();
	private int actual, expected;

	@Test
	public void Test_1() {

		actual = alg.solve(5);
		expected = 1;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_2() {

		actual = alg.solve(12);
		expected = 2;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_3() {

		actual = alg.solve(524283);
		expected = 16;

		Assert.assertEquals(expected, actual);
	}

}

import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */
public class LeapYearTest {

	private LeapYear alg = new LeapYear();
	private boolean actual, expected;

	@Test
	public void Test_1() {

		actual = alg.solve(2017);
		expected = false;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_2() {

		actual = alg.solve(2016);
		expected = true;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_3() {

		actual = alg.solve(1977);
		expected = false;

		Assert.assertEquals(expected, actual);
	}

}

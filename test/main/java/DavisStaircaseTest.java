import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class DavisStaircaseTest {

	@Test
	public void Test_1() {

		DavisStaircase alg = new DavisStaircase();

		int actual = alg.solve(1), expected = 1;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_2() {

		DavisStaircase alg = new DavisStaircase();

		int actual = alg.solve(7), expected = 44;

		Assert.assertEquals(expected, actual);
	}
}

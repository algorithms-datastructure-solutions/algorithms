import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class PrimalityTest {

	@Test
	public void Test_1() {

		Primality alg = new Primality();

		boolean actual = alg.solve(10), expected = false;

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void Test_2() {

		Primality alg = new Primality();

		boolean actual = alg.solve(27), expected = true;

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void Test_3() {

		Primality alg = new Primality();

		boolean actual = alg.solve(99), expected = true;

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void Test_4() {

		Primality alg = new Primality();

		boolean actual = alg.solve(250), expected = false;

		Assert.assertEquals(expected, actual);

	}
}

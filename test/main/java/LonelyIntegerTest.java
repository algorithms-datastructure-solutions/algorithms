import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class LonelyIntegerTest {

	@Test
	public void Test_1() {

		LonelyInteger alg = new LonelyInteger();

		int actual = alg.solve(new int[] { 1, 1, 2 }), expected = 2;

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void Test_2() {

		LonelyInteger alg = new LonelyInteger();

		int actual = alg.solve(new int[] { 0, 0, 1, 2, 1 }), expected = 2;

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void Test_3() {

		LonelyInteger alg = new LonelyInteger();

		int actual = alg.solve(new int[] { 4, 9, 95, 93, 57, 4, 57, 93, 9 }), expected = 95;

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void Test_4() {

		LonelyInteger alg = new LonelyInteger();

		int actual = alg.solve(new int[] { 59, 88, 14, 8, 85, 1, 94, 74, 57, 96, 39, 2, 47, 43, 35, 17, 53, 52, 92, 31,
				99, 48, 94, 30, 92, 60, 32, 45, 88, 13, 39, 50, 22, 65, 89, 46, 65, 76, 57, 67, 99, 35, 76, 46, 85, 82,
				45, 62, 53, 80, 74, 22, 31, 52, 82, 13, 41, 96, 2, 1, 80, 62, 4, 20, 50, 89, 59, 67, 60, 8, 41, 14, 47,
				48, 17, 4, 43, 30, 32 }), expected = 20;

		Assert.assertEquals(expected, actual);

	}
}

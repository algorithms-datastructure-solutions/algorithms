import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class ArrayLeftRotationTest {

	@Test
	public void Test_1() {

		ArrayLeftRotation alg = new ArrayLeftRotation();
		int rotations = 2;
		int[] array = new int[] { 1, 2, 3, 4, 5 };

		int[] actual = alg.solve(rotations, array), expected = new int[] { 3, 4, 5, 1, 2 };

		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void Test_2() {

		ArrayLeftRotation alg = new ArrayLeftRotation();
		int rotations = 5;
		int[] array = new int[] { 1, 2, 3, 4, 5 };

		int[] actual = alg.solve(rotations, array), expected = new int[] { 1, 2, 3, 4, 5 };

		Assert.assertArrayEquals(expected, actual);
	}

}

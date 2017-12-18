import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class SparseArraysTest {

	private SparseArrays alg = new SparseArrays();
	int[] actual = null, expected = null;

	@Test
	public void Test_1() {

		actual = alg.solve(4, new String[] { "aba", "baba", "aba", "xzxb" }, new String[] { "aba", "xzxb", "ab" });

		expected = new int[] { 2, 1, 0 };

		Assert.assertArrayEquals(expected, actual);
	}

}

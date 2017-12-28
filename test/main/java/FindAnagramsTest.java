import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class FindAnagramsTest {

	private FindAnagrams alg = new FindAnagrams();
	private String[] actual, expected;

	@Test
	public void Test_1() {

		actual = alg.solve("eatateteatae", "ate");
		expected = new String[] { "tea", "eat", "tae" };

		Assert.assertArrayEquals(expected, actual);

	}

	@Test
	public void Test_2() {

		actual = alg.solve("abateatas", "tea");
		expected = new String[] { "ate", "eat" };

		Assert.assertArrayEquals(expected, actual);

	}
}

import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class PalindromeTest {

	private Palindrome alg = new Palindrome();
	private String actual, expected;

	@Test
	public void Test_1() {

		actual = alg.solve("aaabbbb");
		expected = "YES";

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_2() {

		actual = alg.solve("cdefghmnopqrstuvw");
		expected = "NO";

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_3() {

		actual = alg.solve("cdcdcdcdeeeef");
		expected = "YES";

		Assert.assertEquals(expected, actual);
	}

}

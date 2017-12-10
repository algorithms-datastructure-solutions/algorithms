import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class MakingAnagramsTest {

	@Test
	public void Test_1() {

		MakingAnagrams alg = new MakingAnagrams();

		String first = "cde", second = "abc";

		int actual = alg.solve(first, second), expected = 4;

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void FirstandSecondMustBeTheSameLength() {

		MakingAnagrams alg = new MakingAnagrams();

		String first = "cde", second = "abce";

		int actual = alg.solve(first, second), expected = 0;

		Assert.assertEquals(expected, actual);

	}
}

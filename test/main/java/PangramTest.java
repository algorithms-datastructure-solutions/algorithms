import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class PangramTest {

	private Pangram alg = new Pangram();
	private String actual, expected;

	@Test
	public void Test_1() {

		actual = alg.solve(new String[] { "we promptly judged antique ivory buckles for the next prize",
				"we promptly judged antique ivory buckles for the prizes",
				"the quick brown fox jumps over the lazy dog", "the quick brown fox jump over the lazy dog" });
		expected = "1010";

		Assert.assertEquals(expected, actual);
	}

}

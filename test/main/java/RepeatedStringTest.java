import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class RepeatedStringTest {

	private RepeatedString alg = new RepeatedString();
	private long actual, expected;

	@Test
	public void Test_1() {

		actual = alg.solve("aba", 10);
		expected = 7;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_2() {

		actual = alg.solve(
				"ojowrdcpavatfacuunxycyrmpbkvaxyrsgquwehhurnicgicmrpmgegftjszgvsgqavcrvdtsxlkxjpqtlnkjuyraknwxmnthfpt",
				685118368975L);
		expected = 41107102139L;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_3() {

		actual = alg.solve("cfimaakj", 554045874191L);
		expected = 138511468548L;

		Assert.assertEquals(expected, actual);
	}
}

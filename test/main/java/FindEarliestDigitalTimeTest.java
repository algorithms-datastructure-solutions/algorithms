import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author medany
 */

public class FindEarliestDigitalTimeTest {

	@Test
	public void Test_1() {
		String digits = "635241";

		FindEarliestDigitalTime alg = new FindEarliestDigitalTime();
		String actual = alg.solve(digits), expected = "12:34:56";

		assertEquals(expected, actual);
	}

	@Test
	public void Test_2() {
		String digits = "000789";

		FindEarliestDigitalTime alg = new FindEarliestDigitalTime();
		String actual = alg.solve(digits), expected = "07:08:09";

		assertEquals(expected, actual);
	}
}

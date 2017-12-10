import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class RansomNoteTest {

	@Test
	public void Test_YES() {

		RansomNote alg = new RansomNote();

		String msg = "give me one grand today night", note = "give one grand today";

		String actual = alg.solve(msg, note), expected = "Yes";

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void Test_NO() {

		RansomNote alg = new RansomNote();

		String msg = "two times three is not four", note = "two times two is four";

		String actual = alg.solve(msg, note), expected = "No";

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void Test_YES_2() {

		RansomNote alg = new RansomNote();

		String msg = "apgo clm w lxkvg mwz elo bg elo lxkvg elo apgo apgo w elo bg", note = "elo lxkvg bg mwz clm w";

		String actual = alg.solve(msg, note), expected = "Yes";

		Assert.assertEquals(expected, actual);

	}
}

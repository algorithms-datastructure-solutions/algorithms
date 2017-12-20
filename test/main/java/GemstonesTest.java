
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class GemstonesTest {

	Gemstones alg = new Gemstones();
	int actual, expected;

	@Test
	public void Test_1() {

		actual = alg.solve(new String[] { "abcdde", "baccd", "eeabg" });
		expected = 2;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_2() {
		BufferedReader ir = null;
		FileReader i = null;

		try {
			i = new FileReader(
					new File(this.getClass().getClassLoader().getResource("getsotnes_input").getPath()));
			ir = new BufferedReader(i);
			String[] gems;
			String line = ir.readLine();

			gems = new String[Integer.parseInt(line)];

			int q = 0;
			while ((line = ir.readLine()) != null && q < gems.length) {
				gems[q] = line;
				q++;
			}

			actual = alg.solve(gems);
			expected = 5;

			Assert.assertEquals(expected, actual);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ir != null)
					ir.close();
				if (i != null)
					i.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}

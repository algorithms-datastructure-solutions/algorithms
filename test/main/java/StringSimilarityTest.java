import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class StringSimilarityTest {

	private StringSimilarity alg = new StringSimilarity();
	private long actual, expected;

	@Test
	public void Test_1() {

		actual = alg.solve("ababaa");
		expected = 11;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_2() {

		actual = alg.solve("aa");
		expected = 3;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_3() {

		actual = alg.solve("eabdcbbeeedbdaebdedbcbdcdeeaebbdbedbdbccbaaeababba");
		expected = 63;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_4() {

		BufferedReader ir = null;
		FileReader i = null;

		try {
			i = new FileReader(
					new File(this.getClass().getClassLoader().getResource("string_similarity_input").getPath()));
			ir = new BufferedReader(i);
			String line = ir.readLine();

			actual = alg.solve(line);
			expected = 37987996;

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

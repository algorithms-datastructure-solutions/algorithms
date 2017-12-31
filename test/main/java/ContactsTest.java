import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class ContactsTest {

	private Contacts alg = new Contacts();
	Integer[] actual = null, expected = null;

	@Test
	public void Test_1() {

		actual = alg.solve(new String[] { "add hack", "add hackerrank", "find hac", "find hak" }, 2);
		expected = new Integer[] { 2, 0 };

		Assert.assertArrayEquals(expected, actual);

	}

	@Test
	public void Test_2() {

		BufferedReader ir = null, or = null;
		FileReader i = null, o = null;

		try {
			i = new FileReader(new File(this.getClass().getClassLoader().getResource("contacts_input").getPath()));
			o = new FileReader(new File(this.getClass().getClassLoader().getResource("contacts_output").getPath()));
			ir = new BufferedReader(i);
			or = new BufferedReader(o);
			int n = 0;
			String[] lines;
			String line = ir.readLine();

			n = Integer.parseInt(line);
			lines = new String[n];

			int l = 0, f = 0;
			while ((line = ir.readLine()) != null) {
				lines[l] = line;
				if (line.split(" ")[0].equals("find"))
					f++;
				l++;
			}

			expected = new Integer[f];
			l = 0;
			while ((line = or.readLine()) != null) {
				expected[l] = Integer.parseInt(line);
				l++;
			}

			actual = alg.solve(lines, f);
			Assert.assertArrayEquals(expected, actual);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ir != null)
					ir.close();
				if (or != null)
					or.close();
				if (i != null)
					i.close();
				if (o != null)
					o.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

	@Test
	public void Test_3() {

		actual = alg.solve(new String[] { "add s", "add ss", "add sss", "add ssss", "add sssss", "find s", "find ss",
				"find sss", "find ssss", "find sssss", "find ssssss" }, 6);
		expected = new Integer[] { 5, 4, 3, 2, 1, 0 };

		Assert.assertArrayEquals(expected, actual);

	}

}
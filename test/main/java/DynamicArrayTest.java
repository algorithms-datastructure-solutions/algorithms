import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class DynamicArrayTest {

	private DynamicArray alg = new DynamicArray();
	Integer[] actual = null, expected = null;

	@Test
	public void Test_1() {

		BufferedReader ir = null, or = null;
		FileReader i = null, o = null;

		try {
			i = new FileReader(
					new File(this.getClass().getClassLoader().getResource("dynamic_array_input_1").getPath()));
			o = new FileReader(
					new File(this.getClass().getClassLoader().getResource("dynamic_array_output_1").getPath()));
			ir = new BufferedReader(i);
			or = new BufferedReader(o);
			int n = 0;
			String[] queries;
			String line = ir.readLine();

			n = Integer.parseInt(line.split(" ")[0]);
			queries = new String[Integer.parseInt(line.split(" ")[1])];

			int q = 0, r = 0;
			while ((line = ir.readLine()) != null && q < queries.length) {
				if (line.charAt(0) == '2')
					r++;
				queries[q] = line;
				q++;
			}

			actual = alg.solve(n, queries);
			expected = new Integer[r];

			int e = 0;
			while ((line = or.readLine()) != null && e < expected.length) {
				expected[e] = Integer.parseInt(line);
				e++;
			}

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
	public void Test_2() {

		BufferedReader ir = null, or = null;
		FileReader i = null, o = null;

		try {
			i = new FileReader(
					new File(this.getClass().getClassLoader().getResource("dynamic_array_input_2").getPath()));
			o = new FileReader(
					new File(this.getClass().getClassLoader().getResource("dynamic_array_output_2").getPath()));
			ir = new BufferedReader(i);
			or = new BufferedReader(o);
			int n = 0;
			String[] queries;
			String line = ir.readLine();

			n = Integer.parseInt(line.split(" ")[0]);
			queries = new String[Integer.parseInt(line.split(" ")[1])];

			int q = 0, r = 0;
			while ((line = ir.readLine()) != null && q < queries.length) {
				if (line.charAt(0) == '2')
					r++;
				queries[q] = line;
				q++;
			}

			actual = alg.solve(n, queries);
			expected = new Integer[r];

			int e = 0;
			while ((line = or.readLine()) != null && e < expected.length) {
				expected[e] = Integer.parseInt(line);
				e++;
			}

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

		BufferedReader ir = null, or = null;
		FileReader i = null, o = null;

		try {
			i = new FileReader(
					new File(this.getClass().getClassLoader().getResource("dynamic_array_input_3").getPath()));
			o = new FileReader(
					new File(this.getClass().getClassLoader().getResource("dynamic_array_output_3").getPath()));
			ir = new BufferedReader(i);
			or = new BufferedReader(o);
			int n = 0;
			String[] queries;
			String line = ir.readLine();

			n = Integer.parseInt(line.split(" ")[0]);
			queries = new String[Integer.parseInt(line.split(" ")[1])];

			int q = 0, r = 0;
			while ((line = ir.readLine()) != null && q < queries.length) {
				if (line.charAt(0) == '2')
					r++;
				queries[q] = line;
				q++;
			}

			actual = alg.solve(n, queries);
			expected = new Integer[r];

			int e = 0;
			while ((line = or.readLine()) != null && e < expected.length) {
				expected[e] = Integer.parseInt(line);
				e++;
			}

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
}

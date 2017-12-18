import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class ArrayManipulationTest {

	private ArrayManipulation alg = new ArrayManipulation();
	long actual, expected;

	@Test
	public void Test_1() {

		BufferedReader ir = null;
		FileReader i = null;

		try {
			i = new FileReader(
					new File(this.getClass().getClassLoader().getResource("array_manipulation_input_1").getPath()));
			ir = new BufferedReader(i);

			String line = ir.readLine();

			int n = Integer.parseInt(line.split(" ")[0]), m = Integer.parseInt(line.split(" ")[1]);
			String[] array = new String[m];

			int q = 0;
			while ((line = ir.readLine()) != null && q < array.length) {
				array[q] = line;
				q++;
			}

			actual = alg.solve(n, m, array);
			expected = 200L;

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

	@Test
	public void Test_2() {

		BufferedReader ir = null;
		FileReader i = null;

		try {
			i = new FileReader(
					new File(this.getClass().getClassLoader().getResource("array_manipulation_input_2").getPath()));
			ir = new BufferedReader(i);

			String line = ir.readLine();

			int n = Integer.parseInt(line.split(" ")[0]), m = Integer.parseInt(line.split(" ")[1]);
			String[] array = new String[m];

			int q = 0;
			while ((line = ir.readLine()) != null && q < array.length) {
				array[q] = line;
				q++;
			}

			actual = alg.solve(n, m, array);
			expected = 7542539201L; // 2497169732L

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

	@Test
	public void Test_3() {

		BufferedReader ir = null;
		FileReader i = null;

		try {
			i = new FileReader(
					new File(this.getClass().getClassLoader().getResource("array_manipulation_input_3").getPath()));
			ir = new BufferedReader(i);

			String line = ir.readLine();

			int n = Integer.parseInt(line.split(" ")[0]), m = Integer.parseInt(line.split(" ")[1]);
			String[] array = new String[m];

			int q = 0;
			while ((line = ir.readLine()) != null && q < array.length) {
				array[q] = line;
				q++;
			}

			actual = alg.solve(n, m, array);
			expected = 2497169732L;

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

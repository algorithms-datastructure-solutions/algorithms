import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class BalancedBracketsTest {

	@Test
	public void Test_YES() {

		BalancedBrackets alg = new BalancedBrackets();

		String expression = "{[()]}";

		String actual = alg.solve(expression), expected = "YES";

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void Test_NO() {

		BalancedBrackets alg = new BalancedBrackets();

		String expression = "{(())}(";

		String actual = alg.solve(expression), expected = "NO";

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void Test_YES_2() {

		BalancedBrackets alg = new BalancedBrackets();

		String expression = "{{[[(())]]}}";

		String actual = alg.solve(expression), expected = "YES";

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void Test_Bulk() {

		BalancedBrackets alg = new BalancedBrackets();

		BufferedReader ir = null, or = null;
		FileReader i = null, o = null;

		try {
			i = new FileReader(new File(this.getClass().getClassLoader().getResource("brackets_input").getPath()));
			o = new FileReader(new File(this.getClass().getClassLoader().getResource("brackets_output").getPath()));
			ir = new BufferedReader(i);
			or = new BufferedReader(o);
			String expression;

			while ((expression = ir.readLine()) != null) {
				String actual = "", expected = "";

				actual = alg.solve(expression);
				expected = or.readLine();
				Assert.assertEquals(expected, actual);
			}

		} catch (

		IOException e) {
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

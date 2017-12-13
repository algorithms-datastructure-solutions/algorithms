import java.text.ParseException;

import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.Test;

/**
 * @author medany
 */

public class ThirdLatestDateTest {

	private ThirdLatestDate alg = new ThirdLatestDate();
	private Date[] dates = null;
	Date actual = null, expected = null;

	@Test
	public void Test_1() throws ParseException {

		dates = getDates(
				new String[] { "14-04-2001", "29-12-2061", "21-10-2019", "07-01-1973", "19-07-2014", "11-03-1992" });

		actual = alg.solve(dates);
		expected = new Date("19-07-2014");

		test(expected, actual);

	}

	@Test
	public void Test_2() {

		dates = getDates(new String[] { "14-04-2001", "29-12-2061", "21-10-2019", "07-01-1973", "19-07-2014",
				"11-03-1992", "21-10-2019" });

		actual = alg.solve(dates);
		expected = new Date("19-07-2014");

		test(expected, actual);
	}

	@Test
	public void Test_3() {

		dates = getDates(new String[] { "14-04-2001", "29-12-2061", "29-12-2061", "21-10-2019", "07-01-1973",
				"19-07-2014", "19-07-2014", "11-03-1992" });

		actual = alg.solve(dates);
		expected = new Date("19-07-2014");

		test(expected, actual);
	}

	@Test
	public void Test_4() {

		dates = getDates(new String[] { "01-10-2015", "01-09-2015", "01-08-2015", "01-07-2015", "01-06-2015" });

		actual = alg.solve(dates);
		expected = new Date("01-08-2015");

		test(expected, actual);
	}

	@Test
	public void Test_5() {

		dates = getDates(
				new String[] { "25-01-2015", "24-01-2015", "23-01-2015", "22-01-2015", "21-01-2015", "20-01-2015" });

		actual = alg.solve(dates);
		expected = new Date("23-01-2015");

		test(expected, actual);
	}

	@Test
	public void Test_6() {

		dates = getDates(new String[] { "01-08-2011", "01-09-2012", "01-10-2015", "01-11-2014", "01-12-2013" });

		actual = alg.solve(dates);
		expected = new Date("01-12-2013");

		test(expected, actual);
	}

	@Test
	public void Test_7() {

		dates = getDates(new String[] { "18-01-1998", "19-01-1999", "20-01-2002", "21-01-2001", "22-01-2000" });

		actual = alg.solve(dates);
		expected = new Date("22-01-2000");

		test(expected, actual);
	}

	private Date[] getDates(String[] datesStrings) {
		Date[] dates = new Date[datesStrings.length];
		for (int i = 0; i < datesStrings.length; i++) {
			dates[i] = new Date(datesStrings[i]);
		}
		return dates;
	}

	private void test(Date expected, Date actual) {
		try {
			Assert.assertEquals(expected.toString(), actual.toString());
		} catch (ComparisonFailure failed) {
			System.out.println(failed.getStackTrace()[3].getMethodName() + " failed, " + failed.getMessage());
		}
	}
}

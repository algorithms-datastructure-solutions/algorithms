
/**
 * @author medany
 */

public class LeapYear {
	public boolean solve(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? true : false;
	}
}

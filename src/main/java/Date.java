/**
 * @author medany
 */

public class Date {

	Integer year;
	Integer month;
	Integer day;

	public Date(String date) {
		String[] d = date.split("-");
		this.day = Integer.parseInt(d[0]);
		this.month = Integer.parseInt(d[1]);
		this.year = Integer.parseInt(d[2]);
	}

	@Override
	public String toString() {
		return day + "-" + month + "-" + year;
	}
}
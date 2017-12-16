import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author medany
 */

/*
 * find the latest thied date among array of custom Date object of day, month
 * and year integers
 */

public class ThirdLatestDate {

	public Date solve(Date[] dates) {
		Set<Date> sortedDates = new TreeSet<Date>(new Comparator<Date>() {
			@Override
			public int compare(Date i, Date j) {
				return i.year.compareTo(j.year);
			}
		}.thenComparing(new Comparator<Date>() {
			@Override
			public int compare(Date i, Date j) {
				return i.month.compareTo(j.month);
			}
		}.thenComparing(new Comparator<Date>() {
			@Override
			public int compare(Date i, Date j) {
				return i.day.compareTo(j.day);
			}
		})));

		for (Date date : dates) {
			sortedDates.add(date);
		}

		return (Date) sortedDates.toArray()[sortedDates.size() - 3];
	}
}
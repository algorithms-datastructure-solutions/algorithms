import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
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

		Map<Integer, Set<Date>> sortedDates = new TreeMap<Integer, Set<Date>>(new Comparator<Integer>() {
			@Override
			public int compare(Integer i, Integer j) {
				return j.compareTo(i);
			}

		});

		for (Date date : dates) {
			if (sortedDates.containsKey(date.year)) {
				sortedDates.get(date.year).add(date);
			} else {
				Set<Date> yearDates = new TreeSet<Date>(new Comparator<Date>() {

					SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");

					public int compare(Date d1, Date d2) {

						java.util.Date date1 = null, date2 = null;
						try {
							date1 = f.parse(d1.day + "-" + d1.month + "-" + d1.year);
							date2 = f.parse(d2.day + "-" + d2.month + "-" + d2.year);
						} catch (ParseException e) {
						}
						return date2.compareTo(date1);
					}
				});

				yearDates.add(date);
				sortedDates.put(date.year, yearDates);
			}
		}

		Date thirdLatesDate = null;
		int i = 0;
		for (Set<Date> sd : sortedDates.values()) {
			for (Date d : sd) {
				thirdLatesDate = d;
				if (i == 2) {
					return d;
				} else {
					i++;
					continue;
				}
			}
		}

		return thirdLatesDate;

	}
}
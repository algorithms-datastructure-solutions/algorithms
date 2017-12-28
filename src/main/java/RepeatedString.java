/**
 * @author medany
 */

/*
 * Print a single integer denoting the number of letter a's in the first n
 * letters of the infinite string created by repeating s infinitely many times.
 */

public class RepeatedString {

	public long solve(String s, long n) {
		long num = 0, repeats = 0, aCount = 0;
		if (s.equals("a")) {
			return n;
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'a') {
					aCount++;
				}
			}

			repeats = n / s.length();

			if (repeats * s.length() == n) {
				return aCount * repeats;
			} else {
				num = aCount * repeats;
				String remain = s.substring(0, (int) n - (int) (s.length() * repeats));
				for (int i = 0; i < remain.length(); i++) {
					if (remain.charAt(i) == 'a') {
						num++;
					}
				}
			}
		}
		return num;
	}
}

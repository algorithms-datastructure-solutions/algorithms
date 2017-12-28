
/**
 * @author medany
 */

/*
 * For two strings A and B, we define the similarity of the strings to be the
 * length of the longest prefix common to both strings. For example, the
 * similarity of strings "abc" and "abd" is 2, while the similarity of strings
 * "aaa" and "aaab" is 3.
 * 
 * Calculate the sum of similarities of a string S with each of it's suffixes.
 */
public class StringSimilarity {

	public long solve(String a) {

		long similarities = a.length();
		String suffix = new String(a.substring(1));
		int i;

		while (!suffix.isEmpty()) {
			for (i = 0; i < suffix.length(); i++) {
				if (suffix.charAt(i) == a.charAt(i)) {
					similarities += 1;
				} else
					break;
			}
			suffix = suffix.substring(1);
		}

		return similarities;
	}

}

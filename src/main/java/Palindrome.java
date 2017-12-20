
/**
 * @author medany
 */

/*
 * figure out whether any anagram of the string can be a Palindrome or not
 */
public class Palindrome {

	public String solve(String s) {
		String result = "YES";

		int[] letters = new int[26];

		for (int c = 0; c < s.length(); c++) {
			letters[s.charAt(c) - 'a']++;
		}

		if (s.length() % 2 == 0) {
			for (int l : letters) {
				if (l % 2 != 0) {
					result = "NO";
					break;
				}
			}
		} else {
			int oddCount = 0;
			for (int l : letters) {
				if (!(l % 2 == 0))
					oddCount++;

				if (l % 2 != 0 && oddCount > 1) {
					result = "NO";
					break;
				}
			}
		}

		return result;
	}
}

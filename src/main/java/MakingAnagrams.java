
/**
 * @author medany
 */

/*
 * Alice is taking a cryptography class and finding anagrams to be very useful.
 * We consider two strings to be anagrams of each other if the first string's
 * letters can be rearranged to form the second string. In other words, both
 * strings must contain the same exact letters in the same exact frequency For
 * example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
 * 
 * Alice decides on an encryption scheme involving two large strings where
 * encryption is dependent on the minimum number of character deletions required
 * to make the two strings anagrams. Can you help her find this number?
 * 
 * Given two strings, and , that may or may not be of the same length, determine
 * the minimum number of character deletions required to make and anagrams. Any
 * characters can be deleted from either of the strings.
 */

public class MakingAnagrams {

	public int solve(String first, String second) {

		if (first.length() != second.length())
			return 0;

		int required = 0;

		int[] letters = new int[26];

		for (char f : first.toCharArray()) {
			letters[f - 'a']++;
		}

		for (char s : second.toCharArray()) {
			letters[s - 'a']--;
		}

		for (int l : letters) {
			required += Math.abs(l);
		}

		return required;

	}
}

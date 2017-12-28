import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author mohamed
 */

/*
 * Find if a String A contains anagrams of a String B
 */

public class FindAnagrams {

	private static int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
			83, 89, 97, 101 };

	public String[] solve(String haystack, String needle) {
		final String word = haystack.toLowerCase().trim();
		final String anagram = needle.toLowerCase().trim();
		final Set<String> anagrams = new HashSet<>();

		long anagramProduct = 1;

		// 01. calculate product of given String B
		for (int i = 0; i < anagram.length(); i++) {
			anagramProduct *= primes[anagram.charAt(i) - 'a'];
		}

		final Map<Long, Integer> cumprods = new LinkedHashMap<>();

		long cumprod = 1;
		for (int i = 0; i < word.length(); i++) {
			String current = "";
			// 02. calculate cumulative product of String A
			cumprod *= primes[word.charAt(i) - 'a'];
			// 03. add cumulative product to a Set
			cumprods.put(cumprod, i);

			if (cumprod % anagramProduct == 0) {
				if (cumprod == anagramProduct || cumprods.containsKey(cumprod / anagramProduct)) {
					current = word.substring(i - anagram.length() + 1, i + 1);
					if (!anagram.equals(current))
						anagrams.add((word.substring(i - anagram.length() + 1, i + 1)));
				}
			}
		}
		return anagrams.toArray(new String[] {});
	}
}
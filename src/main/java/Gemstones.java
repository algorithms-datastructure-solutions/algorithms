
/**
 * @author medany
 */

/*
 * Given the list of N rocks with their compositions, display the number of
 * gem-elements that exist in those rocks. An element is called a gem-element if
 * it occurs at least once in each of the rocks.
 */

public class Gemstones {

	public int solve(String[] gems) {
		int result = 0;
		int[] letters = new int[26];
		for (int i = 0; i < gems.length; i++) {
			String gem = gems[i];
			char g;
			while (!gem.isEmpty()) {
				g = gem.charAt(0);
				letters[g - 'a'] += 1;
				gem = gem.replaceAll("" + g, "");

				// increment result only if a letters occurs in all gems
				result += letters[g - 'a'] == gems.length ? 1 : 0;
			}
		}
		return result;
	}

}

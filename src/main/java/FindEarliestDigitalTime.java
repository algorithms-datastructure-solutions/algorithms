import java.util.Set;
import java.util.TreeSet;

/**
 * @author medany
 */

public class FindEarliestDigitalTime {

	public String solve(String s) {

		Set<String> permutations = generatePermutations(s);

		String hours = "", minutes = "", seconds = "";

		for (String perm : permutations) {
			hours = "" + perm.charAt(0) + perm.charAt(1);
			minutes = "" + perm.charAt(2) + perm.charAt(3);
			seconds = "" + perm.charAt(4) + perm.charAt(5);

			if (Integer.parseInt(hours) <= 12 && Integer.parseInt(minutes) <= 60 && Integer.parseInt(seconds) <= 60) {
				return hours + ":" + minutes + ":" + seconds;
			}
		}

		return "NOT POSSIBLE";

	}

	private static Set<String> generatePermutations(String s) {
		Set<String> permutations = new TreeSet<String>();

		if (s == null | s.isEmpty())
			return permutations;

		permutations.add(s.substring(0, 1));
		Set<String> temp = new TreeSet<String>();
		for (char a : s.substring(1).toCharArray()) {
			temp.clear();
			temp.addAll(permutations);
			permutations.clear();
			for (String t : temp) {
				permutations.addAll(getPermutations(t, a));
			}
		}
		return permutations;
	}

	private static Set<String> getPermutations(String s, char a) {
		Set<String> permutations = new TreeSet<String>();
		for (int i = 0; i <= s.length(); i++) {
			String temp = s.substring(0, i) + a + s.substring(i);
			permutations.add(temp);
		}
		return permutations;
	}
}


/**
 * @author medany
 */

/*
 * a word or sentence is called to be pangram if it contains all the alphabet
 * letters.
 */
public class Pangram {

	public String solve(String[] strings) {
		StringBuilder result = new StringBuilder();
		for (String string : strings) {
			String alphabet = "abcdefghijklmnopqrstuvwxyz";
			for (int i = 0; i < string.length(); i++) {
				char current = string.charAt(i);
				if (alphabet.indexOf(current) != -1) {
					alphabet = alphabet.replace("" + current, "");
					if (alphabet.length() == 0) {
						result.append(1);
					}
				}
			}
			if (!(alphabet.length() == 0)) {
				result.append(0);
			}
		}
		return result.toString();
	}

}

import java.util.HashMap;
import java.util.Map;

/**
 * @author medany
 */

/*
 * A kidnapper wrote a ransom note but is worried it will be traced back to him.
 * He found a magazine and wants to know if he can cut out whole words from it
 * and use them to create an untraceable replica of his ransom note. The words
 * in his note are case-sensitive and he must use whole words available in the
 * magazine, meaning he cannot use substrings or concatenation to create the
 * words he needs.
 * 
 * Given the words in the magazine and the words in the ransom note, print Yes
 * if he can replicate his ransom note exactly using whole words from the
 * magazine; otherwise, print No.
 */
public class RansomNote {

	public String solve(String msg, String note) {

		Map<String, Integer> msgMap = new HashMap<String, Integer>();

		for (String m : msg.split(" ")) {
			if (msgMap.containsKey(m))
				msgMap.put(m, msgMap.get(m) + 1);
			else
				msgMap.put(m, 1);
		}

		for (String n : note.split(" ")) {
			if (msgMap.containsKey(n) && msgMap.get(n) > 0)
				msgMap.put(n, msgMap.get(n) - 1);
			else
				return "No";
		}

		return "Yes";
	}
}

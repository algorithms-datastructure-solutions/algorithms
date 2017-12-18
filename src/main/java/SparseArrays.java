import java.util.HashMap;
import java.util.Map;

/**
 * @author medany
 */

/*
 * There is a collection N of strings ( There can be multiple occurences of a
 * particular string ). Each string's length is no more than 20 characters.
 * There are also Q queries. For each query, you are given a string, and you
 * need to find out how many times this string occurs in the given collection of
 * N strings.
 */
public class SparseArrays {

	public int[] solve(int n, String[] input, String[] queries) {

		int[] output = new int[queries.length];

		Map<String, Integer> inputMap = new HashMap<String, Integer>();
		for (String s : input) {
			if (inputMap.containsKey(s)) {
				inputMap.put(s, inputMap.get(s) + 1);
			} else {
				inputMap.put(s, 1);
			}
		}

		for (int i = 0; i < queries.length; i++) {
			if (inputMap.containsKey(queries[i])) {
				output[i] = inputMap.get(queries[i]);
			} else {
				output[i] = 0;
			}
		}

		return output;
	}
}

import java.util.HashMap;
import java.util.Map;

/**
 * @author medany
 */

/*
 * Each time Sunny and Johnny take a trip to the Ice Cream Parlor, they pool
 * together money dollars for ice cream. On any given day, the parlor offers a
 * line of n flavors. Each flavor, i, is numbered sequentially with a unique ID
 * number from 1 to n and has a cost, cost i, associated with it.
 * 
 * Given the value of money and the cost of each flavor for t trips to the Ice
 * Cream Parlor, help Sunny and Johnny choose two distinct flavors such that
 * they spend their entire pool of money during each visit. For each trip to the
 * parlor, print the ID numbers for the two types of ice cream that Sunny and
 * Johnny purchase as two space-separated integers on a new line. You must print
 * the smaller ID first and the larger ID second.
 */

public class IceCreamParlor {

	public int[] solve(int money, int[] flavors) {
		Map<Integer, Integer> hash = new HashMap<>();
		for (int i = 0; i < flavors.length; i++) {
			int complement = money - flavors[i];
			if (hash.containsKey(complement)) {
				return new int[] { hash.get(complement) + 1, i + 1 };
			}
			hash.put(flavors[i], i);
		}
		return new int[] {};
	}
}

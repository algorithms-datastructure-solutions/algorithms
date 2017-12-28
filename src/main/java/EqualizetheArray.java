import java.util.HashMap;
import java.util.Map;

/**
 * @author medany
 */

/*
 * Karl has an array n of integers defined as A = a0, a1, ..., an-1. In one
 * operation, he can delete any element from the array.
 * 
 * Karl wants all the elements of the array to be equal to one another. To do
 * this, he must delete zero or more elements from the array. Find and print the
 * minimum number of deletion operations Karl must perform so that all the
 * array's elements are equal.
 */

public class EqualizetheArray {

	public int solve(int[] arr) {
		Map<Integer, Integer> allOccurs = new HashMap<>();
		int maxOccurs = 0;
		for (int i = 0; i < arr.length; i++) {
			if (allOccurs.containsKey(arr[i])) {
				allOccurs.put(arr[i], allOccurs.get(arr[i]) + 1);
				if (allOccurs.get(arr[i]) > maxOccurs) {
					maxOccurs = allOccurs.get(arr[i]);
				}
			} else {
				allOccurs.put(arr[i], 1);
			}
		}
		return maxOccurs == 0 ? arr.length - 1 : arr.length - maxOccurs;
	}

}

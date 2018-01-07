
/**
 * @author medany
 */

/*
 * (Best case) O(n) if the array is already sorted, that means no swap occurred.
 * 
 * (Worst case) O(n^2) if the array is already sorted but in descending order.
 */

public class BubbleSort {

	public int[] solve(int[] a) {

		int[] result = new int[3];
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					result[0] += 1;
				}
			}
		}
		result[1] = a[0];
		result[2] = a[a.length - 1];

		return result;
	}

}

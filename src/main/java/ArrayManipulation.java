/**
 * @author medany
 */

/*
 * You are given a list(1-indexed) of size n, initialized with zeroes. You have
 * to perform m operations on the list and output the maximum of final values of
 * all the n elements in the list. For every operation, you are given three
 * integers a, b and k and you have to add value k to all the elements ranging
 * from index a to b (both inclusive).
 * 
 * For example, consider a list of size 3. The initial list would be a= [0, 0,
 * 0] and after performing the update O(a, b, k) = (2, 3, 30), the new list
 * would be a = [0, 30, 30]. Here, we've added value 30 to elements between
 * indices 2 and 3. Note the index of the list starts from 1.
 */

public class ArrayManipulation {

	public long solve(int n, int m, String[] operations) {
		long max = 0, temp = 0;
		long[] array = new long[n];

		for (int i = 0; i < m; i++) {
			String[] s = operations[i].split(" ");
			int a = Integer.parseInt(s[0]), b = Integer.parseInt(s[1]), k = Integer.parseInt(s[2]);
			array[a - 1] += k;
			if (b < n)
				array[b] -= k;
		}

		for (int i = 0; i < n; i++) {
			temp += array[i];
			if (temp > max)
				max = temp;
		}
		return max;
	}
}

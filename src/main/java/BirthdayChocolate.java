/**
 * @author medany
 */

/*
 * Lily has a chocolate bar consisting of a row of n squares where each square
 * has an integer written on it. She wants to share it with Ron for his
 * birthday, which falls on month m and day d. Lily wants to give Ron a piece of
 * chocolate only if it contains consecutive squares whose integers sum to d.
 * 
 * Given m, d, and the sequence of integers written on each square of Lily's
 * chocolate bar, how many different ways can Lily break off a piece of
 * chocolate to give to Ron?
 */
public class BirthdayChocolate {

	public int solve(int d, int m, int[] sequence) {
		int max = 0, count = 0;
		for (int i = 0; i < sequence.length; i++) {
			count = 0;
			for (int j = i; i + m > sequence.length ? j < sequence.length : j < i + m; j++) {
				count += sequence[j];
				if (count > d) {
					break;
				} else if (count == d && j == i + m - 1) {
					count = 0;
					max++;
					break;
				}
			}
		}
		return max;
	}
}

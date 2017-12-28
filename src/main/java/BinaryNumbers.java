/**
 * @author medany
 */

/*
 * Given a base-10 integer, n, convert it to binary (base-2). Then find and
 * print the base-10 integer denoting the maximum number of consecutive 1's in
 * n's binary representation.
 */
public class BinaryNumbers {

	public int solve(int decimal) {
		int max = 0, consecutive = 0;
		while (decimal != 0) {
			consecutive = decimal % 2 == 1 ? consecutive + 1 : 0;
			max = consecutive > max ? consecutive : max;
			decimal /= 2;
		}
		return max;
	}
}

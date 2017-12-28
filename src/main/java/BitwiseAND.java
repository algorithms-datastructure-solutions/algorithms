/**
 * @author medany
 */

public class BitwiseAND {
	public int solve(int n, int k) {
		return ((k - 1) | k) > n && k % 2 == 0 ? k - 2 : k - 1;
	}

}

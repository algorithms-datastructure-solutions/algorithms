
/**
 * @author medany
 */

public class LonelyInteger {

	public int solve(int[] array) {
		int num = 0;
		for (int i : array) {
			num = num ^ i;
		}
		return num;
	}
}

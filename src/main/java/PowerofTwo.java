
/**
 * @author medany
 */

public class PowerofTwo {

	public int[] solve(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			boolean test = nums[i] > 0 && ((nums[i] & (nums[i] - 1)) == 0);
			result[i] = test ? 1 : 0;
		}
		return result;
	}

}

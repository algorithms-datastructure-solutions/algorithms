
/**
 * @author medany
 */

/*
 * Davis has s staircases in his house and he likes to climb each staircase 1,
 * 2, or 3 steps at a time. Being a very precocious child, he wonders how many
 * ways there are to reach the top of the staircase.
 * 
 * Given the respective heights for each of the s staircases in his house, find
 * and print the number of ways he can climb each staircase on a new line.
 */

public class DavisStaircase {

	public int solve(int num) {
		switch (num) {
		case 0:
		case 1:
			return 1;
		default:
			if (num < 0)
				return 0;

			int[] waysArr = new int[num];

			waysArr[0] = 1;
			waysArr[1] = 2;
			waysArr[2] = 4;

			for (int i = 3; i < num; i++) {
				waysArr[i] = waysArr[i - 1] + waysArr[i - 2] + waysArr[i - 3];
			}
			int ways = waysArr[waysArr.length - 1];
			waysArr = null;
			return ways;
		}
	}
}


/**
 * @author medany
 */

/*
 * Given a number of dollars, n, and a list of dollar values for m distinct
 * coins, C = {c0, c1, c2,..., cm-1} , find and print the number of different
 * ways you can make change for dollars if each coin is available in an infinite
 * quantity.
 * 
 * @see https://www.youtube.com/watch?v=ZaVM057DuzE
 */

public class CoinChange {

	public long solve(int money, int[] coins) {

		long[] ways = new long[money + 1];
		ways[0] = (long) 1;
		for (int coin : coins) {
			for (int i = coin; i < ways.length; i++) {
				ways[i] += ways[i - coin];
			}
		}
		return ways[money];
	}
}

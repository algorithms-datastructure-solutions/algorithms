/**
 * @author medany
 */

public class EqualStacks {

	public int solve(int[] s1, int[] s2, int[] s3) {

		int result = 0;

		s1 = reverse(s1);
		s2 = reverse(s2);
		s3 = reverse(s3);

		s1 = sumAll(s1);
		s2 = sumAll(s2);
		s3 = sumAll(s3);

		s1 = reverse(s1);
		s2 = reverse(s2);
		s3 = reverse(s3);

		result = findFirstCommon(s1, s2, s3);

		return result;
	}

	private int[] reverse(int[] arr) {
		int[] reversed = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reversed[i] = arr[(arr.length - 1) - i];
		}

		return reversed;
	}

	// return a new array out of an existing array with each element is sum of all
	// the previous elements
	private int[] sumAll(int[] arr) {
		int[] result = new int[arr.length];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			result[i] = sum;
		}

		return result;
	}

	private int findFirstCommon(int[] s1, int[] s2, int s3[]) {

		if (s1.length < s2.length && s1.length < s3.length) {
			for (int i = 0; i < s1.length; i++) {
				for (int j = 0; j < s2.length; j++) {
					if (s1[i] == s2[j]) {
						for (int k = 0; k < s3.length; k++) {
							if (s2[j] == s3[k]) {
								return s1[i];
							}
						}
					}
				}
			}
		} else if (s2.length < s1.length && s2.length < s3.length) {
			for (int i = 0; i < s2.length; i++) {
				for (int j = 0; j < s1.length; j++) {
					if (s2[i] == s1[j]) {
						for (int k = 0; k < s3.length; k++) {
							if (s1[j] == s3[k]) {
								return s2[i];
							}
						}
					}
				}
			}
		} else if (s3.length < s1.length && s3.length < s2.length) {
			for (int i = 0; i < s3.length; i++) {
				for (int j = 0; j < s1.length; j++) {
					if (s3[i] == s1[j]) {
						for (int k = 0; k < s2.length; k++) {
							if (s1[j] == s2[k]) {
								return s3[i];
							}
						}
					}
				}
			}
		} else if (s1.length == s2.length && s2.length == s3.length) {
			for (int i = 0; i < s1.length; i++) {
				for (int j = 0; j < s2.length; j++) {
					if (s1[i] == s2[j]) {
						for (int k = 0; k < s3.length; k++) {
							if (s2[j] == s3[k]) {
								return s1[i];
							}
						}
					}
				}
			}
		}

		return 0;
	}
}

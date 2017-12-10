
/**
 * @author medany
 */

public class ArrayLeftRotation {

	// public int[] solve(int rotations, int[] array) {
	//
	// while (rotations > 0) {
	// for (int i = 0; i < array.length - 1; i++) {
	// int temp = array[i];
	// array[i] = array[i + 1];
	// array[i + 1] = temp;
	// }
	// rotations--;
	// }
	//
	// return array;
	// }

	public int[] solve(int rotations, int[] array) {

		int[] rotated = new int[array.length];

		for (int i = 0; i < rotated.length; i++) {
			int index = i - rotations < 0 ? array.length + (i - rotations) : i - rotations;
			rotated[index] = array[i];
		}

		return rotated;
	}

}

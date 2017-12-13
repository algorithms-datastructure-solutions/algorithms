
/**
 * @author medany
 */

public class Primality {

	public boolean solve(int number) {
		switch ("" + number) {
		case "0":
		case "1":
			return false;
		case "2":
		case "3":
			return true;
		default:
			if (number % 2 == 0)
				return false;
			int sqrt = (int) (Math.sqrt(number) + 1);
			for (int i = 3; i < sqrt; i += 2) {
				if (number % i == 0)
					return true;
			}
		}
		return false;
	}
}

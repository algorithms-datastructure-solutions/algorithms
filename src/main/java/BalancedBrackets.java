import java.util.Stack;

/**
 * @author medany
 */

public class BalancedBrackets {

	public String solve(String expression) {

		Stack<String> brackets = new Stack<String>();

		String current = brackets.pop();
		while (!brackets.isEmpty()) {
			switch (current) {
			case "{":
			case "[":
			case "(":
				brackets.push(current);
				break;

			case "}":
			case "]":
			case ")":
				if (!brackets.isEmpty()) {
					String last = brackets.pop();
					if ((current.equals("}") && !last.equals("{")) || (current.equals("]") && !last.equals("["))
							|| (current.equals(")") && !last.equals("(")))
						return "No";
				}
			}
		}

		return "Yes";
	}
}

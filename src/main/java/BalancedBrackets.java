import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author medany
 */

public class BalancedBrackets {

	public String solve(String expression) {

		Stack<String> brackets = new Stack<String>();

		for (int i = 0; i < expression.length(); i++) {
			String current = "" + expression.charAt(i);
			switch (current) {
			case "{":
			case "[":
			case "(":
				brackets.push(current);
				break;

			case "}":
			case "]":
			case ")":
				String last;
				try {
					last = brackets.pop();
					if ((current.equals("}") && !last.equals("{")) || (current.equals("]") && !last.equals("["))
							|| (current.equals(")") && !last.equals("(")))
						return "NO";
				} catch (EmptyStackException ese) {
					return "NO";
				}
			}
		}
		return brackets.isEmpty() ? "YES" : "NO";
	}

}

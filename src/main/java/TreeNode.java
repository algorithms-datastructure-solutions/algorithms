
/**
 * @author medany
 */

public class TreeNode {
	int data;
	TreeNode left, right;

	TreeNode(int data) {
		this.data = data;
		left = right = null;
	}

	@Override
	public String toString() {
		return data + ", ";
	}
}

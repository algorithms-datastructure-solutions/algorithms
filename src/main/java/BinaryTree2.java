/**
 * @author medany
 */

/*
 * Given the root node of a binary tree, can you determine if it's also a binary
 * search tree? Constraints : 0 <= data <= 1000
 */

public class BinaryTree2 {

	boolean solve(TreeNode root) {
		return solve(root, -1, 10001);
	}

	private boolean solve(TreeNode root, int min, int max) {
		if (root == null)
			return true;
		if (root.data <= min || root.data >= max)
			return false;
		return (solve(root.left, min, root.data) && solve(root.right, root.data, max));

	}
}

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author medany
 */

/*
 * Given the root of a tree node, return the max height of a Binary Tree
 */

public class BinaryTree {

	public int solve(TreeNode node) {

		if (node == null)
			return 0;

		Queue<TreeNode> nodes = new LinkedList<>();
		nodes.add(node);

		int height = 0;

		while (true) {
			int c = nodes.size();
			if (c == 0)
				return height;
			height++;

			while (c > 0) {
				TreeNode next = nodes.peek();
				nodes.remove();

				if (next.left != null)
					nodes.add(next.left);
				if (next.right != null)
					nodes.add(next.right);

				c--;
			}
		}
	}

	public int solveRecursive(TreeNode node) {
		if (node == null)
			return 0;
		else {
			/* compute the depth of each subtree */
			int lDepth = solveRecursive(node.left);
			int rDepth = solveRecursive(node.right);

			/* use the larger one */
			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}
	}
}

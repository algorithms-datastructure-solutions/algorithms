import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class BinaryTreeTest {

	private BinaryTree alg = new BinaryTree();
	private int actual, expected;

	@Test
	public void Test_Iterative() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		actual = alg.solve(root);
		expected = 3;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_Recursive() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		actual = alg.solve(root);
		expected = 3;

		Assert.assertEquals(expected, actual);
	}

}

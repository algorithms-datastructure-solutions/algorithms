import org.junit.Assert;
import org.junit.Test;

/**
 * @author medany
 */

public class BinaryTree2Test {

	private BinaryTree2 alg = new BinaryTree2();
	private boolean actual, expected;

	@Test
	public void Test_Recursive_1() {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(7);

		actual = alg.solve(root);
		expected = true;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void Test_Recursive_2() { // 1 2 4 3 5 6 7
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(7);

		actual = alg.solve(root);
		expected = false;

		Assert.assertEquals(expected, actual);
	}
}

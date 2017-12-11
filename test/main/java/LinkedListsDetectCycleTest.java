import org.junit.Assert;
import org.junit.Test;

import algorithms.LinkedListsDetectCycle;
import algorithms.Node;

/**
 * @author medany
 */

public class LinkedListsDetectCycleTest {

	@Test
	public void Test_True() {

		LinkedListsDetectCycle alg = new LinkedListsDetectCycle();

		Node head = new Node(1, new Node(2, new Node(3, null)));
		head.next.next.next = head.next;

		boolean actual = alg.solve(head), expected = true;

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void Test_False() {

		LinkedListsDetectCycle alg = new LinkedListsDetectCycle();

		Node head = new Node(1, null);

		boolean actual = alg.solve(head), expected = false;

		Assert.assertEquals(expected, actual);

	}

}

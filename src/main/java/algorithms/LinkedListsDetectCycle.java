package algorithms;

import java.util.ArrayList;
import java.util.List;

public class LinkedListsDetectCycle {

	public boolean solve(Node head) {
		List<String> visited = new ArrayList<String>();
		if (head == null) {
			return false;
		} else {
			visited.add("@" + System.identityHashCode(head));
			Node next = head.next;
			while (next != null) {
				int hash = System.identityHashCode(next);
				if (visited.contains("@" + hash)) {
					return true;
				} else {
					visited.add("@" + hash);
				}
				next = next.next;
			}
			return false;
		}
	}
}

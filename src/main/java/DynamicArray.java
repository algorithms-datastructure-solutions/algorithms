import java.util.ArrayList;
import java.util.List;

/**
 * @author medany
 */

/*
 * 
 * Create a list , seqList, of N empty sequences, where each sequence is indexed
 * from 0 to N-1. The elements within each of the sequences also use 0-indexing.
 * Create an integer, lastAnswer, and initialize it to 0. The types of queries
 * that can be performed on your list of sequences (seqList) are described
 * below: Query: 1 x y Find the sequence, seq, at index (x ^ lastAnswer) % N in
 * seqList. Append integer y to sequence . Query: 2 x y Find the sequence, seq,
 * at index (x ^ lastAnswer) % N in seqList. Find the value of element y % size
 * in seq (where is the size of seq) and assign it to lastAnswer. Print the new
 * value of on a new line
 * 
 */

public class DynamicArray {

	public Integer[] solve(int n, String[] queries) {

		List<Integer> output = new ArrayList<>();

		List<Integer>[] seqList = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			List<Integer> l = new ArrayList<>();
			seqList[i] = l;
		}

		int lastAnswer = 0, size = 0;

		for (String q : queries) {
			String[] input = q.split(" ");
			int type = Integer.parseInt(input[0]);
			int x = Integer.parseInt(input[1]), y = Integer.parseInt(input[2]);

			switch (type) {
			case 1:
				seqList[(x ^ lastAnswer) % n].add(y);
				break;
			case 2:
				size = seqList[(x ^ lastAnswer) % n].size();
				lastAnswer = seqList[(x ^ lastAnswer) % n].get(y % size);
				output.add(lastAnswer);
				break;
			}
		}

		return output.toArray(new Integer[output.size()]);
	}
}

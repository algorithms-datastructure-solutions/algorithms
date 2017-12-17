import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author medany
 */

public class DynamicArray {

	public Integer[] solve(int n, String[] queries) {

		List<Integer> output = new ArrayList<>();

		List<List<Integer>> seqList = new ArrayList<>(n);
		int N = n;
		for (int i = 0; i < N; N--) {
			List<Integer> l = new ArrayList<>(n);
			seqList.add(l);
		}

		int lastAnswer = 0;

		for (String q : queries) {
			int type = Integer.parseInt(q.split(" ")[0]);
			int x = Integer.parseInt(q.split(" ")[1]), y = Integer.parseInt(q.split(" ")[2]);

			switch (type) {
			case 1:
				seqList.get((x ^ lastAnswer) % n).add(y);
				break;
			case 2:
				int size = seqList.get((x ^ lastAnswer) % n).size();
				lastAnswer = seqList.get((x ^ lastAnswer) % n).get(y % size);
				output.add(lastAnswer);
				break;
			}
		}

		return output.toArray(new Integer[output.size()]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();

		List<List<Integer>> seqList = new ArrayList<>(N);
		int n = N;
		for (int i = 0; i < n; n--) {
			List<Integer> l = new ArrayList<>(N);
			seqList.add(l);
		}

		int lastAnswer = 0;

		while (Q > 0) {
			int type = sc.nextInt();
			int x, y;

			switch (type) {
			case 1:
				x = sc.nextInt();
				y = sc.nextInt();
				seqList.get((x ^ lastAnswer) % N).add(y);
				break;
			case 2:
				x = sc.nextInt();
				y = sc.nextInt();
				int size = seqList.get((x ^ lastAnswer) % N).size();
				lastAnswer = seqList.get((x ^ lastAnswer) % N).get(y % size);
				System.out.println(lastAnswer);
				break;
			}

			Q--;
		}

		sc.close();
	}
}

package cn.list.cc;

import java.util.LinkedList;
import java.util.List;

public class AndL1L2 {
	public static void main(String[] args) {
		List<Integer> L1 = new LinkedList<>();
		List<Integer> L2 = new LinkedList<>();
		for (int i = 0; i < 4; i++)
			L1.add(i);
		for (int i = 2; i < 7; i++)
			L2.add(i);
		System.out.println(intersect(L1,L2));
	}

	private static List<Integer> intersect(List<Integer> L1, List<Integer> L2) {
		List<Integer> result = new LinkedList<>();
		while (!L1.isEmpty() && !L2.isEmpty()) {
			if (L1.get(0) < L2.get(0))
				L1.remove(0);
			else if (L1.get(0) > L2.get(0))
				L2.remove(0);
			else {
				result.add(L1.get(0));
				L1.remove(0);
				L2.remove(0);
			}

		}
		return result;
	}
}

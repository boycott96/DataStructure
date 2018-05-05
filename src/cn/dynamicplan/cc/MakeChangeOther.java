package cn.dynamicplan.cc;

public class MakeChangeOther {
	public static void main(String[] args) {
		System.out.println(findMinCoins(new int[] { 1, 2, 5 }, 10));
		System.out.println(findMinCoins(new int[] { 1, 2, 5 }, 11));
	}

	private static int findMinCoins(int[] coins, int sum) {
		return findMinCoins(coins, sum, 0, 0);
	}

	private static int findMinCoins(int[] coins, int sum, int index, int count) {
		if (sum == 0)
			return count;
		if (index == coins.length)
			return 0;
		if (sum < 0)
			return 0;
		int countUsingIndex = findMinCoins(coins, sum - coins[index], index, count + 1);
		int countWithoutUsingIndex = findMinCoins(coins, sum, index + 1, count);
		if (countUsingIndex == 0)
			return countWithoutUsingIndex;
		if (countWithoutUsingIndex == 0)
			return countUsingIndex;
		return Math.min(countUsingIndex, countWithoutUsingIndex);
	}
}

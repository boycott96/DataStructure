package cn.dynamicplan.cc;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] coins = new int[n];
		for (int i = 0; i < n; i++)
			coins[i] = sc.nextInt();
		int sum = sc.nextInt();
		System.out.println(findMainCoins(coins, sum));
		sc.close();
	}

	private static int findMainCoins(final int[] coins, final int sum) {
		int[] calculationsCache = new int[sum + 1];
		for (int i = 0; i <= sum; i++)
			calculationsCache[i] = Integer.MAX_VALUE - 1;
		calculationsCache[0] = 0;
		for (int i = 1; i <= sum; i++)
			for (int coin : coins)
				if (i >= coin && calculationsCache[i - coin] + 1 < calculationsCache[i])
					calculationsCache[i] = calculationsCache[i - coin] + 1;
		return calculationsCache[sum];
	}
}

package com.example.tutorial.knapsack.zeroone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumSubsetDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter number of input: \n");
		int n = sc.nextInt();
		int[] weight = new int[n];
		
		for (int i = 0; i < n; i++) {
			Scanner sc2 = new Scanner(System.in);
			System.out.println("\nPlease provide input: \n");
			String lineInput = sc2.nextLine();
			weight[i] = Integer.parseInt(lineInput);
		}
		
		int minimumDifference = minimumSubsetSumDifference(weight, n);
		
		System.out.println(minimumDifference);
	}

	private static int minimumSubsetSumDifference(int[] v, int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += v[i];
		}
		boolean[][] t = subsetSumProblem(v, n, sum);
		List<Integer> subsetSumVector = new ArrayList<>();
		for (int i = 0; i < (sum + 1) / 2; i++) {
			if (t[n][i]) {
				subsetSumVector.add(i);
			}
		}
		int minimumDifference = sum;
		for (int i = 0; i < subsetSumVector.size(); i++) {
			minimumDifference = Integer.min(minimumDifference, sum - 2 * subsetSumVector.get(i));
		}
		return minimumDifference;
	}

	private static boolean[][] subsetSumProblem(int[] v, int n, int s) {
		boolean[][] t = new boolean[n + 1][s + 1];
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < s + 1; j++) {
				if (j == 0) {
					t[i][j] = true;
				} else if (i == 0) {
					t[i][j] = false;
				} else if (v[i - 1] <= j) {
					t[i][j] = t[i - 1][j] || t[i - 1][j - v[i - 1]];
				} else {
					t[i][j] = t[i - 1][j];
				}
			}
		}
		return t;

	}

}

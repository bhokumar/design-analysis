package com.example.tutorial.knapsack.zeroone;

import java.util.Scanner;

public class EqualSumPartitionProblem {

	private static boolean[][] t;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter number of input: \n");
		int n = sc.nextInt();
		int[] weight = new int[n];
		/*
		 * for (int i=0;i<n+1;i++) { for (int j=0; j < w+1; j++) { t[i][j] = 0; } }
		 */
		for (int i = 0; i < n; i++) {
			Scanner sc2 = new Scanner(System.in);
			System.out.println("\nPlease provide input: \n");
			String lineInput = sc2.nextLine();
			weight[i] = Integer.parseInt(lineInput);
		}

		System.out.println("\n");
		System.out.println(equalSumPartition(weight, n));

	}

	private static boolean equalSumPartition(int[] v, int n) {
		int totalSum = 0;
		for (int i = 0; i < n; i++) {
			totalSum += v[i];
		}
		if (totalSum % 2 == 0) {
			int requiredSum = totalSum / 2;
			t = new boolean[n + 1][requiredSum + 1];
			subsetSumProblem(v, n, requiredSum);
			return t[n][requiredSum];
		}
		return false;
	}

	private static void subsetSumProblem(int[] v, int n, int s) {
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < s + 1; j++) {
				if (j == 0) {
					t[i][j] = true;
				} else if (i == 0) {
					t[i][j] = false;
				} else if (v[i - 1] <= j) {
					t[i][j] = t[i - 1][j - v[i - 1]] || t[i - 1][j];
				} else {
					t[i][j] = t[i - 1][j];
				}
			}
		}
	}

}

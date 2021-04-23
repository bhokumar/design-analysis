package com.example.tutorial.knapsack.zeroone;

import java.util.Scanner;

public class CountOfSubsetOfGivenSum {

	private static int t[][];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter number of input: \n");
		int n = sc.nextInt();
		System.out.println("\nEnter sum \n");
		int w = sc.nextInt();
		int[] weight = new int[n];
		t = new int[n + 1][w + 1];
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
		subsetSumProblem(weight, n, w);
		System.out.println(t[n][w]);
	}

	private static void subsetSumProblem(int[] weight, int n, int s) {
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < s + 1; j++) {
				if (j == 0) {
					t[i][j] = 1;
				} else if (i == 0) {
					t[i][j] = 0;
				} else if (weight[i - 1] <= j) {
					t[i][j] = t[i - 1][j] + t[i - 1][j - weight[i - 1]];
				} else {
					t[i][j] = t[i - 1][j];
				}
			}
		}
	}
}

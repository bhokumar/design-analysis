package com.example.tutorial.knapsack.zeroone;

import java.util.Scanner;

public class CountOfSubsetOfGivenDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter number of input: \n");
		int n = sc.nextInt();
		System.out.println("\n Enter the difference : \n");
		int diff = sc.nextInt();
		int[] weight = new int[n];
		
		for (int i = 0; i < n; i++) {
			Scanner sc2 = new Scanner(System.in);
			System.out.println("\nPlease provide input: \n");
			weight[i] = sc2.nextInt();
		}
		
		int count = countSubsetWithGivenDifference(weight, n, diff);
		
		System.out.println(count);
	}

	private static int countSubsetWithGivenDifference(int[] v, int n, int diff) {
		int totalsum = 0;
		for (int i = 0; i < n; i++) {
			totalsum += v[i];
		}
		int sums1 = (totalsum + diff) /2;
		int[][] t = subsetSumProblem(v, n, sums1);
		return t[n][sums1];
		
	}

	private static int[][] subsetSumProblem(int[] v, int n, int s) {
		int[][] t = new int[n + 1][s + 1];
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < s + 1; j++) {
				if (j == 0) {
					t[i][j] = 1;
				} else if (i == 0) {
					t[i][j] = 0;
				} else if (v[i - 1] <= j) {
					t[i][j] = t[i - 1][j] + t[i - 1][j - v[i - 1]];
				} else {
					t[i][j] = t[i - 1][j];
				}
			}
		}
		return t;

	}

}

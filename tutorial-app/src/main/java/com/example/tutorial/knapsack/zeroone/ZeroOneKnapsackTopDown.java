package com.example.tutorial.knapsack.zeroone;

import java.util.Scanner;

public class ZeroOneKnapsackTopDown {

	private static int t[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter number of input: \n");
		int n = sc.nextInt();
		System.out.println("\nEnter weight of knapsack \n");
		int w = sc.nextInt();
		int[] weight = new int[n];
		int[] values = new int[n];
		t = new int[n + 1][w + 1];
		/*
		 * for (int i=0;i<n+1;i++) { for (int j=0; j < w+1; j++) { t[i][j] = 0; } }
		 */
		for (int i = 0; i < n; i++) {
			Scanner sc2 = new Scanner(System.in);
			System.out.println("\nPlease provide input: \n");
			String lineInput = sc2.nextLine();
			String[] splitLine = lineInput.split(" ");
			weight[i] = Integer.parseInt(splitLine[0]);
			values[i] = Integer.parseInt(splitLine[1]);
		}

		System.out.println("\n");
		knapsack(weight, values, w, n);
		System.out.println(t[n][w]);
	}

	static void knapsack(int[] weight, int[] values, int w, int n) {
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < w + 1; j++) {
				if (i== 0 || j==0) {
					t[i][j] = 0;
				} else if (weight[i-1] <= j) {
					t[i][j] = Integer.max(values[i-1] + t[i-1][j-weight[i-1]], t[i-1][j]);
				} else {
					t[i][j] = t[i-1][j];
				}
			}
		}
	}

}

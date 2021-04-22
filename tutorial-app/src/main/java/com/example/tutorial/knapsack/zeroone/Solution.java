package com.example.tutorial.knapsack.zeroone;

import java.util.Scanner;

public class Solution {

	private static int t[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter number of input: \n");
		int n = sc.nextInt();
		System.out.println("\nEnter weight of knapsack \n");
		int w = sc.nextInt();
        int[] weight = new int[n];
        int[] values = new int[n];
        t = new int[n+1][w+1];
        
        for (int i=0;i<n+1;i++) {
        	for (int j=0; j < w+1; j++) {
        		t[i][j] = -1;
        	}
        }
        for (int i=0; i<n; i++) {
        	Scanner sc2 = new Scanner(System.in);
        	System.out.println("\nPlease provide input: \n");
            String lineInput = sc2.nextLine();
            String[] splitLine = lineInput.split(" ");
            weight[i] = Integer.parseInt(splitLine[0]);
            values[i] = Integer.parseInt(splitLine[1]);
        }
        
        System.out.println("\n");
        System.out.println(knapsack(weight, values, w, n));
	}
	
	static int knapsack(int[] weight, int[] values, int w, int n) {
		if (n == 0 || w == 0) {
			return 0;
		}
		if (t[n][w] != -1) {
			return t[n][w];
		}
		
		if (weight[n-1]> w) {
			return t[n][w] =  knapsack(weight, values, w, n-1);
		}
		
		return t[n][w] = Integer.max(values[n-1] + knapsack(weight, values, w-weight[n-1], n-1), knapsack(weight, values, w, n-1));
	}

}

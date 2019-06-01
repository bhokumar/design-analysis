package org.bhoopendra.algo.radix.string.sort;

public class StringRadixDemo {
    public static void main(String[] args) {
        String[] stringArray = {"bcdef","dbaqc", "abcde", "omadd", "bbbbb"};
        radixSort(stringArray, 26, 5);
        for(int i=0;i<stringArray.length;i++) {
            System.out.print(stringArray[i]+" ");
        }
    }

    public static void radixSort(String[] input, int radix, int width) {
        for (int i=width-1; i>= 0; i--) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value: input) {
            countArray[getIndex(value, position)]++;
        }

        // Adjust the count array to make counting sort stable sort
        for (int j=1; j<radix;j++) {
            countArray[j] += countArray[j-1];
        }

        String[] temp = new String[numItems];

        for(int tempIndex = numItems-1; tempIndex>=0; tempIndex--) {
            temp[--countArray[getIndex(input[tempIndex],position)]] = input[tempIndex];
        }

        for (int i=0; i<numItems; i++) {
            input[i] = temp[i];
        }
    }

    public static int getIndex(String value, int position) {
        return value.charAt(position) - 'a';
    }
}

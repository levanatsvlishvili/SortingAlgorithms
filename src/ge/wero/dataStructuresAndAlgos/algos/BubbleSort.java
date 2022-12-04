package ge.wero.dataStructuresAndAlgos.algos;

import ge.wero.dataStructuresAndAlgos.utils.ArrayUtils;

/**
 * Bubble sort works by comparing elements from left to right
 * and if left object is greater than right one they switch it.
 * After first iteration the last index object is greater, therefore
 * second iteration is until array.length -1 (first one was until
 * array.length)
 *
 *  initial array :  12 -1 17 -4 11 13
 *  1st iter:        -1 12 17 -4 11 13
 *  2nd iter:        -1 12 17 -4 11 13 same
 *  3rd iter:        -1 12 -4 17 11 13
 *  4th iter:        -1 12 -4 11 17 13
 *  5th iter:        -1 12 -4 11 13 17 end of first iteration of first for loop
 *  6th iter:        -1 12 -4 11 13 17 same
 *  7th iter:        -1 -4 12 11 13 17
 *  8th iter:        -1 -4 11 12 13 17 same
 *  9th iter:        -1 -4 11 12 13 17 same, end of second iteration of first for loop
 * 10th iter:        -4 -1 11 12 13 17
 * 11th iter:         iterations will be same after that
 */
public class BubbleSort {
    public static final String TIME_COMPLEXITY = "O(n^2)";
    public static final boolean isStable = true;

    public static void sort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    ArrayUtils.swap(array, i, i + 1);
                }
            }
        }
    }
}

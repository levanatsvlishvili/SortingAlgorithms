package ge.wero.dataStructuresAndAlgos.algos;

import ge.wero.dataStructuresAndAlgos.utils.ArrayUtils;
import ge.wero.dataStructuresAndAlgos.utils.ColorUtils;

import java.util.Arrays;

/**
 * Merge sort
 */
public class MergeSort {
    public static final String TIME_COMPLEXITY = "O(nlogn)";
    public static final boolean isStable = true;

    public static void sort(int[] array, int start, int end, boolean printLog) {
        if (printLog) {
            System.out.print("Sorting array : ");
            System.out.println(ColorUtils.colorString(ColorUtils.ANSI_BLUE, ArrayUtils.arrayBody(Arrays.copyOfRange(array, start, end))));
        }
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        if (printLog) {
            System.out.print("Array is divided in two parts : ");
            System.out.print(ColorUtils.colorString(ColorUtils.ANSI_BLUE, ArrayUtils.arrayBody(Arrays.copyOfRange(array, start, mid))));
            System.out.print(" and ");
            System.out.print(ColorUtils.colorString(ColorUtils.ANSI_BLUE, ArrayUtils.arrayBody(Arrays.copyOfRange(array, mid, end))));
            System.out.println();
        }
        sort(array, start, mid, printLog);
        sort(array, mid, end, printLog);
        merge(array, start, mid, end, printLog);
    }

    private static void merge(int[] array, int start, int mid, int end, boolean printLog) {
        if (printLog) {
            System.out.print("Before merge: start = " + start + " mid = " + mid + " end = " + end + " ");
            System.out.println(ColorUtils.colorString(ColorUtils.ANSI_BLUE, ArrayUtils.arrayBody(array, 0, start))+
                    ColorUtils.colorString(ColorUtils.ANSI_RED, ArrayUtils.arrayBody(array, start, end))+
                    ColorUtils.colorString(ColorUtils.ANSI_BLUE, ArrayUtils.arrayBody(array, end, array.length)));
        }
        if (array[mid - 1] <= array[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
        if (printLog) {
            System.out.print("After merge: start = " + start + " mid = " + mid + " end = " + end + " ");
            System.out.println(ColorUtils.colorString(ColorUtils.ANSI_BLUE, ArrayUtils.arrayBody(array, 0, start))+
                    ColorUtils.colorString(ColorUtils.ANSI_RED, ArrayUtils.arrayBody(array, start, end))+
                    ColorUtils.colorString(ColorUtils.ANSI_BLUE, ArrayUtils.arrayBody(array, end, array.length)));
        }
    }
}

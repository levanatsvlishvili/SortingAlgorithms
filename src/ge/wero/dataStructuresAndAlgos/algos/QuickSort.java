package ge.wero.dataStructuresAndAlgos.algos;

import ge.wero.dataStructuresAndAlgos.utils.ArrayUtils;
import ge.wero.dataStructuresAndAlgos.utils.ColorUtils;

import java.awt.*;
import java.util.Arrays;

/**
 * Quick sort
 */
public class QuickSort {
    public static final String TIME_COMPLEXITY = "O(nlogn)";
    public static final boolean isStable = false;

    public static void sort(int[] array, int start, int end, boolean printLog) {
        if (printLog) {
            if (array.length != 0) {
                System.out.print("Starting Sorting array : ");
                System.out.print(ColorUtils.colorString(ColorUtils.ANSI_BLUE, ArrayUtils.arrayBody(Arrays.copyOfRange(array, start, end))));
            }
        }
        if (end - start < 2) {
            if (printLog) {
                System.out.println();
            }
            return;
        }
        int pivotIndex = partition(array, start, end, printLog);
        if (printLog) {
            System.out.println(ColorUtils.colorString(ColorUtils.ANSI_YELLOW, "  pivot element will be ")
                    + ColorUtils.colorString(ColorUtils.ANSI_RED, "" + array[pivotIndex])
                    + ColorUtils.colorString(ColorUtils.ANSI_YELLOW, " at index ")
                    + ColorUtils.colorString(ColorUtils.ANSI_RED, "" + pivotIndex));

        }
        if (printLog) {
            System.out.print("Sorting array : ");
            System.out.println(ColorUtils.colorString(ColorUtils.ANSI_BLUE, ArrayUtils.arrayBody(array, 0, pivotIndex)) +
                    ColorUtils.colorString(ColorUtils.ANSI_RED, ArrayUtils.arrayBody(array, pivotIndex, pivotIndex + 1)) +
                    ColorUtils.colorString(ColorUtils.ANSI_BLUE, ArrayUtils.arrayBody(array, pivotIndex + 1, end)));
        }
        sort(array, start, pivotIndex, printLog);
        sort(array, pivotIndex + 1, end, printLog);

    }

    private static int partition(int[] array, int start, int end, boolean printLog) {
        //first element as pivot
        int pivot = array[start];
        int i = start;
        int j = end;
        while (i < j) {
            //empty loop body
            while (i < j && array[--j] >= pivot) ;
            if (i < j) {
                array[i] = array[j];
            }


            //empty loop body
            while (i < j && array[++i] <= pivot) ;
            if (i < j) {
                array[j] = array[i];
            }

        }
        array[j] = pivot;
        return j;
    }
}

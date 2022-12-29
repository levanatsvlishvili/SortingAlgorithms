package ge.wero.dataStructuresAndAlgos;

import ge.wero.dataStructuresAndAlgos.algos.*;
import ge.wero.dataStructuresAndAlgos.utils.ColorUtils;
import ge.wero.dataStructuresAndAlgos.utils.ArrayUtils;

import java.util.Random;

public class Main {
    private static final boolean PRINT_LOG = true;
    private static final boolean MAKE_BUBBLE_SORT = false;
    private static final boolean MAKE_SELECTION_SORT = false;
    private static final boolean MAKE_INSERTION_SORT = false;
    private static final boolean MAKE_SHELL_SORT = false;
    private static final boolean MAKE_MERGE_SORT = false;
    private static final boolean MAKE_QUICK_SORT = true;


    public static void main(String[] args) {
        int[] array = initializeRandomArray();
        int[] tmp = ArrayUtils.copyArray(array);
        System.out.println(ColorUtils.colorString(ColorUtils.ANSI_CYAN, "Array before sorting:"));
        System.out.println(ArrayUtils.arrayBody(array));
        if (MAKE_BUBBLE_SORT) {
            runBubbleSort(array);
            array = ArrayUtils.copyArray(tmp);
        }
        if (MAKE_SELECTION_SORT) {
            runSelectionSort(array);
            array = ArrayUtils.copyArray(tmp);
        }
        if (MAKE_INSERTION_SORT) {
            runInsertionSort(array);
            array = ArrayUtils.copyArray(tmp);
        }
        if (MAKE_SHELL_SORT) {
            runShellSort(array);
            array = ArrayUtils.copyArray(tmp);
        }
        if (MAKE_MERGE_SORT) {
            runMergeSort(array);
            array = ArrayUtils.copyArray(tmp);
        }
        if (MAKE_QUICK_SORT){
            runQuickSort(array);
            array = ArrayUtils.copyArray(tmp);
        }
    }

    public static void runBubbleSort(int[] array) {
        System.out.println(ColorUtils.colorString(ColorUtils.ANSI_BLUE, "After bubble sort (Time Complecity: " + BubbleSort.TIME_COMPLEXITY + " ; Stable: " + BubbleSort.isStable + "):"));
        BubbleSort.sort(array, PRINT_LOG);
        System.out.println(ArrayUtils.arrayBody(array));
    }

    public static void runSelectionSort(int[] array) {
        System.out.println(ColorUtils.colorString(ColorUtils.ANSI_BLUE, "After selection sort (Time Complecity: " + SelectionSort.TIME_COMPLEXITY + " ; Stable: " + SelectionSort.isStable + "):"));
        SelectionSort.sort(array, PRINT_LOG);
        System.out.println(ArrayUtils.arrayBody(array));
    }

    public static void runInsertionSort(int[] array) {
        System.out.println(ColorUtils.colorString(ColorUtils.ANSI_BLUE, "After insertion sort (Time Complecity: " + InsertionSort.TIME_COMPLEXITY + " ; Stable: " + InsertionSort.isStable + "):"));
        InsertionSort.sort(array, PRINT_LOG);
        System.out.println(ArrayUtils.arrayBody(array));
    }

    public static void runShellSort(int[] array) {
        System.out.println(ColorUtils.colorString(ColorUtils.ANSI_BLUE, "After shell sort (Time Complecity: " + ShellSort.TIME_COMPLEXITY + " ; Stable: " + ShellSort.isStable + "):"));
        ShellSort.sort(array, PRINT_LOG);
        System.out.println(ArrayUtils.arrayBody(array));
    }

    public static void runMergeSort(int[] array) {
        System.out.println(ColorUtils.colorString(ColorUtils.ANSI_BLUE, "After merge sort (Time Complecity: " + MergeSort.TIME_COMPLEXITY + " ; Stable: " + MergeSort.isStable + "):"));
        MergeSort.sort(array, 0, array.length, PRINT_LOG);
        System.out.println(ArrayUtils.arrayBody(array));
    }

    public static void runQuickSort(int[] array) {
        System.out.println(ColorUtils.colorString(ColorUtils.ANSI_BLUE, "After quick sort (Time Complecity: " + QuickSort.TIME_COMPLEXITY + " ; Stable: " + QuickSort.isStable + "):"));
        QuickSort.sort(array, 0, array.length, PRINT_LOG);
        System.out.println(ArrayUtils.arrayBody(array));
    }


    public static int[] initializeRandomArray() {
        Random random = new Random();
        int size = random.nextInt(5) + 5;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(200) - 100);
        }
        return array;
    }


}

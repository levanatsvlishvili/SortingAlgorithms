package ge.wero.dataStructuresAndAlgos;

import ge.wero.dataStructuresAndAlgos.algos.BubbleSort;
import ge.wero.dataStructuresAndAlgos.algos.InsertionSort;
import ge.wero.dataStructuresAndAlgos.algos.SelectionSort;
import ge.wero.dataStructuresAndAlgos.utils.ColorUtils;
import ge.wero.dataStructuresAndAlgos.utils.ArrayUtils;

import java.util.Random;

public class Main {
    private static final boolean PRINT_LOG = true;
    private static final boolean MAKE_BUBBLE_SORT = true;
    private static final boolean MAKE_SELECTION_SORT = true;
    private static final boolean MAKE_INSERTION_SORT = true;


    public static void main(String[] args) {
        int[] array = initializeRandomArray();
        int[] tmp = ArrayUtils.copyArray(array);
        System.out.println(ColorUtils.colorString(ColorUtils.ANSI_CYAN, "Array before sorting:"));
        ArrayUtils.printArray(array);
        if(MAKE_BUBBLE_SORT) {
            runBubbleSort(array);
            array = ArrayUtils.copyArray(tmp);
        }
        if(MAKE_SELECTION_SORT) {
            runSelectionSort(array);
            array = ArrayUtils.copyArray(tmp);
        }
        if(MAKE_INSERTION_SORT){
            runInsertionSort(array);
            array = ArrayUtils.copyArray(tmp);
        }
    }

    public static void runBubbleSort(int[] array) {
        System.out.println(ColorUtils.colorString(ColorUtils.ANSI_BLUE, "After bubble sort (Time Complecity: " + BubbleSort.TIME_COMPLEXITY + " ; Stable: " + BubbleSort.isStable + "):"));
        BubbleSort.sort(array, PRINT_LOG);
        ArrayUtils.printArray(array);
    }

    public static void runSelectionSort(int[] array) {
        System.out.println(ColorUtils.colorString(ColorUtils.ANSI_BLUE, "After selection sort (Time Complecity: " + SelectionSort.TIME_COMPLEXITY + " ; Stable: " + SelectionSort.isStable + "):"));
        SelectionSort.sort(array, PRINT_LOG);
        ArrayUtils.printArray(array);
    }

    public static void runInsertionSort(int[] array) {
        System.out.println(ColorUtils.colorString(ColorUtils.ANSI_BLUE, "After insertion sort (Time Complecity: " + InsertionSort.TIME_COMPLEXITY + " ; Stable: " + InsertionSort.isStable + "):"));
        InsertionSort.sort(array, PRINT_LOG);
        ArrayUtils.printArray(array);
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

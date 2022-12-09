package ge.wero.dataStructuresAndAlgos.algos;

import ge.wero.dataStructuresAndAlgos.utils.ArrayUtils;

/**
 * Insertion sort
 * If sequence of objects is nearly sorted then insertion
 * sort algorithms works nearly in linear time, because it
 * does not make many shifting
 *
 * initial array         [12  -1  17  -4  11  13]
 * firstUnsorted: 1 i:1  [12  12  17  -4  11  13]
 * firstUnsorted: 1 i:0  [-1  12  17  -4  11  13]
 * firstUnsorted: 2 i:2  [-1  12  17  -4  11  13]
 * firstUnsorted: 3 i:3  [-1  12  17  17  11  13]
 * firstUnsorted: 3 i:2  [-1  12  12  17  11  13]
 * firstUnsorted: 3 i:1  [-1  -1  12  17  11  13]
 * firstUnsorted: 3 i:0  [-4  -1  12  17  11  13]
 * firstUnsorted: 4 i:4  [-4  -1  12  17  17  13]
 * firstUnsorted: 4 i:3  [-4  -1  12  12  17  13]
 * firstUnsorted: 4 i:2  [-4  -1  11  12  17  13]
 * firstUnsorted: 5 i:5  [-4  -1  11  12  17  17]
 * firstUnsorted: 5 i:4  [-4  -1  11  12  13  17]
 */
public class InsertionSort {
    public static final String TIME_COMPLEXITY = "O(n^2)";
    public static final boolean isStable = true;

    public static void sort(int[] array, boolean printLog) {
        for (int firstUnsorted = 1; firstUnsorted < array.length; firstUnsorted++) {
            int newElement = array[firstUnsorted];
            int i;
            for (i = firstUnsorted; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
                if (printLog) {
                    System.out.print("firstUnsorted: " + firstUnsorted + " i:" + i + "  ");
                    ArrayUtils.printArray(array);
                }
            }
            array[i] = newElement;
            if (printLog) {
                System.out.print("firstUnsorted: " + firstUnsorted + " i:" + i + "  ");
                ArrayUtils.printArray(array);
            }

        }
    }
}

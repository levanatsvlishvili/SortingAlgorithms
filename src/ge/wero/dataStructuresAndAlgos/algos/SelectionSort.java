package ge.wero.dataStructuresAndAlgos.algos;

import ge.wero.dataStructuresAndAlgos.utils.ArrayUtils;

/**
 * Selection sort works by finding element with maximum value
 * until array.length-1 position at first for loop iteration
 * and then swap it to array.length-1 element. After second
 * iteration of firs for loop, algorithm finds element with
 * maximum value until array.length-2 position and then swap
 * it to array.length-2 element.
 */
public class SelectionSort {
    public static final String TIME_COMPLEXITY = "O(n^2)";
    public static final boolean isStable = false;

    public static void sort(int[] array, boolean printLog) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;
            for(int i=0; i<=lastUnsortedIndex; i++){
                if(array[i]>array[largestIndex]){
                    largestIndex = i;
                }
                if (printLog){
                    System.out.print("lastUnsortedIndex: "+lastUnsortedIndex+ " i: "+i+" ");
                    ArrayUtils.printArray(array);
                }
            }
            ArrayUtils.swap(array,largestIndex, lastUnsortedIndex);
        }
    }
}

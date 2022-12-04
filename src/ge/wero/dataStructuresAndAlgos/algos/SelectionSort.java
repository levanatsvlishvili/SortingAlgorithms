package ge.wero.dataStructuresAndAlgos.algos;

import ge.wero.dataStructuresAndAlgos.utils.ArrayUtils;

public class SelectionSort {
    public static final String TIME_COMPLEXITY = "O(n^2)";
    public static final boolean isStable = false;

    public static void sort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;
            for(int i=0; i<=lastUnsortedIndex; i++){
                if(array[i]>array[largestIndex]){
                    largestIndex = i;
                }
            }
            ArrayUtils.swap(array,largestIndex, lastUnsortedIndex);
        }
    }
}

package ge.wero.dataStructuresAndAlgos.algos;

import ge.wero.dataStructuresAndAlgos.utils.ArrayUtils;

/**
 * Shell sort
 * Shell sort is similar to insertion sort. Insertion sort
 * chooses which element to insert using gao of 1, while
 * Shell sort starts out using a larger gap value and as a
 * algorithm runs a gap is reduced. When gap is reduced to 1
 * then shell sort is insertion sort, but at this time array is
 * nearly sorted, therefore shell is more efficient than insertion.
 * <p>
 * For finding gap there are many sequences, we use Knuth sequence:
 * 1 4 13 40 12... (3^k-1)/2;  k = length of array
 *
 */
public class ShellSort {
    public static final String TIME_COMPLEXITY = "O(n^2)";
    public static final boolean isStable = false;

    public static void sort(int[] array, boolean printLog) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int newElem = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElem) {
                    array[j] = array[j - gap];
                    j -= gap;
                    if(printLog){
                        System.out.print("gap: "+gap+" i: "+i+" j: "+j+"  ");
                        System.out.println(ArrayUtils.arrayBody(array));
                    }
                }
                array[j] = newElem;
                if(printLog){
                    System.out.print("gap: "+gap+" i: "+i+" j: "+j+"  ");
                    System.out.println(ArrayUtils.arrayBody(array));
                }
            }

        }
    }
}

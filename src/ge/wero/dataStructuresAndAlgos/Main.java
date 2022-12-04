package ge.wero.dataStructuresAndAlgos;

import ge.wero.dataStructuresAndAlgos.algos.BubbleSort;
import ge.wero.dataStructuresAndAlgos.algos.SelectionSort;
import ge.wero.dataStructuresAndAlgos.utils.ColorUtils;
import ge.wero.dataStructuresAndAlgos.utils.ArrayUtils;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = initializeRandomArray();
        int[] tmp = array.clone();
        System.out.println(ColorUtils.colorString(ColorUtils.ANSI_CYAN, "Array before sorting:"));
        ArrayUtils.printArray(array);
        bubbleSort(array,tmp);
        array = tmp;
        SelectionSort(array,tmp);
    }

    public static void bubbleSort(int[] array, int[] tmp){
        System.out.println(ColorUtils.colorString(ColorUtils.ANSI_BLUE, "After bubble sort (Time Complecity: " + BubbleSort.TIME_COMPLEXITY + " ; Stable: " + BubbleSort.isStable + "):"));
        BubbleSort.sort(array);
        ArrayUtils.printArray(array);
    }

    public static void SelectionSort(int[] array, int[] tmp){
        System.out.println(ColorUtils.colorString(ColorUtils.ANSI_BLUE, "After selection sort (Time Complecity: " + SelectionSort.TIME_COMPLEXITY + " ; Stable: " + SelectionSort.isStable + "):"));
        SelectionSort.sort(array);
        ArrayUtils.printArray(array);
    }


    public static int[] initializeRandomArray() {
        Random random = new Random();
        int size = random.nextInt(5) + 5;
        int[] array = new int [size];
        for(int i=0; i<array.length; i++){
            array[i] = (random.nextInt(200)-100);
        }
        return array;
    }


}

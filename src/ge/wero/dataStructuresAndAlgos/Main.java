package ge.wero.dataStructuresAndAlgos;

import ge.wero.dataStructuresAndAlgos.algos.BubbleSort;
import ge.wero.dataStructuresAndAlgos.utils.ConsoleColorCodes;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 12;
        array[1] = -1;
        array[2] = 17;
        array[3] = -4;
        array[4] = 11;
        array[5] = 13;
        array[6] = 1;
        array[7] = 0;
        array[8] = 20;
        array[9] = -7;
        int[] tmp = array;
        System.out.println(colorString(ConsoleColorCodes.ANSI_CYAN, "Array before sorting:"));
        printArray(array);
        System.out.println(colorString(ConsoleColorCodes.ANSI_GREEN, "After bubble sort (Time Complecity: " + BubbleSort.TIME_COMPLEXITY + "):"));
        BubbleSort.sort(array);
        printArray(array);
        array = tmp;
    }

    public static void printArray(int[] array) {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i != array.length - 1) {
                builder.append("  ");
            }
        }
        builder.append(']');
        System.out.println(builder);
    }

    public static String colorString(String colorCode, String str) {
        return colorCode + str + ConsoleColorCodes.ANSI_RESET;
    }
}

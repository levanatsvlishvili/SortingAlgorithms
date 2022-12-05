package ge.wero.dataStructuresAndAlgos.utils;

public class ArrayUtils {
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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

    public static int[] copyArray(int[] array) {
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            res[i] = array[i];
        }
        return res;
    }
}

package dev.karabiner.array;

public class ArrayUtil {

        public static void printArray(int[] array) {
            for (int i=0; i<array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

        public static int[] reverseArray(int[] array) {
            int start = 0, end = array.length - 1;

            while (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;

                start++;
                end--;
            }

            return array;
        }
}

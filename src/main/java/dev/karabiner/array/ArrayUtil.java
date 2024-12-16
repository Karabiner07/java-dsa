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

        public static int findMin(int[] array) {
            int min = Integer.MAX_VALUE;

            for (int i=0; i<array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }

        public static int findSecondMax(int[] array) {
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for (int i=0; i<array.length; i++) {

                //if the current element is greater than the max value
                //then assign max to second max
                //assign current element to max
                if(array[i] > max) {
                    secondMax = max;
                    max = array[i];
                }

                //if the current element is not greater than max but greater than second max
                //then assign the current element to the second max
                if(array[i] > secondMax && array[i] != max) {
                    secondMax = array[i];
                }
            }
            return secondMax;
        }

        public static int[] moveZerosToEnd(int[] array) {
            //stores the first element's index
            int zeroIndex = 0;

            for (int i=0; i<array.length; i++) {

                //if the current element is not zero AND if array[zeroIndex] is 0
                //then swap both elements
                //note : zeroIndex usually lags behind the current i'th iteration
                if (array[i] != 0 && array[zeroIndex] == 0) {
                    int temp = array[i];
                    array[i] = array[zeroIndex];
                    array[zeroIndex] = temp;
                }

                //if the array[zeroIndex] does not contain 0, then zeroIndex++
                //this is case is useful when the
                if(array[zeroIndex] != 0) {
                    zeroIndex++;
                }
            }
            return array;
        }
}

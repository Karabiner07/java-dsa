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
            //focuses on 0's index
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

        public static int[] resizeArray(int[] array, int newSize) {
            //create a new array of length newSize
            int[] newArray = new int[newSize];

            //copy all old array elements into new array
            for (int i=0; i<array.length; i++) {
                newArray[i] = array[i];
            }
            return newArray;
        }

        //Given an array of n-1 distint numbers in the range of 1 to n, Find the missing number in it
        //time complexity o(n)
        public static int findMissingElement(int[] array) {

            //number of elements including missing element
            int n = array.length+1;

            //sum of first n natural numbers
            int sumOfElements = (n * (n+1)) / 2;

            //store the sum into the missingElement variable
            int missingElement = sumOfElements;

            //subtract current element from the missingElement(contains sumOfElements)
            for (int i=0; i<array.length; i++) {
                missingElement = missingElement - array[i];
            }

            return missingElement;
        }






}

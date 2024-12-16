package dev.karabiner;


import dev.karabiner.array.ArrayUtil;

public class Main {
    public static void main(String[] args) {

        //create array with length 4
        int[] array = new int[] {1, 2, 3, 4};

        //point the array variable to the new array created by ArrayUtil.resizeArray()
        array = ArrayUtil.resizeArray(array, 5);

        //assign a value to the empty position
        array[4] = 5;

        ArrayUtil.printArray(array);
    }

}
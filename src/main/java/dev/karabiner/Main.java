package dev.karabiner;


import dev.karabiner.array.ArrayUtil;

public class Main {
    public static void main(String[] args) {

        //create array with a missing number
        int[] array = new int[] {2, 3, 1, 5, 6, 4, 9, 7, 10};

        System.out.println(ArrayUtil.findMissingElement(array));
    }

}
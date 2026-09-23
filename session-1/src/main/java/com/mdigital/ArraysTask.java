package com.mdigital;

import java.util.Arrays;

public class ArraysTask {
    static void main() {
        final String[] fruits = {"Apple", "Banana", "Mango"};

        System.out.println(Arrays.toString(fruits));

        final int[] lotteryNumbers = {9, 23, 44, 12, 8, 34};

        System.out.println(Arrays.toString(lotteryNumbers));

        // Don’t do this in your own
        // code!!!!!!!!!!!!!!!!!!!

        Object[] mixedArray = {"Efe", 12, 3.14, true};

        System.out.println(Arrays.toString(mixedArray));
    }
}

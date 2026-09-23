package com.mdigital;

import java.util.Arrays;

public class MultiDimensionalArrayTask {
    static void main() {
        String[][] names = {
                {"Dave", "Ames"},
                {"Dan ", "Evans"},
                {"Thomas", "Gasseling"}
        };

        for (String[] name: names) {
            System.out.println(Arrays.toString(name));
        }

        System.out.println("\n");

        int[][] numbers = {
                {1, 2},
                {3, 4},
                {5,6}
        };

        for (int[] num: numbers) {
            System.out.println(Arrays.toString(num));
        }
    }
}

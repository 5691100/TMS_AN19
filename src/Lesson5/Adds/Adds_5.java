package Lesson5.Adds;

import java.util.Arrays;

public class Adds_5 {
    public static void main(String[] args) {
        int[][] arr1 = {{5, 2, 4}, {5, 9, 8}, {3, 6, 2}};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

        for (int i = 0; i<arr1.length; i++) {
            Arrays.sort(arr1[i]);
            System.out.println(Arrays.toString(arr1[i]));
        }
    }
}

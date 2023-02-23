package Lesson5.Adds;

import java.io.PrintStream;
import java.util.Arrays;

public class Adds_4 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 5}, {5, 6, 8}, {3, 6, 7}};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (i == j) {
                    System.out.print(arr1[i][j] + " ");
                }
            }
        }
        System.out.println();
        int n = arr1.length - 1;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i][n] + " ");
            n--;
        }
    }
}



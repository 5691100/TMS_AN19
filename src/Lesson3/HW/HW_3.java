package Lesson3.HW;

import java.util.Arrays;

public class HW_3 {
    public static void main(String[] args) {
        int [] array1 = {13,56,45,34,87};
        int [] array2 = {10,56,78,43,86};
        System.out.println("Array One: " + Arrays.toString(array1));
        System.out.println("Array Two: " + Arrays.toString(array2));
        int avg1 = 0;
        int avg2 = 0;
        for (int i=0; i<array1.length; i++) {
            avg1 += array1[i];
            avg2 += array2[i];
        }
        avg1 = avg1/array1.length;
        avg2 = avg2/array2.length;
        if (avg1>avg2) {
            System.out.println("Average of Array One is bigger!");
        } else if (avg2>avg1) {
            System.out.println("Average of Array Two is bigger!");
        } else {
            System.out.println("Averages of Arrays are equal!");
        }

    }
}

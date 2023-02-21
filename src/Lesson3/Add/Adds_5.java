package Lesson3.Add;

import java.util.Arrays;

public class Adds_5 {
    public static void main(String[] args) {
        int [] array = {1, 45, 23, 532, 124, 33, 21, 12, 456, 6};
        System.out.println("Array: " + Arrays.toString(array));

        for (int i = 0; i< array.length; i++){
            if (i%2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("New array: " + Arrays.toString(array));

    }
}

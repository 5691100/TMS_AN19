package Lesson3.HW;

import java.util.Arrays;
import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array's elements: ");
        int number = sc.nextInt();
        int [] array = new int[number];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int avg = 0;
        for (int i = 0; i<number; i++) {
            array[i] = (int) (Math.random()*100);
            if (array[i]>max) {
                max = array[i];
            }
            if (array[i]< min) {
                min = array[i];
            }
            avg += array[i];
        }
        avg = avg/number;
        System.out.println("New array: " + Arrays.toString(array));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + avg);


    }
}

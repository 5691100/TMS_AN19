package Lesson3.Add;

import java.util.Arrays;
import java.util.Scanner;

public class Adds_QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array's elements: ");
        int number = sc.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        int counter = 0;
        int pivot = 0;
        int num = 0;
        int dop = 0;

        while (number > 1) {
            do {
                int checker = 0;
                for (int i = pivot + 1; i < number; i++) {
                    if (array[i] > array[pivot]) {
                        int j = i+1;
                        while (array[j] > array[pivot] || j <= number) {
                            j++;
                            if (j>number) {
                                checker = 1;
                                break;
                            }
                        }
                        if (checker == 0) {
                            num = array[i];
                            array[i] = array[j];
                            array[j] = num;
                            counter++;
                        }
                    }
                }
                num = array[pivot];
                array[pivot] = array[counter];
                array[counter] = num;

            } while (counter != 1);
            number--;
        }

        System.out.println("First array: " + Arrays.toString(array));
    }
}



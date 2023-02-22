package Lesson3.Add;

import java.util.Arrays;
import java.util.Scanner;

public class Adds_QuickSort_unfinish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array's elements: ");
        int number = sc.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Gotten array: " + Arrays.toString(array));

        int j = 0;
        int pivotN = 0;
        int leftmost = 0;
        int help = 0;
        int pivot = array[pivotN];

//        while (number>1){
        j = 1;
        while (j < number) {
            while (array[j] < pivot) {
                if (j != number - 1) {
                    j++;
                } else {
                    break;
                }
            }
            leftmost = j;
            while (array[j] >= pivot) {
                if (j != number - 1) {
                    j++;
                } else {
                    break;
                }
            }
            if (array[j] < pivot) {
                help = array[j];
                array[j] = array[leftmost];
                array[leftmost] = help;
                j = leftmost;
            }
            j++;
        }
        help = array[leftmost - 1];
        array[leftmost - 1] = pivot;
        array[pivotN] = help;
        number = leftmost;

//   }

        System.out.println("First array: " + Arrays.toString(array));
        System.out.println(leftmost);
    }
}





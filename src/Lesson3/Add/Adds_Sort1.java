package Lesson3.Add;

import java.util.Arrays;
import java.util.Scanner;

public class Adds_Sort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements in Array One:");
        int number1 = sc.nextInt();
        System.out.println("Please enter the number of elements in Array One:");
        int number2 = sc.nextInt();
        int[] array1 = new int[number1];
        for (int i = 0; i < number1; i++) {
            array1[i] = (int) (Math.random() * 100);
        }
        int[] array2 = new int[number2];
        for (int i = 0; i < number2; i++) {
            array2[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array One: " + Arrays.toString(array1));
        System.out.println("Array Two: " + Arrays.toString(array2));

        int[] array3 = new int[number1 + number2];
        int n = 0;
        int minMin = Integer.MIN_VALUE;
        int minN1 = 0;
        int minN2 = 0;

        while (n < number1 + number2) {
            int minNew1 = Integer.MAX_VALUE;
            int minNew2 = Integer.MAX_VALUE;

            for (int i = 0; i < number1; i++) {
                if (array1[i] < minNew1) {
                    minNew1 = array1[i];
                    minN1 = i;
                }
            }
            for (int i = 0; i < number2; i++) {
                if (array2[i] < minNew2) {
                    minNew2 = array2[i];
                    minN2 = i;
                }
            }
            if (minNew1 <= minNew2) {
                minMin = minNew1;
                array1[minN1] = Integer.MAX_VALUE;
            } else {
                minMin = minNew2;
                array2[minN2] = Integer.MAX_VALUE;
            }
            array3[n] = minMin;
            n++;
        }
        System.out.println("Array New: "+Arrays.toString(array3));
    }
}



package Lesson5.Adds;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array's elements: ");
        int number = sc.nextInt();
        int[] array = new int[number];
        int[] arrayCheck = new int[number];
        int[] arrayMax = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Initial array: " + Arrays.toString(array));

        int maxSumSequence = 0;
        int startMax = 0;
        int finishMax = 0;
        int numberStart = 0;

        for (int i = 0; i < array.length; i++) {
            int sumSequence = 0;
            if (((i+1) == array.length) || (array[i+1]<array[i])) {
                for (int j = numberStart; j < i+1; j++) {
                    sumSequence += array[j];
                }
                if (sumSequence>maxSumSequence) {
                    maxSumSequence = sumSequence;
                    startMax = numberStart;
                    finishMax = i;
                }
                numberStart = i+1;
            }
        }
        System.out.print("Max sequence: ");
        for(int i = startMax; i<finishMax+1; i++) {
            System.out.print(array[i]+ "  ");
        }
    }
}

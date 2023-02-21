package Lesson3.HW;

import java.util.Arrays;
import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
        int [] array = {34,54,23,12,7,48,95,34,72,3,25};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Please, enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int counter = 0;
        for (int i:array) {
            if (i != number) {
                counter ++;
            }
        }
        if (counter < array.length) {
            int [] arrayNew = new int[counter];
            counter = 0;
            for (int i: array) {
                if (i != number) {
                    arrayNew[counter] = i;
                    counter++;
                }
            }
            System.out.println("New array: " + Arrays.toString(arrayNew));
        } else {
            System.out.println("There is no such a number in the array!");
        }
    }
}

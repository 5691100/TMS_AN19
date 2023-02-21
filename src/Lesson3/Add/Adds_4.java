package Lesson3.Add;

import java.util.Arrays;
import java.util.Scanner;

public class Adds_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println("Please, enter the number of elements from 6 to 10: ");
        number = sc.nextInt();
        while (number < 5 || number > 10) {
            System.out.println("The entered number is not appropriate. Please, enter the number of elements from 6 to 10: ");
            number = sc.nextInt();
        }
        int[] array = new int[number];
        int[] array2 = new int[number/2];
        int counter = 0;
        for (int i = 0; i < number; i++) {
            array[i] = (int) (Math.random() * 100);
            if (i%2!=0) {
                array2[counter] = array[i];
                counter++;
            }
        }
        System.out.println("New array: " + Arrays.toString(array));
        System.out.println("Absolutely new array: " + Arrays.toString(array2));
    }
}

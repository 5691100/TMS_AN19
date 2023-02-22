package Lesson3.Add;

//Сгененрировать 2 массива случайных чисел разного размера. Смержить их в третий, при этом сортируя по убыванию


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Adds_Sort2_Index {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements in Array One:");
        int number1 = sc.nextInt();
        System.out.println("Please enter the number of elements in Array One:");
        int number2 = sc.nextInt();
        Integer [] array1 = new Integer[number1];
        for (int i = 0; i < number1; i++) {
            array1[i] = (int) (Math.random() * 100);
        }
        Integer [] array2 = new Integer [number2];
        for (int i = 0; i < number2; i++) {
            array2[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array One: " + Arrays.toString(array1));
        System.out.println("Array Two: " + Arrays.toString(array2));

        Arrays.sort(array1, Collections.reverseOrder());
        Arrays.sort(array2, Collections.reverseOrder());
        System.out.println("Array One New: " + Arrays.toString(array1));
        System.out.println("Array Two New: " + Arrays.toString(array2));
        int[] array3 = new int[number1 + number2];
        int i = 0;
        int maxMax = 0;
        int counter1 = 0;
        int counter2 = 0;
        int check1 = 0;
        int check2 = 0;
        while ((check1 == 0) && (check2 == 0)) {
            if (array2[counter2] <= array1[counter1]) {
                maxMax = array1[counter1];
                if (counter1 != number1 - 1) {
                    counter1++;
                } else {
                    check1 = 1;
                }
            } else {
                maxMax = array2[counter2];
                if (counter2 != number2 - 1) {
                    counter2++;
                } else {
                    check2 = 1;
                }
            }
            array3[i] = maxMax;
            i++;
        }
        if (check1 == 1) {
            for (; i < number1 + number2; i++) {
                array3[i] = array2[counter2];
                counter2++;
            }
        } else {
            for (; i < number1 + number2; i++) {
                array3[i] = array1[counter1];
                counter1++;
            }
        }
        System.out.println("Array Merged: " + Arrays.toString(array3));
    }
}


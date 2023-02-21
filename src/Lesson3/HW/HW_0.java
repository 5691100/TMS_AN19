package Lesson3.HW;

import java.util.Scanner;

public class HW_0 {
    public static void main(String[] args) {
        int [] array = {10,15,24,67,45,23,39,56};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number!");
        int number = sc.nextInt();
        int counter = 0;

        for (int a: array) {
            if (number == a) {
                counter ++;
            }
        }
        if (counter>0) {
            System.out.println(number + " is in array!");
        } else {
            System.out.println(number + " is not in array!");
        }


    }
}

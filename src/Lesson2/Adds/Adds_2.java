package Lesson2.Adds;

import java.util.Scanner;

public class Adds_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number of months for deposit:");
        int periodNumber = scanner.nextInt();
        System.out.println("Please, enter the sum for deposit:");
        Float sum = scanner.nextFloat();
        for (int i = 0; i<periodNumber; i++) {
            sum *= (float) 1.07;
        }
        System.out.println("Sum at the end of the period is: " + sum);
    }
}

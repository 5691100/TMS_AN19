package Lesson2.HW_IF;

import java.util.Scanner;

public class HW_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        if (number%2==0) {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}

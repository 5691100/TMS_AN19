package Lesson2.HW_Loops;

import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i<number+1; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

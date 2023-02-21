package Lesson2.HW_IF;

import java.util.Scanner;

public class HW_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        if (number>-5) {
            System.out.println("Warm");
        }
        else if (number<-5 && number > -20) {
            System.out.println("Norm");
        }
        else {
            System.out.println("Cold");
        }
    }
}

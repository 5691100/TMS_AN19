package Lesson10.HW.HW_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the string:");
        String input = sc.nextLine();
        String[] strings = input.split(" ");
        System.out.println("Please type the number of the word: ");
        int number = 0;
        try {
            number = sc.nextInt();
            palindrom.checkPalindrom(strings[number-1]);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Exception: " + e);
        }
    }
}

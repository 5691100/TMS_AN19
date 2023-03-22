package Lesson10.Class;

import java.util.Scanner;

public class Class_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert number of strings: ");
        int numberOfStrings = sc.nextInt();
        String[] strings = new String[numberOfStrings];
        for (int i = 0; i < numberOfStrings; i++) {
            System.out.println("Insert " + (i + 1) + " string:");
            strings[i] = sc.next();
        }

        System.out.println(strings[2]);
        System.out.println(strings[1].toUpperCase());
        System.out.println(strings[0].toLowerCase());

    }
}

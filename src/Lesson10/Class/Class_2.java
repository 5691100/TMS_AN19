package Lesson10.Class;

import java.util.Scanner;

public class Class_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert number of strings: ");
        int numberOfStrings = sc.nextInt();
        String[] strings = new String[numberOfStrings];
        int sumOfLength= 0;
        for (int i = 0; i<numberOfStrings; i++) {
            System.out.println("Insert " + (i+1) + " string:");
            strings[i] = sc.next();
            sumOfLength += strings[i].length();
            }
        Double avgLength = (double) (sumOfLength/numberOfStrings);
        System.out.println("Average: " + avgLength);
        for (String s: strings) {
            if (s.length()>avgLength) {
                System.out.println(s + ":" + s.length());
            }
        }
    }
}

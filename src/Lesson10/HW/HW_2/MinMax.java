package Lesson10.HW.HW_2;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the string:");
        String input = sc.nextLine();
        String[] strings = input.split(" ");
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i=0; i<strings.length; i++) {
            if (strings[i].length()<=minLength) {
                minIndex = i;
                minLength = strings[i].length();
            }
            if (strings[i].length()>=maxLength) {
                maxIndex = i;
                maxLength = strings[i].length();
            }
        }
        System.out.println("Min - " + strings[minIndex] + ":" + strings[minIndex].length());
        System.out.println("Max - " + strings[maxIndex] + ":" + strings[maxIndex].length());
    }
}

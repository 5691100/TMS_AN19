package Lesson10.HW.HW_5;

import java.util.Scanner;

public class AddLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the string:");
        String input = sc.nextLine();
        StringBuilder newWord =  new StringBuilder();
        for (int i = 0; i<input.length(); i++) {
            newWord.append(input.charAt(i)).append(input.charAt(i));
        }
        System.out.println("New word: " + newWord);
    }
}

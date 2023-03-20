package Lesson10.HW.HW_3;

import java.util.Scanner;

public class MinimumDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the string:");
        String input = sc.nextLine();
        String[] strings = input.split(" ");
        int minDifferences = Integer.MAX_VALUE;
        String minDifWord = strings[0];
        for (String word : strings) {
            StringBuilder uniqueLetters = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < word.length(); j++) {
                    if (uniqueLetters.toString().indexOf(word.charAt(i)) == -1) {
                        if (word.charAt(i) != word.charAt(j)) {
                            uniqueLetters.append(word.charAt(i));
                        }
                    }
                }
            }
            if (uniqueLetters.toString().length()<minDifferences) {
                minDifferences = uniqueLetters.toString().length();
                minDifWord = word;
            }
        }
        System.out.println("Word with minimum differences: " + minDifWord);
    }
}

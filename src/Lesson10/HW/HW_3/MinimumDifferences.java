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
            int counter = 0;
            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < word.length(); j++) {
                    if (i != j) {
                        if (word.charAt(i) != word.charAt(j)) {
                            counter++;

                        }
                    }
                }
            }
            if (counter<minDifferences) {
                minDifferences = counter;
                minDifWord = word;
            }
        }
        System.out.println("Word with minimum differences: " + minDifWord);
    }

}

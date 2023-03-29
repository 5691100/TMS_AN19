package Lesson12.HW.HW1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Напишите программу, которая принимает строку в качестве входных данных и подсчитывает, сколько раз каждый символ
// встречается в этой строке. Для хранения количества встреч символов используйте HashMap, где ключ - символ,
// а значение - количество встреч.
public class UniqueLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the string: ");
        String input = sc.nextLine();


        Map<Character, Integer> listOfUniqueChars = new HashMap<>();

        for (int i=0; i<input.length(); i++) {
            if (!listOfUniqueChars.containsKey(input.charAt(i))) {
                listOfUniqueChars.put(input.charAt(i), 1);
            } else {
                int currentNumber = listOfUniqueChars.get(input.charAt(i));
                listOfUniqueChars.put(input.charAt(i), currentNumber+1);
            }
        }

        System.out.println("List of unique letters: " + listOfUniqueChars);
    }
}

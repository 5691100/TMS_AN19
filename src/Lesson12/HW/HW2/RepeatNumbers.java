package Lesson12.HW.HW2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatNumbers {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please insert number: ");

        int[] listOfNumbers = {1,12,2,3,4,5,6,2,1,4,6,7,4,6};
        Map<Integer, Integer> tableOfNumbers = new HashMap<>();
        int counter = 0;
        for (int i = 0; i< listOfNumbers.length; i++)
        {
            if (!tableOfNumbers.containsKey(listOfNumbers[i])) {
                tableOfNumbers.put(listOfNumbers[i], i);
            } else {
                counter++;
            }
        }
        System.out.println("Number of repeats: " + counter);
    }
}

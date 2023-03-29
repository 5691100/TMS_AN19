package Lesson11.HW.HW3;

import Lesson7.HW_Clinic.Dentist;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Branches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert the string: ");
        String input = sc.nextLine();
        int counter = 0;
        Deque<Character> branches = new LinkedList<>();
        for (Character c : input.toCharArray()) {
            if (c == '[') {
                branches.push(c);
            } else if (c == ']') {
                if (!branches.isEmpty()) {
                    branches.pop();
                } else {
                    counter++;
                    break;
                }
            }
        }
        if (branches.isEmpty() && counter == 0) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}

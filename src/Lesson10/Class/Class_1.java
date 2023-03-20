package Lesson10.Class;

import java.util.Scanner;

public class Class_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert number of strings: ");
        int numberOfStrings = sc.nextInt();
        String[] strings = new String[numberOfStrings];
        String maxLength = "";
        String minLength = "13124235354354366985974745356386579698798957645345678765434567876545678";
        for (int i = 0; i<numberOfStrings; i++) {
            System.out.println("Insert " + (i+1) + " string:");
            strings[i] = sc.next();
            if (strings[i].length() > maxLength.length()) {
                maxLength = strings[i];
            }
            if (strings[i].length() < minLength.length()) {
                minLength = strings[i];
            }
        }

        StringBuilder sdMin = new StringBuilder(minLength);
        System.out.println(sdMin.append(":").append(minLength.length()).append(" ").append(maxLength).append(":").append(maxLength.length()));


    }


}



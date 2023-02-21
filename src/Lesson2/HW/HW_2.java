package Lesson2.HW;

import java.util.Scanner;

import static java.lang.System.in;

public class HW_2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(in);
        System.out.println("Enter the period of the year: ");
        int period = scanner.nextInt();
        if (period == 1)
        {
            System.out.println("Winter");
        }
        else if (period == 2)
        {
            System.out.println("Spring");
        }
        else if (period == 3)
        {
            System.out.println("Summer");
        }
        else {
            System.out.println("Autumn");
        }

    }
}

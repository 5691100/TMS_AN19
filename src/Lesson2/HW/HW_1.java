package Lesson2.HW;

import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print ("Enter the time of the year: ");
        int period = scanner.nextInt();
        switch (period) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Autumn");
                break;

        }

    }
}

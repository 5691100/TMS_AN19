package Lesson5.Adds;

import java.util.Arrays;
import java.util.Scanner;

public class Adds_7 {
    public static void main(String[] args) {
        Student[] students = new Student[12];
        students[0] = new Student("Tom", 1, 6);
        students[1] = new Student("Bob", 1, 7);
        students[2] = new Student("Joe", 1, 3);
        students[3] = new Student("Jim", 1, 2);
        students[4] = new Student("Dan", 2, 4);
        students[5] = new Student("Bill", 2, 1);
        students[6] = new Student("John", 2, 3);
        students[7] = new Student("Jill", 2, 8);
        students[8] = new Student("Ben", 3, 1);
        students[9] = new Student("Drew", 3, 1);
        students[10] = new Student("Ed", 3, 1);
        students[11] = new Student("Greg", 3, 1);

        int menu = 0;

        while (menu != 5) {

            System.out.println("Choose the option: 1. Weakest group; 2. Weakest students; 3. All students; 4. Group; 5. Exit");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextInt();
            switch (menu) {
                case 1 -> {
                    int weakestGroupScore = Integer.MAX_VALUE;
                    int weakestGroupNumber = 0;
                    int n = 1;
                    while (n < 4) {
                        int groupScore = 0;
                        for (int i = 0; i < 12; i++) {
                            if (students[i].group == n) {
                                groupScore += students[i].mark;
                            }
                        }
                        if (groupScore < weakestGroupScore) {
                            weakestGroupNumber = n;
                            weakestGroupScore = groupScore;
                        }
                        n++;
                    }
                    System.out.println("The weakest group is: " + weakestGroupNumber);
                }
                case 2 -> {
                    for (int i = 0; i < 12; i++) {
                        if (students[i].mark < 4) {
                            students[i].displayInfo();
                        }
                    }
                }
                case 3 -> {
                    for (int i = 0; i < 12; i++) {
                        students[i].displayInfo();
                    }
                }
                case 4 -> {
                    System.out.println("Enter the group number: ");
                    Scanner sc2 = new Scanner(System.in);
                    int group = sc2.nextInt();
                    for (int i = 0; i < 12; i++) {
                        if (students[i].group == group) {
                            students[i].displayInfo();
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}

class Student {
    String name;
    int group;
    int mark;

    Student(String n, int g, int m) {
        name = n;
        group = g;
        mark = m;
    }

    void displayInfo() {
        System.out.printf("Name: %s\tGroup: %d\tMark: %d\n", name, group, mark);
    }
}
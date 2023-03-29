package Lesson12.HW.HW3;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {

        Map<String, Float> students = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int option = 1;
        while (option>0&&option<5) {
            System.out.println("Please choose the option: 1. Add student; 2. Print all students; 3. Print number of students; " +
                    "4. Print the worst student. Other number to exit.");
            try {
                option = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong input: " +e);
                break;
            }

            switch (option) {
                case 1: {
                    System.out.println("Please, enter name and mark of the student (format: Student,Mark): ");
                    String student = sc.next();
                    String[] studentSplit = student.split(",");
                    Float studentMark = null;
                    try {
                        studentMark = Float.valueOf(studentSplit[1]);
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong input: " + e);
                        break;
                    }
                    students.put(studentSplit[0], studentMark);
                    break;
                }
                case 2: {
                    for(Map.Entry<String,Float> student: students.entrySet()) {
                        System.out.printf("Name: %s\tMark: %f\n", student.getKey(), student.getValue());
                    }
                    break;
                }
                case 3: {
                    System.out.println(students.size());
                    break;
                }
                case 4: {
                    Float minMark = Float.MAX_VALUE;
                    Map.Entry<String,Float> worstStudent = null;
                    for (Map.Entry<String,Float> student: students.entrySet()) {
                        if (student.getValue()<minMark) {
                            minMark = student.getValue();
                            worstStudent = student;
                        }
                    }
                    System.out.printf("Name: %s\tMark: %f\n", worstStudent.getKey(), worstStudent.getValue());
                    break;
                }
            }
        }
    }
}

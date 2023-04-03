package Lesson13.HW.HW2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentNames {
    public static void main(String[] args) {
        List<String> students = initStudents();
        System.out.println("Students: " + students);

        System.out.println("Please, insert the name: ");
        Scanner sc = new Scanner(System.in);
        String nameNew = sc.nextLine();

        long amount = students.stream()
                .filter(name -> name.toLowerCase().equals(nameNew.toLowerCase()))
                .count();
        System.out.println("Amount of chosen name: " + amount);

        List<String> firstLetterA = students.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("Names started from A: " + firstLetterA);

        List<String> firstElement = students.stream()
                .sorted()
                .limit(1)
                .collect(Collectors.toList());
        System.out.println("First element: " + firstElement);


    }

    private static List<String> initStudents () {
        List<String> students = new ArrayList<>();
        students.add("Ivan");
        students.add("Armen");
        students.add("ivan");
        students.add("Andrew");
        students.add("Victor");
        students.add("Ken");
        return students;
    }
}

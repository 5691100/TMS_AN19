package Lesson13.HW.HW1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collection {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert number of elements:");
        int length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            input.add((int) (Math.random() * 10));
        }

        System.out.println("Initial list: " + input);

        List<Integer> output1 = input.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Without doubles: " + output1);

        List<Integer> output2 = input.stream()
                .limit(17)
                .skip(6)
                .filter(number -> number%2 == 0)
                .collect(Collectors.toList());
        System.out.println("From 7 to 17: " + output2);

        List<Integer> output3 = input.stream()
                .map(n -> n*2)
                .collect(Collectors.toList());
        System.out.println("X2: " + output3);

        List<Integer> output4 = input.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("First 4 sorted: " + output4);

        long output5 = input.stream()
                .count();
        System.out.println("Number of elements: " + output5);

        Optional<Integer> output6 = input.stream()
                .reduce((number1,number2) -> number1+number2);

        int sum = output6.get();
        System.out.println("Average: " + sum/output5);
    }
}

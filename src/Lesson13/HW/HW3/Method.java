package Lesson13.HW.HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert number: ");
        int number = sc.nextInt();
        System.out.println("Please insert string: ");
        String str = sc.next();
        System.out.println("Please insert type of logic: ");
        int type = sc.nextInt();

        Method method = new Method();
        System.out.println("Output: " + method.checkLogic(type,number,str).getOutput());
    }

    private FunctionalInterface checkLogic(int type, int number, String str) {
        if (type == 2) {
            FunctionalInterface<Integer> functionalInterface;
            functionalInterface = () -> {
                int factorial = 1;
                for (int i = 1; i < number + 1; i++) {
                    factorial *= i;
                }
                return factorial;
            };
            return functionalInterface;
        } else if (type == 1) {
            FunctionalInterface<String> functionalInterface;
            functionalInterface = () -> {
                if (str == null || str.equals("")) {
                    return str;
                }
                List<Character> list = new ArrayList<Character>();
                for (char c: str.toCharArray()) {
                    list.add(c);
                }
                Collections.reverse(list);
                StringBuilder builder = new StringBuilder(list.size());
                for (Character c: list) {
                    builder.append(c);
                }
                return builder.toString();
            };
            return functionalInterface;
        } else {
            FunctionalInterface<String> functionalInterface;
            functionalInterface = () -> "Wrong input!";
            return functionalInterface;
        }
    }
}

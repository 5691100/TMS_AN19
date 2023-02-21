package Lesson2.Adds;

public class Adds_1 {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        System.out.print(first + " ");
        System.out.print(second + " ");
        int next = 0;
        for (int i=0; i<8; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}

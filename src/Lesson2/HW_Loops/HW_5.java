package Lesson2.HW_Loops;

public class HW_5 {
    public static void main(String[] args) {
        int number = 0;
//        for (int i=1; i<11; i++) {
//            if (i != 10) {
//                System.out.print(number + ", ");
//            } else {
//                System.out.print(number + ".");
//            }
//            number -= 5;
//        }
        int i = 1;
        while (i<10) {
            System.out.print(number + ", ");
            number -= 5;
            i++;
        }
        System.out.print(number + ".");
    }
}

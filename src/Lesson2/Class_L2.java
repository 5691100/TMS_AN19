package Lesson2;

public class Class_L2 {

    public static void main(String[] args) {

        int i = 10;
        int sum = 0;
        while (i<56) {
//            if (i%2==0) {
//                sum += i;
//            }
//            i++;
            sum += i;
            i += 2;
        }

        System.out.println("Sum = "+sum);
        System.out.println();

        for (int j=1; j<11; j++) {
            switch (j) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
            }
        }
    }
}

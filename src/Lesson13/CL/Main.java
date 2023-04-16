package Lesson13.CL;

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = (x, y) ->
        {
            System.out.println("x: " +x + ", y: " +y);
            return x+y;
        };

        int sum = myFunctionalInterface.calculate(10,20);
        System.out.println(sum);

    }
}

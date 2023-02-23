package Lesson5;

import java.util.Arrays;

public class Class_2_L5 {
    public static void main(String[] args) {
        int [][] arr1 = {{1,2,5}, {5,6,8}, {3,6,7}};
        int sum = 0;
        for (int i = 0; i<arr1.length;i++){
            for (int j = 0; j< arr1[i].length;j++){
                if (i==j) {
                    sum += arr1[i][j];
                }
            }
            System.out.println(Arrays.toString(arr1[i]));
        }
        System.out.println("Sum: " + sum);

    }
}

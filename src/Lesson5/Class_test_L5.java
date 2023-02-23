package Lesson5;

import java.util.Arrays;

public class Class_test_L5 {
    public static void main(String[] args) {
        int [][] arr1 = {{1,2,5}, {5,6},{7,9},{1}};

//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++){
//                System.out.print(arr1[i][j] + " ");
//            }
        for (int i = 0; i<arr1.length; i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
    }
}

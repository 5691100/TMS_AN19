package Lesson5.Adds;

import java.util.Arrays;

public class Adds_2 {
    public static void main(String[] args) {
        int [][] arr1 = {{1,0,0,0}, {0,1,0,0}, {0,0,0,0}};
        int [][] arr2 = {{1,2,3}, {1,1,1}, {0,0,0}, {2,1,0}};

        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i<arr1.length;i++){
            for (int j = 0; j<arr2[i].length;j++) {
                for (int k = 0; k < 0; k++) {
                    sum = sum + arr1[i][j] * arr2[j][0];
                    sum1 = sum1 + arr1[i][j] * arr2[j][1];
                    sum2 = sum2 + arr1[i][j] * arr2[j][2];
                }

            }
            System.out.print(sum + " " + sum1 + " " + sum2);
            System.out.println();


        }

    }
}

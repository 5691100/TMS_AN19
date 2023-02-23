package Lesson5.HW;

import java.util.Scanner;

public class HW_0 {
    public static void main(String[] args) {
        int [][][] arr1 = {{{1,2,5}, {5,6,8}, {3,6,7}}};
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i<arr1.length;i++){
            for (int j = 0; j< arr1[i].length;j++){
                for (int n = 0; n < arr1[i][j].length;n++) {
                arr1[i][j][n] += number;
                System.out.print(arr1[i][j][n] + " ");
                }
                System.out.println();
            }

        }

    }
    }


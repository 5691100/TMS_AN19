package Lesson6.HW;

import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.addCash();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter cash request: ");
        int cashRequest = sc.nextInt();
        System.out.println("Withdrawal check: " + atm.withdrawalCheck(cashRequest));
        if (atm.withdrawalCheck(cashRequest)) {
            atm.billsCounter(cashRequest).displayInfo();
        }



    }
}

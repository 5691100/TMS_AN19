package Lesson6.HW;

import java.util.Scanner;

public class ATM {
    int twenty;
    int fifty;
    int hundred;

    public ATM() {
    }

    void addCash() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert $20 bills: ");
        this.twenty = sc.nextInt();
        System.out.println("Please, insert $50 bills: ");
        this.fifty = sc.nextInt();
        System.out.println("Please, insert $100 bills: ");
        this.hundred = sc.nextInt();
    }

    public boolean withdrawalCheck(int cashRequest) {
        return cashRequest <= twenty * 20 + fifty * 50 + hundred * 100 &&
                (cashRequest % 20 == 0 || cashRequest % 50 == 0 || cashRequest % 100 == 0);
    }

    public ATM(int twenty, int fifty, int hundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
    }

    public ATM billsCounter(int cashRequest) {
        int billsCounter = 0;
        if (cashRequest >= 100) {
            billsCounter = (cashRequest - cashRequest % 100) / 100;
            if (billsCounter<=hundred) {
                hundred = billsCounter;
            }
            cashRequest -= hundred * 100;
        } else {
            hundred = 0;
        }
        if (cashRequest >= 50) {
            billsCounter = (cashRequest - cashRequest % 50) / 50;
            if (billsCounter<=hundred) {
                hundred = billsCounter;
            }
            cashRequest -= fifty * 50;
        } else {
            fifty = 0;
        }
        twenty = cashRequest / 20;
        ATM atm = new ATM(twenty, fifty, hundred);
        return atm;
    }

    void displayInfo () {
        System.out.printf("$100 bills: %s\t$50 bills: %s\t$20 bills: %s\n", hundred, fifty, twenty);
    }
}

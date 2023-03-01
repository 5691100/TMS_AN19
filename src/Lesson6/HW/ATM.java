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
        if (cashRequest > twenty * 20 + fifty * 50 + hundred * 100 || cashRequest % 10 != 0 || cashRequest == 10 || cashRequest == 30) {
            return false;
        } else {
            int num20 = 0;
            int num50 = 0;
            int num100 = 0;
            if (cashRequest >= 100) {
                if (cashRequest % 100 < 50) {
                    if ((cashRequest % 100) % 20 != 0) {
                        num100 = (cashRequest - cashRequest % 100) / 100 - 1;
                        num50 = 1;
                        num20 = (cashRequest % 100 + 50) / 20;
                    } else {
                        num100 = (cashRequest - cashRequest % 100) / 100;
                        num50 = 0;
                        num20 = (cashRequest % 100 + 50) / 20;
                    }
                } else {
                    if ((cashRequest % 100) % 20 == 0) {
                        num100 = (cashRequest - cashRequest % 100) / 100;
                        num50 = 0;
                        num20 = (cashRequest % 100) / 20;
                    } else {
                        num100 = (cashRequest - cashRequest % 100) / 100;
                        num50 = 1;
                        num20 = (cashRequest % 100 - 50) / 20;
                    }
                }
            } else if (cashRequest >= 50) {
                if (cashRequest % 20 == 0) {
                    num100 = 0;
                    num50 = 0;
                    num20 = cashRequest / 20;
                } else {
                    num100 = 0;
                    num50 = 1;
                    num20 = (cashRequest - 50) / 20;
                }
            } else {
                num100 = 0;
                num50 = 0;
                num20 = cashRequest / 20;
            }
            int add50 = 0;
            int add20 = 0;
            if (num100 <= hundred) {
                hundred = num100;
            } else {
                add50 = num100 - hundred;
                }
            if (num50 + 2 * add50 <= fifty) {
                fifty = num50 + add50 * 2;
            } else {
                add20 = num50 + add50 * 2 - fifty;
                if ((add20 % 50) % 2 != 0) {
                    return false;
                }
            }
            twenty = (int) (num20 + add20 * 2.5);
            return true;
        }
    }

    public ATM(int twenty, int fifty, int hundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
    }

    public ATM billsCounter(int cashRequest) {
        ATM atm = new ATM(twenty, fifty, hundred);
        return atm;
    }

    void displayInfo() {
        System.out.printf("$100 bills: %s\t$50 bills: %s\t$20 bills: %s\n", hundred, fifty, twenty);
    }
}

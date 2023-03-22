package Lesson10.HW.HW_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert number of the document: ");
        String documentNumber = sc.next();

        DocumentNumber document = new DocumentNumber();

        DocumentNumber.getFirst2Blocks4Numbers(documentNumber);
        DocumentNumber.replaceBlock3(documentNumber);
        DocumentNumber.getAllLettersLowerCase(documentNumber);
        DocumentNumber.getAllLettersUpperCase(documentNumber);
        DocumentNumber.getABC(documentNumber);
        DocumentNumber.checkStart555(documentNumber);






    }
}

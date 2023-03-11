package Lesson8.HW_Documents.Register;

import Lesson8.HW_Documents.Contract;

public class Register {

    Contract[] contracts = new Contract[10];

    public Register() {
    }

    public void saveDoc(Contract contract, int number) {
        contracts[number] = contract;
        System.out.println("Information is saved!");
    }

    public void printDoc(int number) {
        for (int i = 0; i < contracts.length; i++) {
            if (contracts[i].getDocNumber() == number) {
                contracts[i].ContractPrint();
                break;
            }
        }
    }

}

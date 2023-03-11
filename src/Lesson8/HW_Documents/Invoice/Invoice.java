package Lesson8.HW_Documents.Invoice;

import Lesson8.HW_Documents.Contract;

import java.util.Date;

public class Invoice extends Contract {
    Date docDate;
    Double finalSum;
    String deptCode;

    public Invoice(int docNumber, Date docDate, Double finalSum, String deptCode) {
        super(docNumber);
        this.docDate = docDate;
        this.finalSum = finalSum;
        this.deptCode = deptCode;
    }

    public Invoice(int docNumber) {
        super(docNumber);
    }

    @Override
    public void ContractPrint() {
        System.out.printf("Number of doc: %s\tDate of doc: %s\tFinal sum: %s\tDepartment code: %s\n", super.getDocNumber(), docDate, finalSum, deptCode);
    }
}

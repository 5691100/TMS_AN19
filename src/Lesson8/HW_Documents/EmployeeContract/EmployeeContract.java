package Lesson8.HW_Documents.EmployeeContract;

import Lesson8.HW_Documents.Contract;

import java.util.Date;

public class EmployeeContract extends Contract {
    Date docDate;
    Date docEndDate;
    String employeeName;

    public EmployeeContract(int docNumber, Date docDate, Date docEndDate, String employeeName) {
        super(docNumber);
        this.docDate = docDate;
        this.docEndDate = docEndDate;
        this.employeeName = employeeName;
    }

    public EmployeeContract(int docNumber) {
        super(docNumber);
    }

    @Override
    public void ContractPrint() {
        System.out.printf("Number of doc: %s\tDate of doc: %s\tDate of doc end: %s\tEmployee name: %s\n", super.getDocNumber(), docDate, docEndDate, employeeName);
    }
}

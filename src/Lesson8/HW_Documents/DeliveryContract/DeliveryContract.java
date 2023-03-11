package Lesson8.HW_Documents.DeliveryContract;

import Lesson8.HW_Documents.Contract;

import java.util.Date;

public class DeliveryContract extends Contract {
    Date docDate;
    String typeOfGoods;
    Double amountOfGoods;

    public DeliveryContract(int docNumber, Date docDate, String typeOfGoods, Double amountOfGoods) {
        super(docNumber);
        this.docDate = docDate;
        this.typeOfGoods = typeOfGoods;
        this.amountOfGoods = amountOfGoods;
    }

    public DeliveryContract() {
    }

    @Override
    public void ContractPrint() {
        System.out.printf("Number of doc: %s\tDate of doc: %s\tType of goods: %s\tAmount of goods: %s\n", super.getDocNumber(), docDate, typeOfGoods, amountOfGoods);
    }
}


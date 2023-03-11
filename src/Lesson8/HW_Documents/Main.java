package Lesson8.HW_Documents;

import Lesson8.HW_Documents.DeliveryContract.DeliveryContract;
import Lesson8.HW_Documents.EmployeeContract.EmployeeContract;
import Lesson8.HW_Documents.Invoice.Invoice;
import Lesson8.HW_Documents.Register.Register;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(1212121212121L);
        Date date2 = new Date(1212121212121L);
        Contract contract1 = new DeliveryContract(1, date1, "Cars", 200.0);
        Contract contract2 = new EmployeeContract(2, date1, date2, "Tom");
        Contract contract3 = new Invoice(3, date1, 1000000.0, "1A24B");

        Register register = new Register();
        register.saveDoc(contract1,0);
        register.saveDoc(contract2,1);
        register.saveDoc(contract3,2);
        register.printDoc(3);
        register.printDoc(1);
        register.printDoc(2);


    }
}

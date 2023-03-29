package Lesson9.HW.Parking;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate dateBMW = LocalDate.of(2015, 3, 23);
        LocalDate dateFord = LocalDate.of(2017, 2, 23);
        LocalDate dateMers = LocalDate.of(2018, Month.MARCH, 23);
        LocalDate dateToyota = LocalDate.of(2013, Month.MARCH, 23);
        LocalDate dateSubaru = LocalDate.of(2011, Month.MARCH, 23);
        LocalDate dateOpel = LocalDate.of(2005, Month.MARCH, 23);
        LocalDate dateMustang = LocalDate.of(2010, Month.MARCH, 23);


        Car bmw = new Car("BMW", "ADBBHA18NJKDBW", dateBMW);
        Car ford = new Car("Ford", "ADBBHA18NJKDBW", dateFord);
        Car mers = new Car("Mersedes", "ADBBHA18NJKDBW", dateMers);
        Car toyota = new Car("Toyota", "ADBBHA18NJKDBW", dateToyota);
        Car subaru = new Car("Subaru", "ADBBHA18NJKDBW", dateSubaru);
        Car opel = new Car("Opel", "ADBBHA18NJKDBW", dateOpel);
        Car mustang = new Car("Mustang", "ADBBHA18NJKDBW", dateMustang);


        Parking parking = new Parking();
        parking.setCars(bmw,ford,mers,toyota,subaru,opel,mustang);
        String checkedCar = null;

        try {
            checkedCar = parking.checkCar("ADBBHA18NJKDBW");
            System.out.println(checkedCar);
        } catch (NullPointerException e) {
            System.out.println("Wrong vin!");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert number of years: ");
        int years = sc.nextInt();
        System.out.println("Number of cars older then " + years + " years is: " + parking.countByYears(years));
    }
}

package Lesson7.HW_Clinic;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {

        Therapist therapist = new Therapist();
        Surgeon surgeon = new Surgeon();
        Dentist dentist = new Dentist();

        Scanner sc = new Scanner(System.in);
        ThreatmentMethod method = new ThreatmentMethod();
        System.out.println("Please, insert the treatment method: ");
        method.numberMethod = sc.nextInt();
        Patient patient = new Patient("Tom", method);
        patient.setDoctor(surgeon, dentist, therapist, method.numberMethod).treatment();

    }

}



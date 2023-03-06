package Lesson7.HW_Clinic;

public class Patient {
    private String name;
    private ThreatmentMethod method;

    public Patient(String name, ThreatmentMethod method) {
        this.name = name;
        this.method = method;
    }

    public Doctor setDoctor(Doctor surgeon, Doctor dentist, Doctor therapist, int numberOfMethod) {
        Doctor doctor = new Doctor();
        switch (numberOfMethod) {
            case 1: {
                doctor = surgeon;
                break;
            }
            case 2: {
                doctor = dentist;
                break;
            }
            default: {
                doctor = therapist;
                break;
            }
        }
        return doctor;
    }
}



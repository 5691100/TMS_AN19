package Lesson7.Class_DaysOfWeek;

public class Days_of_week {

    public enum Days {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday;


        public void printDays() {
            if (this == Saturday || this == Sunday) {
                System.out.println(this + " - Weekend");
            } else {
                System.out.println(this + " - Workday");
            }
        }
    }
}




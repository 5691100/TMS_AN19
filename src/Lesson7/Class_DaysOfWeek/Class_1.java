package Lesson7.Class_DaysOfWeek;

import static Lesson7.Class_DaysOfWeek.Days_of_week.*;

// Создайте ENUM со всеми днями недели. Сделайте метод в классе,
//который выведет все дни недели в консоль с указанием рабочий это
//день или выходной

public class Class_1 {
    public static void main(String[] args) {

        for (Days day: Days.values()) {
            day.printDays();
        }

    }
}

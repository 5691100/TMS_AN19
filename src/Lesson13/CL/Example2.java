package Lesson13.CL;

import java.util.List;
import java.util.stream.Collectors;

import static Lesson13.CL.Example.initStudents;

public class Example2 {
    public static void main(String[] args) {
        List<Student> students = initStudents();

        students.stream()
                .collect(Collectors.toMap(student -> student,
                        student -> student.getMarks()
                                .stream()
                                .mapToDouble(mark -> mark)
                                .average()
                                .getAsDouble()))
                .entrySet().stream()
                .max((entry1, entry2) ->
                {
                    if (entry1.getValue() > entry2.getValue()) {
                        return 1;
                    } else if (entry1.getValue().equals(entry2.getValue())) {
                        return 0;
                    } else {
                        return -1;
                    }
                });
//                .isPresent(value ->
//                        System.out.println("Max mark avg = " + value.getKey() + ", avg mark =  " + value.getValue()));
//    }
    }
}

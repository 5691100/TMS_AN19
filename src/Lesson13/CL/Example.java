package Lesson13.CL;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example
{
    public static void main(String[] args) {
        List<Student> students = initStudents();

        Map<Student, Double> avgMap = students.stream()
                .collect(Collectors.toMap(student -> student,
                        student -> student.getMarks()
                                .stream()
                                .mapToDouble(mark -> mark)
                                .average()
                                .getAsDouble()));

        Optional<Map.Entry<Student, Double>> max = avgMap.entrySet().stream()
                        .max((entry1, entry2) ->
                        {
                            if (entry1.getValue() > entry2.getValue())
                            {
                                return 1;
                            }
                            else if (entry1.getValue().equals(entry2.getValue()))
                            {
                                return 0;
                            }
                            else
                            {
                                return -1;
                            }
                        });
        if (max.isPresent())
        {
            System.out.println("Max mark avg = " + max.get().getKey() + ", avg mark =  " + max.get().getValue());
        }

    }
    public static List<Student> initStudents () {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Slava", "01", List.of(5f,6.3f,8.9f)));
        students.add(new Student("Roman", "02", List.of(4f,7.8f,5f)));
        students.add(new Student("Angelina", "01", List.of(2f,10f,6.9f)));
        students.add(new Student("Dmitry", "02", List.of(9f,5.4f,7f)));
        return students;
    }
}

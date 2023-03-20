package Lesson11.HW.HW2;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "01"));
        students.add(new Student("Bill", "01"));
        students.add(new Student("Peter", "02"));
        students.add(new Student("Vera", "02"));
        students.add(new Student("Bob", "02"));
        students.add(new Student("Jack", "02"));
        students.add(new Student("Jim", "03"));

        List<GroupAmount> groupAmounts = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            GroupAmount groupAmount = setAmount(groupAmounts, students.get(i).getGroup());
            if (groupAmount == null) {
                GroupAmount newGroupAmount = new GroupAmount(students.get(i).getGroup(), 1);
                groupAmounts.add(newGroupAmount);
            } else {
                int currentNumber = groupAmount.getStudentAmount();
                groupAmount.setStudentAmount(currentNumber+1);
            }
        }

        int minNumber = Integer.MAX_VALUE;
        int minIndex = -1;

        for(int i = 0; i< groupAmounts.size(); i++) {
            if (groupAmounts.get(i).getStudentAmount()<minNumber) {
                minNumber = groupAmounts.get(i).getStudentAmount();
                minIndex = i;
            }
        }

        for (int i = 0; i<students.size(); i++) {
            if (students.get(i).getGroup().equals(groupAmounts.get(minIndex).getGroup())) {
                System.out.println(students.get(i));
            }
        }
    }

    private static GroupAmount setAmount(List<GroupAmount> groupAmounts, String group)
    {
        for (GroupAmount groupAmount: groupAmounts) {
            if (groupAmount.getGroup().equals(group)) {
                return groupAmount;
            }
        }
        return null;
    }

}

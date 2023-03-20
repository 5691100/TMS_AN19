package Lesson11.Example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Slava", "01", 8f));
        students.add(new Student("Roman", "02", 7f));
        students.add(new Student("Angelina", "01", 5f));
        students.add(new Student("Ivan", "02", 7f));
        students.add(new Student("Sasha", "02", 4f));
        students.add(new Student("Dmitry", "03", 9f));

        List<GroupMark> groupMarks = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            GroupMark groupMark = getByGroup(groupMarks, students.get(i).getGroup());
            if (groupMark == null) {
                GroupMark newGroupMark = new GroupMark(students.get(i).getGroup(), 1, students.get(i).getMark());
                groupMarks.add(newGroupMark);
            } else {
                int currentAmount = groupMark.getStudentsAmount();
                float currentMark = groupMark.getMark();
                groupMark.setStudentsAmount(currentAmount + 1);
                groupMark.setMark(currentMark + students.get(i).getMark());

            }
        }

        float minAvg = Float.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < groupMarks.size(); i++) {
            float currentAvg = groupMarks.get(i).getMark() / groupMarks.get(i).getStudentsAmount();
            if (currentAvg < minAvg) {
                minAvg = currentAvg;
                minIndex = i;

            }
        }

        String minGroup = groupMarks.get(minIndex).getGroup();
        System.out.println(minGroup);

        for (Student student: students)
        {
            if (student.getGroup().equals(minGroup))
            {
                System.out.println(student);
            }
        }

    }

    private static GroupMark getByGroup(List<GroupMark> groupMarks, String group) {
        for (GroupMark groupMark : groupMarks) {
            if (groupMark.getGroup().equals(group)) {
                return groupMark;
            }
        }
        return null;
    }
}
